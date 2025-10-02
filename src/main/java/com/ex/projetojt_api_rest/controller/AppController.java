package com.ex.projetojt_api_rest.controller;

import com.ex.projetojt_api_rest.model.dto.DataDTO;
import com.ex.projetojt_api_rest.model.Venda;
import com.ex.projetojt_api_rest.model.dto.VendaDTO;
import com.ex.projetojt_api_rest.model.repository.VendaRepository;
import com.ex.projetojt_api_rest.service.ClienteService;
import com.ex.projetojt_api_rest.service.ProdutoService;
import com.ex.projetojt_api_rest.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {
    private final VendaService vendaService;
    private final ClienteService clienteService;
    private final ProdutoService produtoService;

    @Autowired
    public AppController(VendaService vendaService, ClienteService clienteService, ProdutoService produtoService) {
        this.vendaService = vendaService;
        this.clienteService = clienteService;
        this.produtoService = produtoService;
    }

    @GetMapping("/vendas")
    public ResponseEntity<List<VendaDTO>> getVendas() {
        return ResponseEntity.ok(vendaService.getVendas());
    }

    @PostMapping("/vendas")
    public ResponseEntity<?> criar(@RequestBody List<DataDTO> dados) {
        clienteService.salvarCliente(dados);
        produtoService.salvarProduto(dados);
        vendaService.salvarVenda(dados);
        return ResponseEntity.ok().build();
    }
}

