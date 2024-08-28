/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA("Bahia","BA"),SAO_PAULO("São Paulo","SP"),RIO_DE_JANIERO("Rio de Janeiro","RJ");
    
    String texto;
    String sigla;

    private UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

    public static UnidadeFederativa getRIO_DE_JANIERO() {
        return RIO_DE_JANIERO;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }
    
    
    
}
