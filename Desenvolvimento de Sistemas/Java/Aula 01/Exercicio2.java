import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite o 1º Número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o 2º Número: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.println();
        
        System.out.println("A Média dos números digitados: " + media);

        sc.close();
    
    }
}
