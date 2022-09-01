package com.smart.negocios.beans;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private double salario;
    private String endereco;

    public Funcionario(String nome, String cpf, String telefone, String email, LocalDate dataNascimento, double salario, String endereco) {
        super(nome, cpf, telefone, email, dataNascimento);
        this.salario = salario;
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
