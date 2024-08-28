/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopolimorfismo;

/**
 *
 * @author Aluno
 */
public class Cachorro implements Animal{

    @Override
    public String emitirsom() {
        return "Au AU";
    }

    @Override
    public String comer() {
        return "Comendo Ração";
    }
    
}
