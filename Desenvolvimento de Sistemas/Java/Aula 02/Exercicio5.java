import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º Número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o 2º Número: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O Maior Número: " + num1);
        }
        else{
            System.out.println("O Maior Número: " + num2);
        }

        sc.close();
    }
}
