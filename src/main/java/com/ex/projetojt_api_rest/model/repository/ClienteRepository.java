package com.ex.projetojt_api_rest.model.repository;

import com.ex.projetojt_api_rest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
