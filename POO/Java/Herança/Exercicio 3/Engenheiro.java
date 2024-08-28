/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, float salario, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Engenheiro" + 
                "\nCrea: " + crea;
    }
    
    
    
}
