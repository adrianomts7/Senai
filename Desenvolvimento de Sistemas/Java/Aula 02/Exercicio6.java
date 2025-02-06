import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0; 

        while(num >= 0){
            System.out.print("Digite um número: ");
            num = sc.nextInt();
        }

        sc.close();
    }
}
