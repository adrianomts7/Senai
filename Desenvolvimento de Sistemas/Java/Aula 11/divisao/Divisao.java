package divisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o 1º Número: ");
            int num1 = sc.nextInt();

            System.out.print("Digite o 2º Número: ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;

            System.out.println(resultado);

        } catch (InputMismatchException e) {
            System.out.println("Formato invalido");
            System.out.println("\n Detalhes do erro: " + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Operação invalida");
            System.out.println("\n Detalhes do erro: " + e.getMessage());
        }
        finally{
            System.out.println("Programa finalizado");
        }

        sc.close();
    }
}
