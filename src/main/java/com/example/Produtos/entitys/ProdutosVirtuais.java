package com.example.Produtos.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos-virtuais")
public class ProdutosVirtuais extends Produto {

    private double duracao;
    private boolean renovacao;

    public ProdutosVirtuais(){
        super();
    }

    public ProdutosVirtuais(String nome, double preco, double duracao, boolean renovacao) {
        super(nome, preco);
        this.duracao = duracao;
        this.renovacao = renovacao;
    }
    
}
