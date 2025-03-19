package tratamento;

public class array {
    public static void main(String[] args) {
        int[]Array = { 10,20,30,40 };
        int indices = 5;

        try {
            System.out.println("Elemento do indice: " + indices + " : " + Array[indices]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Elemento não pertence ao indece");
        }
        finally{
            System.out.println("Finalizando");
        }

    }
}
