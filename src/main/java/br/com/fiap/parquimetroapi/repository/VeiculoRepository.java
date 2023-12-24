package br.com.fiap.parquimetroapi.repository;

import br.com.fiap.parquimetroapi.model.Veiculo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VeiculoRepository extends MongoRepository<Veiculo, String> {
}