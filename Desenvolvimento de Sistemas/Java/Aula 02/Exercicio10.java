import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Carlos";

        while(!nome.equals("Anderson") == true){
            System.out.print("Digite o nome do professor mais fofo do senai: ");
            nome = sc.nextLine();
        }
        sc.close();
    }
}
