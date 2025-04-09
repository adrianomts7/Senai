
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrever{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a frase: ");
        String frase = sc.nextLine();


        String nomeArquivo = "message.txt";

        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            escritor.write(frase);
            escritor.newLine();
            escritor.close();
        } catch (IOException e) {
            System.out.println(" Erro ao criar o arquivo" + e.getMessage());
        } finally {
            System.out.println("Saindo do sistema");
        }

        sc.close();
    }
}