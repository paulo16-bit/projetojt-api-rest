package com.ex.projetojt_api_rest.model.repository;

import com.ex.projetojt_api_rest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    Optional<Produto> findById(String id);
}
