import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivos{
    public static void main(String[] args) {
        try{
            FileWriter escritor = new FileWriter("arquivo.txt");

            escritor.write("Olá, este é um arquivo de teste!\n");
            escritor.write("Hello world!");
            escritor.close();

            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar um arquivos");
            e.printStackTrace();
        } 
    }
}