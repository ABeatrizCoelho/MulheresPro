package com.mulherestech.mulherespro.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String localizacao;

    public Vaga(String titulo, String descricao, String localizacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.localizacao = localizacao;
    }

    public Vaga() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

}
