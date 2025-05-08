package com.example.Produtos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Produtos.entitys.ProdutosFisicos;

import jakarta.persistence.Id;

public interface RepositoryProdutosFisicos extends JpaRepository<ProdutosFisicos, Id> {
    
}