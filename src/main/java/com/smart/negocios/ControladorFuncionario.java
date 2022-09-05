package com.smart.negocios;

import com.smart.dados.IRepositorio;
import com.smart.dados.Repositorio;
import com.smart.negocios.beans.Funcionario;

public class ControladorFuncionario {

    private IRepositorio<Funcionario> repositorioFuncionarios;
    private static ControladorFuncionario instance;

    Funcionario funcionario;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ControladorFuncionario() {
        this.repositorioFuncionarios = new Repositorio<>("funcionarios.dat");
    }

    public static ControladorFuncionario getInstance(){
        if (instance == null)
            instance = new ControladorFuncionario();
        return instance;
    }

    public void cadastrar(Funcionario f) {
        this.repositorioFuncionarios.cadastrar(f);
    }

    public void listar(){
        this.repositorioFuncionarios.listar();
    }

    public void remover(Funcionario f) {
        this.repositorioFuncionarios.remover(f);
    }

    public void atualizar(Funcionario f) {
        this.repositorioFuncionarios.atualizar(f);
    }

    public Funcionario buscar(String cpf){
        return null;
    }
}
