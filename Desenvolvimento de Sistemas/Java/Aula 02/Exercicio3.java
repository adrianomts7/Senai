import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println();

        if(idade >= 18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }

        sc.close();
    }
}
