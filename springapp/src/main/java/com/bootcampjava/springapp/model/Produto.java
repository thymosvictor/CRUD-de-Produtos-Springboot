package com.bootcampjava.springapp.model;
 import jakarta.persistence.*;
 import lombok.*;

//MODELANDO MINHA ENTIDADE PRODUTO//
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Double preco;
    private boolean estoque;
}

//1769196977451//