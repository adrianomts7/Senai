/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newproject.dao;

import com.mycompany.newproject.model.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class PessoaDAO {
    private static ArrayList <Pessoa> pessoas = new ArrayList<>();
    
    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
        
    public ArrayList<Pessoa> listar(){
        return pessoas;
    }
    
}
