package com.ex.projetojt_api_rest.controller;

import com.ex.projetojt_api_rest.model.dto.VendaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class VendaController {


    @PostMapping("/vendas")
    public ResponseEntity<?> postVendas(@RequestBody List<VendaDTO> vendas){
        System.out.println(vendas);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/vendas")
    public String getVendas() {
        return "Vendas";
    }
    
}
