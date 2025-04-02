
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UsuarioEscrevendoArquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter escritor = new FileWriter("mensagem.txt");
            
            System.out.print("Digite uma frase: ");
            String frase = sc.nextLine();

            escritor.write("Você digitou a frase: " + frase);
            escritor.close();

            System.out.println("Arquivo criado com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo");
            e.printStackTrace();
        }

    }
}
