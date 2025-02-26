
import java.util.ArrayList;
import java.util.Scanner;

public class PessoaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Pessoa> list = new ArrayList<>();

        int op = 0;
        while(op != 4){
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.print("Escolha a opção: ");
            op = sc.nextInt();

            switch(op){
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.next();

                    sc.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefone = sc.next();

                    list.add(new Pessoa(nome, telefone));
                    break;

                case 2:
                    if(list.isEmpty()){
                        System.out.println("Lista vazia");
                        return;
                    }

                    for(Pessoa p : list){
                        System.out.println("Nome: " + p.getNome() + " - Telefone: " + p.getTelefone());
                    }
                    break;

                case 3:
                    if(list.isEmpty()){
                        System.out.println("Lista vazia");
                        return;
                    }

                    System.out.println("Digite o indice a ser Removido: ");
                    int indice = sc.nextInt();

                    if(indice >= 0 && indice < list.size()){
                        System.out.println("Contato Removido com sucesso, no indice: " + indice);
                        list.remove(indice);
                    }

                    break;

                case 4:
                    System.out.println("Saindo do Sistema");
                    break;

                default:
                    System.out.println("Opção Invalida!");
                    break;

            }

        }


        sc.close();
    }
}
