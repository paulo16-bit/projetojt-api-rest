package com.ex.projetojt_api_rest.service;

import com.ex.projetojt_api_rest.model.Cliente;
import com.ex.projetojt_api_rest.model.Produto;
import com.ex.projetojt_api_rest.model.Venda;
import com.ex.projetojt_api_rest.model.DataDTO;
import com.ex.projetojt_api_rest.model.repository.ClienteRepository;
import com.ex.projetojt_api_rest.model.repository.ProdutoRepository;
import com.ex.projetojt_api_rest.model.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VendaService {

    @Autowired
    private final VendaRepository vendaRepository;
    @Autowired
    private final ClienteRepository clienteRepository;
    @Autowired
    private final ProdutoRepository produtoRepository;

    public void salvarVenda(List<DataDTO> dados) {

        for (DataDTO dataDTO : dados) {
            Venda venda = new Venda();
            Cliente cliente = clienteRepository.findById(dataDTO.getIdCliente());
            venda.setCliente(cliente);
            Produto produto = produtoRepository.findById(dataDTO.getIdProduto());
            venda.setProduto(produto);
            venda.setQuantidade(dataDTO.getQtdVendida());
            venda.setDataVenda(dataDTO.getData_venda());
            vendaRepository.save(venda);
        }
    }
}
