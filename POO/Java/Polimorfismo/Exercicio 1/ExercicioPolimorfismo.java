/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciopolimorfismo;

/**
 *
 * @author Aluno
 */
public class ExercicioPolimorfismo {

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Gato g1 = new Gato();
        Galo gal1 = new Galo();
        Pato p1 = new Pato();
        
        System.out.println(c1.emitirsom());
        System.out.println(c1.comer());
        System.out.println("");
        System.out.println(g1.emitirsom());
        System.out.println(g1.comer());
        System.out.println("");
        System.out.println(gal1.emitirsom());
        System.out.println(gal1.comer());
        System.out.println("");
        System.out.println(p1.emitirsom());
        System.out.println(p1.comer());
        
    }
}
