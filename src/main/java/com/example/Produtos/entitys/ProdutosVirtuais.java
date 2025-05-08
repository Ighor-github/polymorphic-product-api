package com.example.Produtos.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produtos-virtuais")
@Getter
@Setter
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
