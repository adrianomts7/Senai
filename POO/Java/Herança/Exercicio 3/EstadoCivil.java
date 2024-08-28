/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public enum EstadoCivil {
    SOLTEIRO("Solteiro"),CASADO("Casado"),SEPARADO("Separado"),DIVORCIADO("Divorciado"),VIUVO("Viuvo");
    
    String Texto;

    private EstadoCivil(String Texto) {
        this.Texto = Texto;
    }

    public static EstadoCivil getSOLTEIRO() {
        return SOLTEIRO;
    }

    public static EstadoCivil getCASADO() {
        return CASADO;
    }

    public static EstadoCivil getSEPARADO() {
        return SEPARADO;
    }

    public static EstadoCivil getDIVORCIADO() {
        return DIVORCIADO;
    }

    public static EstadoCivil getVIUVO() {
        return VIUVO;
    }

    public String getTexto() {
        return Texto;
    }
    
    
    
}
