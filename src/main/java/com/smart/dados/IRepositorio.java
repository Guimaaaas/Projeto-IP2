package com.smart.dados;

import java.util.List;

public interface IRepositorio<O> {

    void cadastrar(Object obj);
    List<Object> listar();
    void remover(Object obj);
    void atualizar(Object novoObj);

}
