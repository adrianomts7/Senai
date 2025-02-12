import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while(op != 5){
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Listar");
            System.out.println("4 - Remove");
            System.out.println("5 - Sair");
            System.out.print("Escolha a opção: ");
            
            op = sc.nextInt();
        
            switch(op){
                case 1:
                    System.out.println("Você escolheu a opção de fazer o cadastro: ");
                    break;

                case 2:
                    System.out.println("Você escolher a opção de alterar os dados cadastrados");
                    break;

                case 3:
                    System.out.println("Você escolheu a opção de listar os dados");
                    break;

                case 4:
                    System.out.println("Você escolheu a opção de remover um usuario");
                    break;

                case 5:
                    System.out.println("Você esta saindo do sistema");
                    break;

                default:
                    System.out.println("Opção invalida, digite as opções disponiveis no menu");
                    break;
            }

        }


        sc.close();
    }
}