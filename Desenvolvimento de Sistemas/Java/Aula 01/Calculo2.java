import java.util.Scanner;

public class Calculo2 {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º Número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o 2º Número: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos números digitados: " +  soma);

        sc.close();
    }
}
