/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroproduto;

/**
 *
 * @author aluno.den
 */
public class Carro extends Veiculo{
    private int numeroPorta;

    public Carro(int numeroPorta, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPorta = numeroPorta;
    }

    public int getNumeroPorta() {
        return numeroPorta;
    }

    public void setNumeroPorta(int numeroPorta) {
        this.numeroPorta = numeroPorta;
    }
    
    
    
}
