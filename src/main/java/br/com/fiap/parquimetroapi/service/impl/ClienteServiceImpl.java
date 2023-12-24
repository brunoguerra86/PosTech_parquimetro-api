package br.com.fiap.parquimetroapi.service.impl;

import br.com.fiap.parquimetroapi.model.Cliente;
import br.com.fiap.parquimetroapi.model.Veiculo;
import br.com.fiap.parquimetroapi.repository.ClienteRepository;
import br.com.fiap.parquimetroapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final MongoTemplate mongoTemplate;

    public ClienteServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente criar(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obterTodos() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente findById(String id) {
        return this.clienteRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não existe"));
    }

    @Override
    public void atualizarClienteComVeiculo(String id, Veiculo veiculo) {
        Query query = new Query(Criteria
                .where("_id").is(id));
        Update update = new Update().set("veiculo", veiculo);

        this.mongoTemplate.updateFirst(query, update, Cliente.class);
    }
}
