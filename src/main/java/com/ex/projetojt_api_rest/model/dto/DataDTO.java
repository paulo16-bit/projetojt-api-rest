package com.ex.projetojt_api_rest.model.dto;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public record DataDTO(
        String idCliente,
        String idProduto,
        int qtdVendida,
        String nomeProduto,
        String nomeCliente,
        double valorUnit,
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDate dataVenda
) {
}
