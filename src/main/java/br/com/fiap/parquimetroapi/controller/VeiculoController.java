package br.com.fiap.parquimetroapi.controller;

import br.com.fiap.parquimetroapi.model.Veiculo;
import br.com.fiap.parquimetroapi.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public Veiculo criar(@RequestBody Veiculo veiculo ){
        return this.veiculoService.criar(veiculo);
    }
}
