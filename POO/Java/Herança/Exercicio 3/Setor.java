/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public enum Setor{
    ENGENHARIA("Engenharia"),SAUDE("Saude"),JURIDICO("Juridico");
    
    String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public static Setor getENGENHARIA() {
        return ENGENHARIA;
    }

    public static Setor getSAUDE() {
        return SAUDE;
    }

    public static Setor getJURIDICO() {
        return JURIDICO;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
    
}
