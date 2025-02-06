import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a Força Aplicada: ");
        double forca = sc.nextDouble();

        System.out.print("Digite a Distância Percorrida: ");
        double distancia = sc.nextDouble();

        double trabalho = forca * distancia;

        System.out.println();

        System.out.println("O calculo do trabalho: " + trabalho);

        sc.close();
    }

}