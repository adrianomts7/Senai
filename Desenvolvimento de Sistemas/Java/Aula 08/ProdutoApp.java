
import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Produto> produtos = new ArrayList<>();

        System.out.print("Deseja inserir quantos produtos: ");
        int insercao = sc.nextInt();

        for(int i = 0; i < insercao; i++){
            System.out.println();
            System.out.print("Nome do Produto: ");
            String nome = sc.next();

            sc.nextLine();

            System.out.print("Preço do produto: ");
            double preco = sc.nextDouble();

            sc.nextLine();

            System.out.print("Quantidade do " + nome + ": ");
            int quantidade = sc.nextInt();

            produtos.add(new Produto(nome, preco, quantidade));

            System.out.println("Produto Registrado com sucesso!");
        }
        
        int cont = 1;

        for(Produto p : produtos){
            System.out.println();
            System.out.println(cont + "º Produto");
            System.out.println("Produto: " + p.getNome() + "\nPreço: " + p.getPreço() + "\nQuantidade: " + p.getQuantidade());
            cont ++;
        }

        sc.close();
    }
}
