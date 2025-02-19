import java.util.Scanner;

public class NomesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas nomes deseja digitar: ");
        int qntdNomes = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[qntdNomes];

        for(int i = 0; i < qntdNomes; i++){
            System.out.print("Digite o " + (i + 1) + "º " + "Nome: ");
            nomes[i] = sc.nextLine();
        }

        for(String nome : nomes){
            System.out.println("Nome: " + nome);
        }

        sc.close();
    }
}
