package com.smart.negocios.beans;

import java.time.LocalDate;
import java.time.Period;

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

    public boolean verificarValidade(){

        boolean validadeOk = false;

        LocalDate dataDeValidade = this.dataValidade;
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(hoje, dataDeValidade);
        //System.out.printf("%s", periodo.getDays());
        int dias = periodo.getDays();

        if(dias >= 0){

            validadeOk = true;
        }
        return validadeOk;
    }
}
