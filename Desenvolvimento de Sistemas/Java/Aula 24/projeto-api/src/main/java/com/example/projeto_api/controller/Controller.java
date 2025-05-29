package com.example.projeto_api.controller;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto_api.models.Pessoa;
import com.example.projeto_api.repositories.Repositorio;

@RestController
public class Controller {
    
    @Autowired
    private Repositorio acao;

    // Cadastrando 
    @PostMapping("api")
    public String cadastrar(@RequestBody Pessoa p) {
        acao.save(p);
        return p.getNome() + " Foi cadastrada com sucesso";  
    }

    // Lendo arquivos
    @GetMapping("/api")
    public List<Pessoa> selecionar() {
        return acao.findAll();
    }

    // Buscando por id
    @GetMapping("/api/{codigo}")
    public Pessoa selecionarPeloCodigo(@PathVariable int codigo) {
        return acao.findById(codigo);
    }

    // Editar
    @PutMapping("/api")
    public Pessoa editar(@RequestBody Pessoa p) {
        return acao.save(p);
    }

    // Deletar
    @DeleteMapping("/api/{codigo}")
    public String remover(@PathVariable int codigo) {
        Pessoa p = selecionarPeloCodigo(codigo);
        acao.delete(p);
        return "Pessoa removida com sucesso " + p;
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "Seja bem vindo!" + nome;
    }

    @GetMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p) {
        return p;
    }

}
