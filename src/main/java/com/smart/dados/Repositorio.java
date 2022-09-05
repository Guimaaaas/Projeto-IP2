package com.smart.dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repositorio<T> implements IRepositorio<Object>{

    protected List<T> elementos;
    private String nomeArquivo;


    public Repositorio(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.elementos = new ArrayList<>();

        Object listaElementos = RepoFiles.lerDoArquivo(this.nomeArquivo);
        if (listaElementos != null && listaElementos instanceof List<?>){
            this.elementos = (List<T>) listaElementos;
        }

    }


    public void cadastrar(Object obj) {
        this.elementos.add((T) obj);
    }

    public List listar() {
        return Collections.unmodifiableList(this.elementos);
    }

    public void remover(Object obj) {
        this.elementos.remove(this.elementos.indexOf(obj));
    }

    public void atualizar(Object novoObj) {
        int indice = this.elementos.indexOf(novoObj);
        this.elementos.set(indice, (T) novoObj);
    }
}