package com.example.smart.negocios.beans;

import java.time.LocalDate;

public class ContaCliente extends Pessoa{
    private String id;
    private double credito;

    public ContaCliente(String nome, String cpf, String telefone, String email, LocalDate dataNascimento, String id, double credito) {
        super(nome, cpf, telefone, email, dataNascimento);
        this.id = id;
        this.credito = credito;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
