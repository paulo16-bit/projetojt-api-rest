package com.ex.projetojt_api_rest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class VendaController {
    @GetMapping("/vendas")
    public String getVendas() {
        return "Vendas";
    }
    
}
