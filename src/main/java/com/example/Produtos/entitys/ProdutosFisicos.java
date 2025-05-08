package com.example.Produtos.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produtos-fisicos")
@Getter
@Setter
public class ProdutosFisicos extends Produto {

    private double peso;
    private String cor;

    public ProdutosFisicos(){
        super();
    }

    public ProdutosFisicos(String nome, double preco, double peso, String cor) {
        super(nome, preco);
        this.peso = peso;
        this.cor = cor;
    }
    
}
