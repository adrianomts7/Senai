
import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            System.out.print("Digite o " + (i + 1) + "º Número: ");
            int n = sc.nextInt();

            numeros.add(n);

            if(n == 10 || n == 100 || n == 1000){
                System.out.println("Você ganhou um bônus");
            }
        }

        System.out.println();
        System.out.println("Os números digitados");
        for(int numero : numeros){
            System.out.println(numero);
        }

        sc.close();
    }
}