import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º Número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o 2º Número: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite o 3º Número: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println();

        System.out.println("A Média dos Números digitados: " + media);

        sc.close();
    }
}
