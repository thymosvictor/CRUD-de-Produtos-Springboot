package com.bootcampjava.springapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.bootcampjava.springapp.dto.ProdutoRequestDto;
import com.bootcampjava.springapp.dto.ProdutoResponseDto;
import com.bootcampjava.springapp.service.ProdutoService;
@CrossOrigin(origins = "https://frontendproduto.vercel.app")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    //Usando @Valid para validar automaticamente os campos obrigatórios do Request DTO
    @PostMapping
    public ResponseEntity<ProdutoResponseDto> salvar(
            @Valid @RequestBody ProdutoRequestDto dto
    ) {
        ProdutoResponseDto response = service.salvar(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }

    @GetMapping
    public ResponseEntity<List<ProdutoResponseDto>> listar() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponseDto> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponseDto> atualizar(
            @PathVariable Long id,
            @Valid @RequestBody ProdutoRequestDto dto
    ) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();//
    }
}