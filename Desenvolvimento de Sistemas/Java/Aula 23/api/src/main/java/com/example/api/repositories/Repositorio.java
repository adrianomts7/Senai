package com.example.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.api.models.Pessoa;;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {
    
}
