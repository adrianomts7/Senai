import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos Números deseja inserir no vetor: ");
        int qntdNumeros = sc.nextInt();
        sc.nextLine();

        int [] numeros = new int[qntdNumeros];

        for(int i = 0; i < qntdNumeros; i++){
            System.out.print("Digite o " + (i + 1) + "º " + "Número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = 0;

        for(int numero : numeros){
            if(numero > maior){
                maior = numero;
            }   
        }

        System.out.println("O Maior número digitado: " + maior);


        sc.close();
    }
}
