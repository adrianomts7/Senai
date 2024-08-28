/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica{
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return " Cliente " + 
                super.toString()+
                "\nProtocolo de Atendimento: " + protocoloAtendimento;
    }
    
    
    
}
