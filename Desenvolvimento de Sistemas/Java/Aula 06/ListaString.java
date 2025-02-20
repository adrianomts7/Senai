
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            System.out.print("Digite alguma palavra: ");
            String valor = sc.nextLine();

            lista.add(valor);
        }


        System.out.println();
        System.out.println("Palavras digitadas pelo usuario");
        for(String palavra : lista){
            System.out.println(palavra);
        }
        
        Collections.sort(lista);

        System.out.println();
        System.out.println("Lista ordenada: " + lista);

        sc.close();
    }
}
