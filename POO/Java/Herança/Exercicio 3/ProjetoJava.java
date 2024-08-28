/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetojava;

/**
 *
 * @author Aluno
 */
public class ProjetoJava {

    public static void main(String[] args) {
           Advogado a1 = new Advogado("Criminalista","12345678-99", "98765432", "8718291", Setor.JURIDICO, 1500.75f, Sexo.MASCULINO, EstadoCivil.SOLTEIRO, "10/10/2000", 76172, "Marcos", "871821", "Marcos@gmail.com", new Endereco("Rua A", "20", "Perto da Avenida Dendezeiros", "1672817", "Salvador", UnidadeFederativa.BAHIA));
           
           System.out.println(a1.toString());
           
           Cliente c1 = new Cliente("1231", Sexo.FEMININO, EstadoCivil.CASADO, "26/10/1998", 4500.31f, "Marta", "81721982", "Marta@gmail.com", new Endereco("Rua B", "70", "Nada", "7265727", "Salvador", UnidadeFederativa.BAHIA));
           System.out.println(c1.toString());
           
    }
}
