package com.example.veiculo_api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.veiculo_api.models.Veiculo;

public interface Repositorio extends CrudRepository <Veiculo, Integer> { 
    List<Veiculo> findAll();
    Veiculo findById(int codigo);
}
