package com.ex.projetojt_api_rest.service;

import com.ex.projetojt_api_rest.model.Cliente;
import com.ex.projetojt_api_rest.model.dto.DataDTO;
import com.ex.projetojt_api_rest.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;
    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void salvarCliente(List<DataDTO> dados) {
        for (DataDTO dataDTO : dados) {
            Cliente cliente = new Cliente();
            cliente.setId(dataDTO.idCliente());
            cliente.setNome(dataDTO.nomeCliente());
            clienteRepository.save(cliente);
        }
    }
}
