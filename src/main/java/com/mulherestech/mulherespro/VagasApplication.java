package com.mulherestech.mulherespro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mulherestech.mulherespro.service.VagaService;

@SpringBootApplication
public class VagasApplication implements CommandLineRunner {
    private final VagaService vagaService;

    public VagasApplication(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    public static void main(String[] args) {
        SpringApplication.run(VagasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        vagaService.listarVagas().forEach(System.out::println);
    }
}
