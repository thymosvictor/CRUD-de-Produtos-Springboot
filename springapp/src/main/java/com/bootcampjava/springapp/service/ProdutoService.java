package com.bootcampjava.springapp.service;

import com.bootcampjava.springapp.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    // LISTA PARA ARMAZENAR OS DADOS//
    private List<Produto> produtos = new ArrayList<>();
    private Long proximoId = 1L;


    //DEFINIÇÃO DOS MÉTODOS CRUD//

    // CREATE - cadastrar produto
    public Produto criarProduto(Produto produto) {
        produtos.add(produto);
        return produto;
    }

    // READ - listar todos os produtos
    public List<Produto> listarProdutos() {
        return produtos;
    }

    // READ - buscar produto por id
    public Produto buscarPorId(Long id) {
        return produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // UPDATE - atualizar produto
    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        Produto produtoExistente = buscarPorId(id);

        if (produtoExistente != null) {
            produtoExistente.setNome(produtoAtualizado.getNome());
            produtoExistente.setPreco(produtoAtualizado.getPreco());
            produtoExistente.setEstoque(produtoAtualizado.isEstoque());
            return produtoExistente;
        }

        return null;
    }

    // DELETE - remover produto
    public boolean removerProduto(Long id) {
        Produto produto = buscarPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            return true;
        }
        return false;
    }
}
