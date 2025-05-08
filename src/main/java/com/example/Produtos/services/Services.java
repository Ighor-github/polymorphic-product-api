package com.example.Produtos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Produtos.DTOs.DTOProdutoVirtual;
import com.example.Produtos.DTOs.DTOProdutosFisicos;
import com.example.Produtos.entitys.Produto;
import com.example.Produtos.entitys.ProdutosFisicos;
import com.example.Produtos.entitys.ProdutosVirtuais;
import com.example.Produtos.repositorys.RepositoryProduto;
import com.example.Produtos.repositorys.RepositoryProdutosFisicos;
import com.example.Produtos.repositorys.RepositoryProdutosVirtuais;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public final class Services {
    @Autowired
    RepositoryProduto repositoryProduto;

    @Autowired
    RepositoryProdutosFisicos repositoryProdutosFisicos;

    @Autowired
    RepositoryProdutosVirtuais repositoryProdutosVirtuais;

    public List<Produto> pegandoProdutos() {
        log.info("Pegando todos os produtos");
        return repositoryProduto.findAll();
    }

    public Produto pegandoProdutosPorId(long id) {
        log.info("Iniciando a busca de produtos por ID");
        return repositoryProduto.findById(id);
    }

    public List<ProdutosFisicos> pegarProdutosFisicos() {
        log.info("Pegando todos os produtos fisicos");
        return repositoryProdutosFisicos.findAll();
    }

    public List<ProdutosVirtuais> pegarProdutosVirtuais() {
        log.info("Pegando todos os produtos virtuais");
        return repositoryProdutosVirtuais.findAll();
    }

    public ResponseEntity<?> cadastrarProdutoFisico(DTOProdutosFisicos dto) {
        if (dto.getNome() == null ||
                dto.getCor() == null ||
                    dto.getPeso() == 0 ||
                        dto.getPreco() == 0) {
            log.error("Há dados não compativeis com o esperado durante o cadastro de produtos fisicos");
            return ResponseEntity.notFound().build();
        } else {
            Produto produto = new ProdutosFisicos(dto.getNome(), dto.getPreco(), dto.getPeso(), dto.getCor());
            repositoryProduto.save(produto);
            log.info("Produto fisico cadastrado");
            return ResponseEntity.created(null).build();
        }
    } 

    public ResponseEntity<?> cadastrarProdutoVirtual(DTOProdutoVirtual dto) {
        if (dto.getNome() == null ||
                dto.getPreco() == 0 ||
                    dto.getDuracao() == 0 ||
                        dto.isRenovou() == false) {
            log.error("Há dados não compativeis com o esperado durante o cadastro de produtos virtuais");
            return ResponseEntity.notFound().build();
        } else {
            Produto produto = new ProdutosVirtuais(dto.getNome(), dto.getPreco(),dto.getDuracao(), dto.isRenovou());
            repositoryProduto.save(produto);
            log.info("Produto virtual cadastrado");
            return ResponseEntity.created(null).build();
        }
    }
}
