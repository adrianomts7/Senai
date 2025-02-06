import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if(senha.equals("ALFA")){
            System.out.println("Porta Aberta");
        }
        else{
            System.out.println("Porta Fechada");
        }

        sc.close();
    }
}
