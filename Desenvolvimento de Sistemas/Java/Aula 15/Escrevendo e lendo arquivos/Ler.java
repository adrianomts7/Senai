
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ler {
    public static void main(String[] args) {
        String nomeArquivo = "mensagem.txt";

        try(BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("Conteúdo do arquivo");

            while ((linha = leitor.readLine()) != null ) {
                System.out.println(linha);
            }

            leitor.close();

        } catch(FileNotFoundException e) {
            System.out.println(" Erro: arquivo " + nomeArquivo + " não foi encontrado" );
        } catch(IOException e) {
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
        }

    }
}
