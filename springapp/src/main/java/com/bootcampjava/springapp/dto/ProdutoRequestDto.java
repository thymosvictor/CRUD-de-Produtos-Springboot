package com.bootcampjava.springapp.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequestDto {

    @NotBlank(message = "Nome é obrigatório")
    @Size(max = 100, message = "Este campo deve ter no máximo 100 caracteres")
    private String nome;

    @Size(max = 255, message = "Este campo deve ter no máximo 255 caracteres")
    private String descricao;

    @NotNull(message = "Este campo é obrigatório")
    @Positive(message = "Este campo deve ser maior que zero")
    private BigDecimal preco;
}
