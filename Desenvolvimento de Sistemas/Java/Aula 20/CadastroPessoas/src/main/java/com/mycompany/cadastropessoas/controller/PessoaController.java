/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastropessoas.controller;

import com.mycompany.cadastropessoas.dao.PessoaDao;
import com.mycompany.cadastropessoas.models.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author Adriano Mateus
 */
public class PessoaController {
    private PessoaDao dao = new PessoaDao();
    
    public void cadastrar(String nome, int idade) {
        Pessoa p = new Pessoa(nome, idade);
        dao.inserir(p);
    }
    
    public ArrayList<Pessoa> listar() {
        return dao.listar();
    }
    
    public void atualizar(int id, String nome, int idade) {
        Pessoa p = new Pessoa(id, nome, idade);
        dao.atualizar(p);
    }
    
    public void remover(int id) {
        dao.remover(id);
    }
    
    public ArrayList<Pessoa> buscarPorNome(String nome){
        return dao.buscaPorNome(nome);
    }
    
}
