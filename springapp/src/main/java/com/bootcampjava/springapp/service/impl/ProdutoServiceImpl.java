package com.bootcampjava.springapp.service.impl;


import java.util.List;
import java.util.stream.Collectors;

import com.bootcampjava.springapp.model.StatusProduto;
import org.springframework.stereotype.Service;

import com.bootcampjava.springapp.dto.ProdutoRequestDto;
import com.bootcampjava.springapp.dto.ProdutoResponseDto;
import com.bootcampjava.springapp.exception.ResourceNotFoundException;
import com.bootcampjava.springapp.mapper.ProdutoMapper;
import com.bootcampjava.springapp.model.Produto;
import com.bootcampjava.springapp.repository.ProdutoRepository;
import com.bootcampjava.springapp.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository repository;
    private final ProdutoMapper mapper;

    public ProdutoServiceImpl(ProdutoRepository repository, ProdutoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ProdutoResponseDto salvar(ProdutoRequestDto dto) {
        Produto produto = mapper.toEntity(dto);
        produto.setStatus(StatusProduto.DISPONIVEL);
        Produto salvo = repository.save(produto);
        return mapper.toResponseDto(salvo);
    }

    @Override
    public List<ProdutoResponseDto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProdutoResponseDto findById(Long id) {
        Produto produto = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Produto não encontrado")
                );
        return mapper.toResponseDto(produto);
    }

    @Override
    public ProdutoResponseDto update(Long id, ProdutoRequestDto dto) {
        Produto produto = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Produto não encontrado")
                );

        mapper.updateEntityFromDto(dto, produto);
        Produto atualizado = repository.save(produto);
        return mapper.toResponseDto(atualizado);
    }

    @Override
    public void delete(Long id) {
        Produto produto = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Produto não encontrado")
                );
        repository.delete(produto);
    }
}