/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroeletrodomestico.controller;

import com.mycompany.cadastroeletrodomestico.dao.EletrodomesticoDao;
import com.mycompany.cadastroeletrodomestico.models.Eletrodomestico;
import java.util.ArrayList;

/**
 *
 * @author Adriano Mateus
 */
public class EletrodomesticoController {
    private EletrodomesticoDao dao = new EletrodomesticoDao();
    
    public void cadastrar(String nome, String marca, int voltagem, double preco) {
        Eletrodomestico e = new Eletrodomestico(nome, marca, voltagem, preco);
        dao.inserir(e);
    }
    
    public ArrayList<Eletrodomestico> listar() {
        return dao.listar();
    }
    
    public void atualizar(int id,String nome, String marca, int voltagem, double preco){
        Eletrodomestico e = new Eletrodomestico(id,nome, marca, voltagem, preco);
        dao.atualizar(e);
    }
    
    public void remover(int id) {
        dao.remover(id);
    }
    
    public ArrayList<Eletrodomestico> buscarPorNome(String nome) {
        return dao.buscaPorNome(nome);
    }
    
}
