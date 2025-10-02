package com.ex.projetojt_api_rest.model;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDTO {
    private int idCliente;
    private int idProduto;
    private int qtdVendida;
    private String nomeProduto;
    private String nomeCliente;
    private double valorUnit;
    private LocalDate data_venda;
}
