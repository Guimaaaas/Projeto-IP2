package com.smart.negocios.beans;

import java.time.LocalDate;

public class Produto {
    private String nome;
    private String marca;
    private double preco;
    private LocalDate validade;

    public Produto(String nome, String marca, double preco, LocalDate validade) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
}
