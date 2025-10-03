package com.ex.projetojt_api_rest.model.dto;

import com.ex.projetojt_api_rest.model.Cliente;

public record ClienteDTO(
        String idCliente,
        String nomeCliente
) {
    public ClienteDTO(Cliente cliente){
        this(cliente.getId(), cliente.getNome());
    }
}
