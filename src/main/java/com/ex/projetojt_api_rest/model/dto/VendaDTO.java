package com.ex.projetojt_api_rest.model.dto;

import com.ex.projetojt_api_rest.model.Venda;

import java.time.LocalDate;

public record VendaDTO(
        String idVenda,
        ProdutoDTO produto,
        ClienteDTO cliente,
        LocalDate dataVenda,
        Integer qtdVendida
) {
    public VendaDTO(Venda venda){
        this(venda.getId(), new ProdutoDTO(venda.getProduto()), new ClienteDTO(venda.getCliente()),venda.getDataVenda(), venda.getQuantidade());
    }
}
