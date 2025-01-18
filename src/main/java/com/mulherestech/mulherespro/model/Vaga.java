package com.mulherestech.mulherespro.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "vagas")
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String empresa;

    @Column(nullable = false)
    private String localizacao;

    public Vaga(String titulo, String descricao, String localizacao, String empresa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.empresa = empresa;
    }

    public Vaga() {
        // Construtor padrão para JPA
    }
}
