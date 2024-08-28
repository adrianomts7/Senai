/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public enum Sexo {
    MASCULINO("Masculino","M"),FEMININO("Feminino","F");
    
    String texto;
    String sigla;

    private Sexo(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
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

    public String getSigla() {
        return sigla;
    }
    
    
    
}
