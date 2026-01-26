package com.bootcampjava.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootcampjava.springapp.model.Produto;
import com.bootcampjava.springapp.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    //SAVE//
    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    //LISTAR//
    public List<Produto> findAll() {
        return repository.findAll();
    }

    //LISTAR POR ID//
    public Produto findById(Long id) {
        return repository.findById(id).get();
    }

    //ATUALIZAR//
    public Produto update(Long id, Produto produtoAtualizado) {
        Produto produtoExistente = repository.findById(id).orElseThrow();

        produtoExistente.setNome(produtoAtualizado.getNome());
        produtoExistente.setDescricao(produtoAtualizado.getDescricao());
        produtoExistente.setPreco(produtoAtualizado.getPreco());
        produtoExistente.setEstoque(produtoAtualizado.isEstoque());

        return repository.save(produtoExistente);
    }

    //DELETAR//
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
