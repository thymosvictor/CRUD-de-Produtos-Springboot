package com.bootcampjava.springapp.dto;

import com.bootcampjava.springapp.model.StatusProduto;
import lombok.*;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponseDto {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private StatusProduto status;
}
