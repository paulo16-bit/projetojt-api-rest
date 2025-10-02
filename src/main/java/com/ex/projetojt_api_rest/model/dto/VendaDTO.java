package com.ex.projetojt_api_rest.model.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record VendaDTO(
        String idProduto,
        String idCliente,
        String nomeProduto,
        String nomeCliente,
        Integer qtdVendida,
        Double valorUnit,
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDate dataVenda
) {
}
