package com.bootcampjava.springapp.model;

import jakarta.persistence.*; // Anotações JPA para mapeamento ORM
import lombok.*;

// Marca a classe como entidade do banco de dados
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento no banco
    private Long id;

    @Column(nullable = false, length = 100) //Obrigatório
    private String nome;

    private String descricao;

    @Column(nullable = false)
    private Double preco;

    @Enumerated(EnumType.STRING) // Salva enum como string no banco
    private StatusProduto status; // Status do produto (ex: DISPONÍVEL, INDISPONÍVEL)
}


//1769196977451//