package com.mulherestech.mulherespro.controller;

import com.mulherestech.mulherespro.model.Vaga;
import com.mulherestech.mulherespro.repositorio.VagaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vagas")
@CrossOrigin(origins = "http://localhost:5173")
public class VagaController {

    @Autowired
    private VagaRepository vagaRepository;

    // Obter todas as vagas
    @GetMapping
    public List<Vaga> getAllVagas() {
        return vagaRepository.findAll();
    }

    // Obter vaga por ID
    @GetMapping("/{id}")
    public ResponseEntity<Vaga> getVagaById(@PathVariable Long id) {
        Optional<Vaga> vaga = vagaRepository.findById(id);
        return vaga.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Criar uma nova vaga
    @PostMapping
    public Vaga createVaga(@RequestBody Vaga vaga) {
        return vagaRepository.save(vaga);
    }

    // Atualizar uma vaga existente
    @PutMapping("/{id}")
    public ResponseEntity<Vaga> updateVaga(@PathVariable Long id, @RequestBody Vaga vagaDetails) {
        Optional<Vaga> vagaOptional = vagaRepository.findById(id);

        if (vagaOptional.isPresent()) {
            Vaga vaga = vagaOptional.get();
            vaga.setTitulo(vagaDetails.getTitulo());
            vaga.setDescricao(vagaDetails.getDescricao());
            vaga.setEmpresa(vagaDetails.getEmpresa());
            vaga.setLocalizacao(vagaDetails.getLocalizacao());
            return ResponseEntity.ok(vagaRepository.save(vaga));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Deletar uma vaga por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVaga(@PathVariable Long id) {
        Optional<Vaga> vaga = vagaRepository.findById(id);
        if (vaga.isPresent()) {
            vagaRepository.delete(vaga.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}