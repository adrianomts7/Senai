import java.util.Scanner;

public class MenuEmbalagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 4){
            System.out.println();
            System.out.println("\t=== Menu Embalagens ===");
            System.out.println("Produto \t\t\tDescrição");
            System.out.println("1 - Caixa de Papelão \t\tIdeal para transportes e armazenamento");
            System.out.println("2 - Sacola Plastica \t\tLeve e pratica, mas pouco sustentavel");
            System.out.println("3 - Embalagem de vidro \t\tResistente e Reutilizavel");
            System.out.println("4 - Sair");
            System.out.print("Escolha a embalagem: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Embalagem escolhida: Papelão");
                    break;

                case 2:
                    System.out.println("Embalagem escolhida: Sacola Plastica");
                    break;

                case 3:
                    System.out.println("Embalagem escolhida: Vidro");
                    break;
                
                case 4:
                    System.out.println("Saindo do sistema");
                    break;

                default:
                    System.out.println("Opção de embalagem invalida!");
                    break;

            }
        
        }

        sc.close();
    }
}
