package br.com.fiap.parquimetroapi.service.impl;

import br.com.fiap.parquimetroapi.model.Cliente;
import br.com.fiap.parquimetroapi.repository.ClienteRepository;
import br.com.fiap.parquimetroapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public Cliente criar(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }
}
