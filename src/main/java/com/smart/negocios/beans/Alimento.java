package com.smart.negocios.beans;

import java.time.LocalDate;

public class Alimento extends Produto{
    private LocalDate dataValidade;

    public Alimento(String nome, String marca, double preco, LocalDate dataValidade) {
        super(nome, marca, preco);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
