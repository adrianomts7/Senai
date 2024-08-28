/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.exercicio;

/**
 *
 * @author Aluno
 */
public enum Sexo {
    MASCULINO("Masculino","M"),FEMININO("Feminino","F");
    
    String texto;
    String caractere;

    private Sexo(String texto, String caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public static Sexo getMASCULINO() {
        return MASCULINO;
    }

    public static Sexo getFEMININO() {
        return FEMININO;
    }

    public String getTexto() {
        return texto;
    }

    public String getCaractere() {
        return caractere;
    }

    
    
    
    
}
