package com.example.projeto_api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.projeto_api.models.Pessoa;

public interface Repositorio extends CrudRepository <Pessoa, Integer> {
    List<Pessoa> findAll();
    Pessoa findById(int codigo);
}
