package com.mulherestech.mulherespro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mulherestech.mulherespro.model.Vaga;
import com.mulherestech.mulherespro.repositorio.VagaRepository;

@Service
public class VagaService {
    private final VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public List<Vaga> listarVagas() {
        return vagaRepository.findAll();
    }

    public Vaga salvarVaga(Vaga vaga) {
        return vagaRepository.save(vaga);
    }
}
