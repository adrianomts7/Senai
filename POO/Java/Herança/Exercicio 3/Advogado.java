/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetojava;

import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, float salario, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAdvogado" +
                "\nOab: " + oab;
    }
  
    
    
}
