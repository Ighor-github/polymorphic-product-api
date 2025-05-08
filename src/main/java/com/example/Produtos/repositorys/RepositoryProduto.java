package com.example.Produtos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Produtos.entitys.Produto;

import jakarta.persistence.Id;

public interface RepositoryProduto extends JpaRepository<Produto, Id> {
    Produto findById(long id);
}
