import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja digitar: ");
        int qntdNumeros = sc.nextInt();
        sc.nextLine();
        
        int [] numeros = new int[qntdNumeros];

        for(int i = 0; i < qntdNumeros; i ++){
            System.out.print("Digite o " + (i + 1) + "º Número: ");
            numeros[i] = sc.nextInt();
        }

        double soma = 0;
        for(int numero : numeros){
            soma += numero;
        }

        double media = soma / qntdNumeros;

        System.out.print("A Média dos números digitados: " + media);

        sc.close();
    }
}
