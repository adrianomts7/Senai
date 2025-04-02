
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoArquivoUsuario {
    public static void main(String[] args) {
        try {
            FileReader leitor = new FileReader("mensagem.txt");

            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha;

            while((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo");
            e.printStackTrace();
        }
    }
}
