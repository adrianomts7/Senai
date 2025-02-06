import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Número Positivo");
        }
        else if(num < 0){
            System.out.println("Número Negativo");
        }
        else{
            System.out.println("Número nulo");
        }

        sc.close();
    }
}
