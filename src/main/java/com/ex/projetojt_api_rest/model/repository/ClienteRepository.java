package com.ex.projetojt_api_rest.model.repository;

import com.ex.projetojt_api_rest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    Optional<Cliente> findById(String id);
}
