import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Iterator<Livro> iterator = livros.iterator();

        int opc = 1;

        while(opc != 5){
            System.out.println("1 - Adicionar um livro");
            System.out.println("2 - Exibir todos os livros");
            System.out.println("3 - Editar Livro");
            System.out.println("4 - Remover um livro");
            System.out.print("Qual opção: ");
            opc = sc.nextInt();
            System.out.println();

            switch(opc){
                case 1:
                    System.out.print("Digite o titulo do livro: ");
                    String titulo = sc.next();

                    sc.nextLine();

                    System.out.print("Digite o autor: ");
                    String autor = sc.next();

                    sc.nextLine();

                    System.out.print("Digite o ano de publicação: ");
                    int anoPublicacao = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Digite o preço do livro: ");
                    Double preco = sc.nextDouble();

                    sc.nextLine();

                    Livro l1 = new Livro(titulo, autor, anoPublicacao, preco);
                    livros.add(l1);
                    System.out.println("Livro Adicionado com sucesso!");
                    System.out.println();
                    break;

                case 2:
                    if(livros.size() == 0){
                        System.out.println("Não tem livros cadastrados");
                    }
                
                    for(int i = 0; i < livros.size(); i++){
                        System.out.println((i + 1) + "º Livro: " + livros.get(i).exibirInformacoes());
                    }    
                    break;

                case 3:
                    System.out.println("Digite o indice do livro: ");
                    int indice = sc.nextInt();

                    if(indice < 1 || indice > livros.size()){
                        System.out.println("Livro não exite!");
                    }

                    Livro livro = livros.get(indice - 1);

                    System.out.print("Digite o titulo do livro: ");
                    String tit = sc.next();

                    sc.nextLine();

                    System.out.print("Digite o autor: ");
                    String aut = sc.next();

                    sc.nextLine();

                    System.out.print("Digite o ano de publicação: ");
                    int anoPublica = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Digite o preço do livro: ");
                    Double pre = sc.nextDouble();
                    
                    sc.nextLine();

                    livro.setTitulo(tit);
                    livro.setAutor(aut);
                    livro.setAnoPublicacao(anoPublica);
                    livro.setPreco(pre);

                    System.out.println("Livro editado com sucesso");
                    System.out.println("Livro editado: " + livro);
                    break;

                case 4:

                    System.out.print("Digite o titulo do livro que irá remover: ");
                    String titu = sc.next();

                    for(int id = 0; id < livros.size(); id++){
                        if(livros.get(id).getTitulo().equalsIgnoreCase(titu)){
                            livros.remove(id);
                            System.out.println("Livro removido com sucesso");
                        }
                    }

                    break;

                case 5:
                    System.out.println("Saindo do sistema");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;


            }       

        }


        sc.close();
    }
}
