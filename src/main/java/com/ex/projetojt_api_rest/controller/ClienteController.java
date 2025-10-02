package com.ex.projetojt_api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public String teste() {
        return "Clientes";
    }
    
}
