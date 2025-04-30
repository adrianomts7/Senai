/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroeletrodomestico.models;

/**
 *
 * @author Adriano Mateus
 */
public class Eletrodomestico {
    private int id;
    private String nome;
    private String marca;
    private int voltagem;
    private double preco;

    public Eletrodomestico() {
    }

    public Eletrodomestico(String nome, String marca, int voltagem, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.voltagem = voltagem;
        this.preco = preco;
    }

    public Eletrodomestico(int id, String nome, String marca, int voltagem, double preco) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.voltagem = voltagem;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    
    
    
}
