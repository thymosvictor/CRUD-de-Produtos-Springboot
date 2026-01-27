package com.bootcampjava.springapp.service;

import java.util.List;
import java.util.stream.Collectors;
// implementa como o CRUD é feito
import org.springframework.stereotype.Service;
import com.bootcampjava.springapp.dto.ProdutoRequestDto;
import com.bootcampjava.springapp.dto.ProdutoResponseDto;
import com.bootcampjava.springapp.model.Produto;
import com.bootcampjava.springapp.model.StatusProduto;
import com.bootcampjava.springapp.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoServiceImpl(ProdutoRepository repository) {
        this.repository = repository;
    }


    //SALVAR/CRIAR
    @Override
    public ProdutoResponseDto salvar(ProdutoRequestDto dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
        produto.setStatus(StatusProduto.DISPONIVEL); // sempre inicializa como DISPONIVEL

        Produto salvo = repository.save(produto);

        return new ProdutoResponseDto(
                salvo.getId(),
                salvo.getNome(),
                salvo.getDescricao(),
                salvo.getPreco(),
                salvo.getStatus()
        );
    }

    //LISTAR TODOS
    @Override
    public List<ProdutoResponseDto> findAll() {
        return repository.findAll()
                .stream()
                .map(p -> new ProdutoResponseDto(
                        p.getId(),
                        p.getNome(),
                        p.getDescricao(),
                        p.getPreco(),
                        p.getStatus()
                ))
                .collect(Collectors.toList());
    }
    //POR ID
    @Override
    public ProdutoResponseDto findById(Long id) {
        return repository.findById(id)
                .map(p -> new ProdutoResponseDto(
                        p.getId(),
                        p.getNome(),
                        p.getDescricao(),
                        p.getPreco(),
                        p.getStatus()
                ))
                .orElse(null);
    }
    //ATAULIZAR
    @Override
    public ProdutoResponseDto update(Long id, ProdutoRequestDto dto) {
        Produto produto = repository.findById(id).orElse(null);
        if (produto == null) return null;

        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());

        Produto atualizado = repository.save(produto);

        return new ProdutoResponseDto(
                atualizado.getId(),
                atualizado.getNome(),
                atualizado.getDescricao(),
                atualizado.getPreco(),
                atualizado.getStatus()
        );
    }
    //DELETAR
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
