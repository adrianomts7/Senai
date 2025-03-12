public class AnimalApp {
    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro("Max", 4, "Vira Lata");
        Gato g1 = new Gato("Quem sabe", 3, "Branco");

        g1.exibirInfo();
        c1.exibirInfo();

    }
}
