package com.example.Produtos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Produtos.entitys.ProdutosVirtuais;

import jakarta.persistence.Id;

public interface RepositoryProdutosVirtuais extends JpaRepository<ProdutosVirtuais, Id> {
    
}
