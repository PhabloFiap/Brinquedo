package com.cp2.brinquedo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name ="cp_brinquedo")
public class Brinquedo {
    @Id
    @GeneratedValue(strategy= SEQUENCE)
    private Long id;

    private String nome;

    private String classificacao;

    private float tamanho;
    private BigDecimal preco;

    public Brinquedo(String nome, String classificacao, float tamanho, BigDecimal preco) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.tamanho = tamanho;
        this.preco = preco;
    }

public Brinquedo(){

}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

}
