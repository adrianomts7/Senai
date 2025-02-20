
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> contatos = new ArrayList<>();
        int opcao = 1;

        while(opcao != 4){
            System.out.println();
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Sair");
            System.out.print("Digite qual opção você deseja fazer: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println();

                    System.out.print("Digite o Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o Número: ");
                    String numero = sc.nextLine();

                    contatos.add(nome);
                    contatos.add(numero);
                    System.out.println();

                    System.out.println("Usuario cadastrado com sucesso!");
                    break;

                case 2:
                    if(contatos.size() == 0){
                        System.out.println("Não tem contatos salvos");
                        continue;
                    }
                    
                    System.out.println();

                    for(int i = 0; i < contatos.size(); i+=2){
                        System.out.println("Nome: " + contatos.get(i) + " - Telefone: " + contatos.get(i + 1));
                    }    

                    break;

                case 3:
                    System.out.println("Digite o Nome que deseja apagar: ");
                    String nom = sc.nextLine();
                    
                    boolean nomeExiste = contatos.contains(nom);

                    if(!nomeExiste){
                        System.out.println();
                        System.out.println("Contato não existe");
                        continue;
                    }

                    System.out.println();

                    
                    for(int i = 0; i < contatos.size(); i+=2){
                        int indice = contatos.lastIndexOf(nom);
                        String n = contatos.get(indice + 1);

                        contatos.remove(String.valueOf(nom));
                        contatos.remove(String.valueOf(n));
                    }

                    break;

                case 4:
                    System.out.println("Saindo do Sistema");
                    break;

                default:
                    System.out.println("Opção Invalida");
                    break;
            }

        }


        sc.close();
    }
}
