package com.ex.projetojt_api_rest.service;

import com.ex.projetojt_api_rest.model.DataDTO;
import com.ex.projetojt_api_rest.model.Produto;
import com.ex.projetojt_api_rest.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void salvarProduto(List<DataDTO> dados) {
        for (DataDTO dataDTO : dados) {
            Produto produto = new Produto();
            produto.setId(dataDTO.getIdProduto());
            produto.setNome(dataDTO.getNomeProduto());
            produto.setValorUnitario(dataDTO.getValorUnit());
            produtoRepository.save(produto);
        }
    }
}
