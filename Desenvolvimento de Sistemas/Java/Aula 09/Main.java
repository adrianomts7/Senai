public class Main {
    public static void main(String[] args) {
        
        Funcionario func = new Funcionario("Mateus", 22, 5250);

        Gerente ger = new Gerente("Adriano", 20, 10500, 5000);

        System.out.println(func.toString());
        System.out.println(ger.toString());

    }
}
