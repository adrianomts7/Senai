public class FuncionarioApp {
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente("Marcos", 1250.00);
        Programador p1 = new Programador("Adriano", 5);

        g1.calcularSalario();
        p1.calcularSalario();

    }
}
