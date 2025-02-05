import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o 2º Número: ");
        double n2 = sc.nextDouble();

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double divisao = n1 / n2;
        double multiplicacao = n1 * n2;

        System.out.println();

        System.out.println("A soma dos números digitados: " + soma + "\nSubtração: " + subtracao + "\nDivisão: " + divisao + "\nMultiplicação: " + multiplicacao);

        sc.close();
    }
}
