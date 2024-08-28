/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    protected Sexo sexo;
    protected EstadoCivil estadoCivil;
    protected String dataNascimento;

    public Fisica(Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    @Override
    public String toString() {
        return "\n" +
                super.toString() +
                "\nSexo: " + sexo.getTexto() + 
                "\nEstado Civil: " + estadoCivil.getTexto() + 
                "\nData Nascimento: " + dataNascimento;
    }
    
    
    
}
