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
    @NotBlank(message = "Nome é obrigatório")
    @Size(max = 100, message = "Este campo deve ter no máximo 100 caracteres")
    private String nome;

    @Size(max = 255, message = "Este campo deve ter no máximo 255 caracteres")
    private String descricao;

    @NotNull(message = "Este campo é obrigatório") //garante que o campo não seja nulo, mas aceita valores “vazios” dependendo do tipo.
    @Positive(message = "Este campo deve ser maior que zero") //usado para garantir que o número seja maior que 0.
    private Double preco;
}
