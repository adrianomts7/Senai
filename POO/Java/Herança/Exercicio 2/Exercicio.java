/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio;

/**
 *
 * @author Aluno
 */
public class Exercicio {

    public static void main(String[] args) {
       
        Fisica f1 = new Fisica(Sexo.MASCULINO, "218791", "Marcio", "1832798", "Marcio@gmai.com", new Endereco("Rua A", "21", "Nada", "21879", "Salvador", UnidadeFederativa.BAHIA));
        System.out.println(f1.toString());
        
       Juridica j1 = new Juridica("128739", "21987391", "Marcio", "21987239", "12736wghq", new Endereco("Rua B", "21", "nada", "1236128761", "Candeias", UnidadeFederativa.BAHIA));
       System.out.println(j1.toString());
    }
}
