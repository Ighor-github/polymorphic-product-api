package com.example.Produtos.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "produto-super")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private double preco;

    public Produto(){
        
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
