package com.bootcampjava.springapp.service;
// para definir o que o serviço faz: CRUD.
import java.util.List;
import com.bootcampjava.springapp.dto.ProdutoRequestDto;
import com.bootcampjava.springapp.dto.ProdutoResponseDto;

//SOLID aplicado:
// I - Interface Segregation: contrato claro
// D - Dependency Inversion: controller depende da interface

public interface ProdutoService {

    ProdutoResponseDto salvar(ProdutoRequestDto dto);
    List<ProdutoResponseDto> findAll();
    ProdutoResponseDto findById(Long id);
    ProdutoResponseDto update(Long id, ProdutoRequestDto dto);
    void delete(Long id);
}
