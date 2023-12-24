package br.com.fiap.parquimetroapi.service;

import br.com.fiap.parquimetroapi.model.Cliente;
import br.com.fiap.parquimetroapi.model.Veiculo;

import java.util.List;

public interface ClienteService {
    public Cliente criar(Cliente cliente);
    public List<Cliente> obterTodos();
    public Cliente findById(String id);
    public void atualizarClienteComVeiculo(String id, Veiculo veiculo);
}
