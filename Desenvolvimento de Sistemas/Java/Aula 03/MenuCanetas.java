import java.util.Scanner;

public class MenuCanetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 4){
            System.out.println();
            System.out.println("\t=== Menu Canetas ===");
            System.out.println("Produto \t\t\tDescrição");
            System.out.println("1 - Caneta Esterográfica \t\tEconômica e de longa duração");
            System.out.println("2 - Caneta Gel \t\tTinta mais pigmentada e escrita suave");
            System.out.println("3 - Caneta Tinteiro \t\tClássica e elegante,usada para caligrafia");
            System.out.println("4 - Sair");
            System.out.print("Escolha a canta: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Caneta escolhida: Esterográfica");
                    break;

                case 2:
                    System.out.println("Caneta escolhida: Gel");
                    break;

                case 3:
                    System.out.println("Caneta escolhida: Tinteiro");
                    break;
                
                case 4:
                    System.out.println("Saindo do sistema");
                    break;

                default:
                    System.out.println("Opção de Caneta invalida!");
                    break;

            }
        
        }

        sc.close();
    }
}
