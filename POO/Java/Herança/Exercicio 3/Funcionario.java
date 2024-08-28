/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario extends Fisica{
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected float salario;

    public Funcionario(String cpf, String rg, String matricula, Setor setor, float salario, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n" + 
                super.toString() +
                "\nCpf: " + cpf + 
                "\nRg: " + rg + 
                "\nMatricula: " + matricula + 
                "\nSetor: " + setor + 
                "\nSálario=" + salario;
    }
    
    
    
}
