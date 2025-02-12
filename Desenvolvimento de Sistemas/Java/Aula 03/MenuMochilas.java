import java.util.Scanner;

public class MenuMochilas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 4){
            System.out.println();
            System.out.println("\t=== Menu de Mochilas ===");
            System.out.println("Produto \t\t\tDescrição");
            System.out.println("1 - Mochila Escolar \t\tCompacta e ideal para estudantes");
            System.out.println("2 - Mochila de Viagem \t\tEspaçosa, ideal para longas jornadas");
            System.out.println("3 - Mochila Esportiva \t\tLeve,resistente e ergonômica");
            System.out.println("4 - Sair");
            System.out.print("Escolha a Mochila: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Mochila escolhida: Escolar");
                    break;

                case 2:
                    System.out.println("Mochila escolhida: Viagem");
                    break;

                case 3:
                    System.out.println("Mochila escolhida: Esportiva");
                    break;
                
                case 4:
                    System.out.println("Saindo do sistema");
                    break;

                default:
                    System.out.println("Opção de Mochila invalida!");
                    break;

            }
        
        }

        sc.close();
    }
    
}
