package tratamento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite x: ");
            int x = sc.nextInt();
            int y = 100 / x;
        } 
        catch (InputMismatchException e) {
            System.out.println("Formato invalido");
            System.out.println("\n Detalhes do erro: " + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Operação invalida");
            System.out.println("\n Detalhes do erro: " + e.getMessage());
        }

        sc.close();
    }
}
