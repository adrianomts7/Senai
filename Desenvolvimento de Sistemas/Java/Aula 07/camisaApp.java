
import java.util.ArrayList;
import java.util.Scanner;

public class  camisaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Camisa> lista = new ArrayList<>();
        int op = 1;

        while(op != 5){
            System.out.println("\n === Menu das Camisas ===");
            System.out.println("1 - Registrar Camisas");
            System.out.println("2 - Listar Camisas");
            System.out.println("3 - Remover Camisas");
            System.out.println("4 - Editar Camisas");
            System.out.println("5 - Sair Sistema");
            System.out.print("Qual opção: ");
            op = sc.nextInt();

            switch(op){
                case 1:
                    System.out.print("Digite a cor da camisa: ");
                    String camisa = sc.next();

                    sc.nextLine();

                    System.out.print("Digite o Tamanho da camisa: ");
                    String tamanho = sc.next();

                    sc.nextLine();

                    System.out.print("Digite o tipo da camisa: ");
                    String tipo = sc.next();
                    
                    lista.add(new Camisa(camisa, tamanho, tipo));
                    System.out.println("Camisa Registrado com sucesso");
                    break;

                case 2:
                    if(lista.isEmpty()){
                        System.out.println("Lista vazia");
                        return;
                    }

                    for(Camisa c : lista){
                        System.out.println();
                        System.out.println("Cor: " + c.getCor() + "\nTamanho: " + c.getTamanho() + "\nTipo: " + c.getTipo());
                    }
                    
                    break;

                case 3:
                    if(lista.isEmpty()){
                        System.out.println("Lista está vazia");
                        return;
                    }

                    System.out.print("Digite o indice da camisa: ");
                    int indice = sc.nextInt();

                    if(indice >= 0 || indice < lista.size()){
                        lista.remove(indice);
                        System.out.println("Camisa Removido com sucesso!");
                    }

                    break;

                case 4:
                    if(lista.isEmpty()){
                        System.out.println("Lista vazia");
                        return;
                    }    

                    System.out.print("Digite o indice da camisa que irá editar: ");
                    int ind = sc.nextInt();

                    if(ind >= 0 && ind < lista.size()){

                        System.out.print("Digite a cor da camisa: ");
                        String cor = sc.next();
    
                        sc.nextLine();
    
                        System.out.print("Digite o Tamanho da camisa: ");
                        String tam = sc.next();
    
                        sc.nextLine();
    
                        System.out.print("Digite o tipo da camisa: ");
                        String tip = sc.next();

                        lista.set(ind, new Camisa(cor, tam, tip));
                        System.out.println("Camisa editada com sucesso");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do Sistema");
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }   

        }

        sc.close();
    }
}
