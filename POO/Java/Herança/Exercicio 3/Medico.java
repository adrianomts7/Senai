/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario{
    private String cmm;

    public Medico(String cmm, String cpf, String rg, String matricula, Setor setor, float salario, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.cmm = cmm;
    }

    public String getCmm() {
        return cmm;
    }

    public void setCmm(String cmm) {
        this.cmm = cmm;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Medico" + 
                "Cmm: " + cmm;
    }
    
    
    
}
