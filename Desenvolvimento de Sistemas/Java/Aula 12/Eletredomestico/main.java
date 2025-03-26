public class main {
    public static void main(String[] args) {
        Geladeira g1 = new Geladeira("Brastemp", 220, 550);
        g1.ligar();

        Microondas m1 = new Microondas("Mondial", 220, 5);
        m1.ligar();

    }
}
