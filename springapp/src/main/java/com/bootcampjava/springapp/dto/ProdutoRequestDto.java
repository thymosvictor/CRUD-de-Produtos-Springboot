package com.bootcampjava.springapp.dto;
// definir o que o usuário envia para criar ou atualizar um produto.
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequestDto {

    //garante que o campo não seja nulo e não seja vazio, e que não tenha só espaços.
    @NotBlank
    private String nome;

    @NotBlank
    private String descricao;

    @NotNull //garante que o campo não seja nulo, mas aceita valores “vazios” dependendo do tipo.
    @Positive //usado para garantir que o número seja maior que 0.
    private Double preco;
}
