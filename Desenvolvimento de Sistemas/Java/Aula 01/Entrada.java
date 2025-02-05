import java.util.Scanner;

public class Entrada {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Digite o seu Nome: ");
            String nome = sc.next();

            System.out.print("Digite sua idade: ");
            double idade = sc.nextDouble();

            System.out.println("Olá " + nome + " Sua idade é " +  idade + " anos");

        sc.close();
    
    }

}
