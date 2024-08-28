/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismosenai;

import com.mycompany.Herancasenai.Cachorro;

/**
 *
 * @author Aluno
 */
public class Polimorfismo {

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Gato g1 = new Gato();
        
        System.out.println(c1.emitirSom());
        System.out.println(g1.emitirSom());
    }
}
