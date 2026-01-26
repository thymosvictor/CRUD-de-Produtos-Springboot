package com.bootcampjava.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcampjava.springapp.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
