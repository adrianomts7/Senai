
import java.util.ArrayList;

public class ArrayL{
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        System.out.println();
        
        for(Integer numero: numeros){
            System.out.println(numero);
        }

        System.out.println();

        int tamanho = numeros.size();
        System.out.println("Tamanho do array" + tamanho);

        System.out.println();

        boolean existeElemneto30 = numeros.contains(30);
        System.out.println("Existe o elemento 30: " + existeElemneto30);

        System.out.println();

        numeros.remove(Integer.valueOf(30));
        System.out.println("Após a remoção do elemento 30");
        for(Integer num : numeros){
            System.err.println(num);
        }
    }
}