package com.example.veiculo_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.veiculo_api.models.Veiculo;
import com.example.veiculo_api.repositories.Repositorio;

@RestController
public class Controller {
    
    @Autowired
    private Repositorio acao;

    @PostMapping("")
    public String Cadastrar(@RequestBody Veiculo v) {
        acao.save(v);
        return v.getModelo() + " Foi salvo com sucesso!"; 
    }

    @GetMapping("")
    public List<Veiculo> selecionar() {
        return acao.findAll();
    }

    @GetMapping("/{codigo}")
    public Veiculo selecionarPorId(@PathVariable int codigo) {
        return acao.findById(codigo);
    }

    @PutMapping("/")
    public Veiculo editar(@RequestBody Veiculo v) {
        return acao.save(v);
    }

    @DeleteMapping("/{codigo}")
    public String remover(@PathVariable int codigo) {
        Veiculo v = selecionarPorId(codigo);
        acao.delete(v);
        return v.getModelo() + " Removido com sucesso";
    }

}
