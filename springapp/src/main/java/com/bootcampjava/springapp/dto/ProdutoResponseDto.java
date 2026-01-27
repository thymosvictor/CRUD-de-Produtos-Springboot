package com.bootcampjava.springapp.dto;

// Define o que o usuário recebe ao consultar produtos
import com.bootcampjava.springapp.model.StatusProduto; // Enum que representa o status do produto
import lombok.*; // Anotações Lombok para gerar código automaticamente

@Getter // Gera automaticamente os getters para todos os atributos
@Setter // Gera automaticamente
@NoArgsConstructor // Gera um construtor
@AllArgsConstructor // Gera um construtor com todos os campos como parâmetros
public class ProdutoResponseDto {

    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private StatusProduto status;
}

