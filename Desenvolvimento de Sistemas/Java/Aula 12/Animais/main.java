
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opc = 1;

        while (opc != 4) {
            System.out.println("1 - Cachorro");
            System.out.println("2 - Gato");
            System.out.println("3 - Vaca");
            System.out.println("Qual Animal desekja adicionar: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opc) {
                case 1:
                    Cachorro c1 = new Cachorro();
                    c1.fazerSom();
                    animais.add(c1);
                    System.out.println("Animal Adicionado com sucesso");
                    break;

                case 2: 
                    Gato g1 = new Gato();
                    g1.fazerSom();
                    System.out.println("Animal Adicionado com sucesso");
                    animais.add(g1);
                    break;

                case 3:
                    Vaca v1 = new Vaca();
                    v1.fazerSom();
                    System.out.println("Animal Adicionado com sucesso");
                    animais.add(v1);
                    break;

                case 4:
                    System.out.println("Saindo do sistema de animais");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }

        }


        sc.close();
    }
}
