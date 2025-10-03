package com.ex.projetojt_api_rest.mapper;

import com.ex.projetojt_api_rest.model.Venda;
import com.ex.projetojt_api_rest.model.dto.VendaDTO;
import org.springframework.stereotype.Service;

@Service
public class VendaMapper {

    public VendaDTO toDTO(Venda venda){
        return new VendaDTO(venda);
    }
}
