
import java.util.Scanner;

public class ClienteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Nome: ");
        String nome = sc.next();

        sc.nextLine();

        System.out.print("Digite o email: ");
        String email = sc.next();

        sc.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = sc.next();

        Cliente cliente = new Cliente(nome, email, telefone);

        System.out.println("\nNome: " + cliente.getNome() + "\nE-mail: " + cliente.getEmail() + "\nTelefone: " + cliente.getTelefone());

        sc.close();
    }
}
