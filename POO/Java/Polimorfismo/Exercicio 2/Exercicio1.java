/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;

/**
 *
 * @author Aluno
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Soma s1 = new Soma();
        Subtracao sub1 = new Subtracao();
        Multiplicacao m1 = new Multiplicacao();
        Divisao d1 = new Divisao();
        
        System.out.println("A Soma dos Números digitados são: " + s1.calcular(5, 5));
        System.out.println("A Subtração dos números digitados: " + sub1.calcular(10, 2));
        System.out.println("A Multiplicação dos números digitados: " + m1.calcular(7,7));
        System.out.println("A Divisão dos números digitados: " + d1.calcular(10, 5));
    }
}
