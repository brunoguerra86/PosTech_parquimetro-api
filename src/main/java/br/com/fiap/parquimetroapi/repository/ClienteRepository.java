package br.com.fiap.parquimetroapi.repository;

import br.com.fiap.parquimetroapi.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
