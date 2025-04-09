package Menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cadastro {
    public void cadastrar(){
        String nomeArquivo = "pesssoas.txt";
        Scanner sc = new Scanner(System.in);
        
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo, true))) {

            System.out.println("\033[H\033[23");
            System.out.flush();
            
            System.out.print("Digite o Nome: ");
            String nome = sc.nextLine();
    
            System.out.print("Digite a Idade: ");
            int idade = sc.nextInt();
    
            escritor.newLine();
            escritor.write("Nome: " + nome);
    
            escritor.newLine();
            escritor.write("Idade: " + idade + " Anos");
            escritor.newLine();
            escritor.close();
            
        } catch (IOException e) {
           System.out.println("Erro ao criar o arquivo");
        }

        sc.close();
    }
    
    public void listar(){
        String nomeArquivo = "pesssoas.txt";
        try(BufferedReader ler = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            
            while((linha = ler.readLine()) != null ) {
                System.out.println(linha);
            }
    
            ler.close();
    
        } catch(FileNotFoundException e){
            System.out.println("Erro ao achar o arquivo");
        }  catch (IOException e){
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
        }   
        
    }
}
