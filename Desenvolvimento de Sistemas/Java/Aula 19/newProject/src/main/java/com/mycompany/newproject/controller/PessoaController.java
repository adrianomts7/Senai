/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newproject.controller;
import com.mycompany.newproject.dao.PessoaDAO;
import com.mycompany.newproject.model.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class PessoaController {
    private PessoaDAO dao = new PessoaDAO();
    
    public void cadastrar(String nome, int idade){
        Pessoa p = new Pessoa(nome, idade);
        dao.adicionarPessoa(p);
    }
       
    public ArrayList<Pessoa> listar() {
        return dao.listar();
    }
    
}
