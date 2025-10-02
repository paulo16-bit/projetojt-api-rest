package com.ex.projetojt_api_rest.model.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
public class DataDTO {
    private int idCliente;
    private int idProduto;
    private int qtdVendida;
    private String nomeProduto;
    private String nomeCliente;
    private double valorUnit;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate dataVenda;
}
