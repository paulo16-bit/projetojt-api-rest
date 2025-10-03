package com.ex.projetojt_api_rest.service;

import com.ex.projetojt_api_rest.mapper.VendaMapper;
import com.ex.projetojt_api_rest.model.Cliente;
import com.ex.projetojt_api_rest.model.Produto;
import com.ex.projetojt_api_rest.model.Venda;
import com.ex.projetojt_api_rest.model.dto.DataDTO;
import com.ex.projetojt_api_rest.model.dto.VendaDTO;
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
    @Autowired
    private final VendaMapper vendaMapper;

    public void salvarVenda(List<DataDTO> dados) {

        for (DataDTO dataDTO : dados) {
            Venda venda = new Venda();
            Cliente cliente = clienteRepository.findById(dataDTO.idCliente())
                    .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
            venda.setCliente(cliente);
            Produto produto = produtoRepository.findById(dataDTO.idProduto())
                    .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
            venda.setProduto(produto);
            venda.setQuantidade(dataDTO.qtdVendida());
            venda.setDataVenda(dataDTO.dataVenda());
            vendaRepository.save(venda);
        }
    }

    public List<VendaDTO> getVendas(){
        return vendaRepository.findAll().stream().map(vendaMapper::toDTO).toList();
    }
}
