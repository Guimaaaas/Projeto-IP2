package com.smart.negocios.beans;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Produto> produtos;

    public Venda() {
        this.produtos = new ArrayList<>();
    }

    public double calcularTotal(){
        double total = 0;
        for(Produto produto: produtos){
            total += produto.getPreco();
        }
        return total;
    }
}
