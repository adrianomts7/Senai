public class main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Adriano", 50500.99, "Desenvovedor Senior", 2000);
        Assistente a1 = new Assistente("Maria",  3500.00, "Asistente");

        g1.calculaBonus();
        a1.calcularBonus();

    }
}
