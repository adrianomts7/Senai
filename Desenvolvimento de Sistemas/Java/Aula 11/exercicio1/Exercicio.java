package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a sua idade: ");
            int idade = sc.nextInt();
            
            if(idade <= 0){
                System.out.println("Idade invalida");
            }    
            else{
                System.out.println("Idade Cadastrada com sucesso: " + idade);
            }

        } 
        catch(InputMismatchException e){
            System.out.println("Digite um número inteiro valido");
        }
        finally{
            System.out.println("Programa Finalizado");
        }

        sc.close();
    }
}
