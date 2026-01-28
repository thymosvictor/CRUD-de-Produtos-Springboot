package com.bootcampjava.springapp.dto;

// Define o que o usuário recebe ao consultar produtos
import com.bootcampjava.springapp.model.StatusProduto;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponseDto {

    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private StatusProduto status;
}

