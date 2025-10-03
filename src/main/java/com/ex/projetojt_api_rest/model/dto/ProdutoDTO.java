package com.ex.projetojt_api_rest.model.dto;

import com.ex.projetojt_api_rest.model.Produto;

public record ProdutoDTO(
        String idProduto,
        String nomeProduto,
        Double valorUnit
) {
    public ProdutoDTO(Produto produto){
        this(produto.getId(), produto.getNome(), produto.getValorUnitario());
    }
}
