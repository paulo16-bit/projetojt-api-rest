package com.ex.projetojt_api_rest.mapper;

import com.ex.projetojt_api_rest.model.Venda;
import com.ex.projetojt_api_rest.model.dto.VendaDTO;
import org.springframework.stereotype.Service;

@Service
public class VendaMapper {

    public VendaDTO toDTO(Venda venda){
        return new VendaDTO(String.valueOf(venda.getProduto().getId()),String.valueOf(venda.getCliente().getId()),
                venda.getProduto().getNome(), venda.getCliente().getNome(), venda.getQuantidade(), venda.getProduto().getValorUnitario(),
                venda.getDataVenda());
    }
}
