package br.com.fiap.parquimetroapi.controller;

import br.com.fiap.parquimetroapi.model.Cliente;
import br.com.fiap.parquimetroapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente ){
        return this.clienteService.criar(cliente);
    }

    @GetMapping
    public List<Cliente> obterTodos(){
        return this.clienteService.obterTodos();
    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable String id){
        return this.clienteService.findById(id);
    }

}
