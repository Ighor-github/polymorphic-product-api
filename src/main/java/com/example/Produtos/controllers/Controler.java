package com.example.Produtos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Produtos.DTOs.DTOProdutoVirtual;
import com.example.Produtos.DTOs.DTOProdutosFisicos;
import com.example.Produtos.entitys.Produto;
import com.example.Produtos.entitys.ProdutosFisicos;
import com.example.Produtos.entitys.ProdutosVirtuais;
import com.example.Produtos.services.Services;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.websocket.server.PathParam;

@RestController("/api")
public class Controler {
    
    @Autowired
    Services service;

    @Operation(summary = "Pegar todos os produtos")
    @GetMapping("/")
    public List<Produto> pegaProdutos() {
        return service.pegandoProdutos();
    }

    @Operation(summary = "Pegar todos os produtos fisicos")
    @GetMapping("/pegaprodutosfisicos")
    public List<ProdutosFisicos> pegaProdutosFisicos() {
        return service.pegarProdutosFisicos();
    }

    @Operation(summary = "Pegar os produtos por ID")
    @GetMapping("/pegarprodutoporid/{id}")
    public Produto pegaProdutoId(@PathParam(value = "id") long id) {
        return service.pegandoProdutosPorId(id);
    }

    @Operation(summary = "Pegar todos os produtos virtuais")
    @GetMapping("/pegaprodutosvirtuais")
    public List<ProdutosVirtuais> pegarProdutosVirtuais() {
        return service.pegarProdutosVirtuais();
    }

    @Operation(summary = "Cadastrar produtos fisicos")
    @PostMapping("/cadastroFisco")
    public ResponseEntity<?> cadastraProdutosFisicos(@RequestBody DTOProdutosFisicos dto) {        
        return service.cadastrarProdutoFisico(dto);
    }

    @Operation(summary = "Cadastrar produtos virtuais")
    @PostMapping("/cadastroVirtual")
    public ResponseEntity<?> cadastrarProdutoVirtual(@RequestBody DTOProdutoVirtual dto) {
        return service.cadastrarProdutoVirtual(dto);
    }
}
