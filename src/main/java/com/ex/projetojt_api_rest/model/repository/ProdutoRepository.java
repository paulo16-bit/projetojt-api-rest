package com.ex.projetojt_api_rest.model.repository;

import com.ex.projetojt_api_rest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    Produto findById(int id);
}
