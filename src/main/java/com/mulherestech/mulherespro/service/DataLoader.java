package com.mulherestech.mulherespro.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mulherestech.mulherespro.model.Vaga;

@Component
public class DataLoader implements CommandLineRunner {
    private final VagaService vagaService;

    public DataLoader(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Salvando vagas iniciais
        vagaService.salvarVaga(new Vaga("Desenvolvedor Java", "Criação de APIs", "Remoto", 7000.0));
        vagaService
                .salvarVaga(new Vaga("Analista de Dados", "Análise de grandes volumes de dados", "São Paulo", 8000.0));
    }
}
