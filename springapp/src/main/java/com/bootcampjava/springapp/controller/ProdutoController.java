package com.bootcampjava.springapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.bootcampjava.springapp.dto.ProdutoRequestDto;
import com.bootcampjava.springapp.dto.ProdutoResponseDto;
import com.bootcampjava.springapp.service.ProdutoService;

//Chama o Service

@RestController
@RequestMapping("/produtos") // URL base para todos os endpoints deste controller
public class ProdutoController {

    private final ProdutoService service; // Dependência do service

    public ProdutoController(ProdutoService service) {
        this.service = service; // Injetando o service via construtor
    }

    //Usando @Valid para validar automaticamente os campos obrigatórios do Request DTO
    @PostMapping
    public ProdutoResponseDto salvar(@Valid @RequestBody ProdutoRequestDto dto) {
        return service.salvar(dto); // Chama o service para salvar o produto e retorna a resposta
    }

    @GetMapping
    public List<ProdutoResponseDto> listar() {
        return service.findAll(); // Retorna lista de todos os produtos
    }

    @GetMapping("/{id}")
    public ProdutoResponseDto buscarPorId(@PathVariable Long id) {
        return service.findById(id); // Busca produto pelo ID
    }

    @PutMapping("/{id}")
    public ProdutoResponseDto atualizar(
            @PathVariable Long id, // ID do produto a atualizar
            @Valid @RequestBody ProdutoRequestDto dto // Dados atualizados do produto
    ) {
        return service.update(id, dto); // Chama service para atualizar e retorna o produto atualizado
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id); // Chama service para deletar o produto
    }
}