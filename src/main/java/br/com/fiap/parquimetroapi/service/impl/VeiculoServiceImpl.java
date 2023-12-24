package br.com.fiap.parquimetroapi.service.impl;

import br.com.fiap.parquimetroapi.model.Veiculo;
import br.com.fiap.parquimetroapi.repository.VeiculoRepository;
import br.com.fiap.parquimetroapi.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;
    @Override
    public Veiculo criar(Veiculo veiculo) {
        return this.veiculoRepository.save(veiculo);
    }
}
