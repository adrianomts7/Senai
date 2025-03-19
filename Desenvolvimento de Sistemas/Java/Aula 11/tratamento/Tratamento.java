package tratamento;

public class Tratamento {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitido!");
        }
        finally{
            System.out.println("Finalizando o projeto");
        } 
    }
}
