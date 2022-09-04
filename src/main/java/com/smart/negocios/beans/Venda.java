package com.smart.negocios.beans;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Produto> produtos;
    private ContaCliente cliente;

    public Venda(ContaCliente cliente) {
        this.produtos = new ArrayList<>();
        this.cliente = cliente;
    }

    public double calcularTotal(){
        double total = 0;
        for(Produto produto: produtos){
            total += produto.getPreco();
        }
        return total;
    }
}
