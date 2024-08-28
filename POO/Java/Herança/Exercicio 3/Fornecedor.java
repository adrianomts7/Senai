/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public class Fornecedor extends Juridica{
    private String produto;

    public Fornecedor(String produto, String cnpj, String incricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, incricaoEstadual, id, nome, telefone, email, endereco);
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nFornecedor" + 
                "\nProduto: " + produto;
    }
    
    
    
}
