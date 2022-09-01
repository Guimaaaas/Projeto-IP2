package com.example.smart.negocios.beans;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, String telefone, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade(){
        LocalDate dataHj = LocalDate.now();

        int idade = dataHj.getYear() - dataNascimento.getYear();

        if (dataHj.getMonthValue() < dataNascimento.getMonthValue())
            idade = idade - 1;
        else if(dataHj.getMonthValue() == dataNascimento.getMonthValue()) {
            if(dataHj.getDayOfMonth() < dataNascimento.getDayOfMonth()) {
                idade -= 1;
            }
        }
        return idade;
    }
}
