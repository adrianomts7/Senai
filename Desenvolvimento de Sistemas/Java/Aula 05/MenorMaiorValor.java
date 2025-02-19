import java.util.Scanner;

public class MenorMaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i + 1) + "º Número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = 0;
        int menor = 0;

        for(int numero : numeros){
            if(numero < menor){
                menor = numero;
            }
            maior = numero;
        }

        System.out.println("O Maior Número digitado: " + maior);
        System.out.println("O Menor Número digitado: " + menor);

        sc.close(); 
    }
}
