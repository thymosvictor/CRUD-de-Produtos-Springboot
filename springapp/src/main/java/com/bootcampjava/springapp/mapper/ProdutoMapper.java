package com.bootcampjava.springapp.mapper;

import org.springframework.stereotype.Component;
import com.bootcampjava.springapp.dto.ProdutoRequestDto;
import com.bootcampjava.springapp.dto.ProdutoResponseDto;
import com.bootcampjava.springapp.model.Produto;
import com.bootcampjava.springapp.model.StatusProduto;

@Component
public class ProdutoMapper {

    // Converte DTO de entrada para Entity
    public Produto toEntity(ProdutoRequestDto dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
        return produto;
    }

    // Converte Entity para DTO de resposta
    public ProdutoResponseDto toResponseDto(Produto produto) {
        return new ProdutoResponseDto(
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getStatus()
        );
    }

    public void updateEntityFromDto(ProdutoRequestDto dto, Produto produto) {
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
    }
}

