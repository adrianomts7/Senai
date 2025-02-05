import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String p1 = sc.nextLine();

        System.out.print("Digite outra palavra: ");
        String p2 = sc.nextLine();

        System.out.println(p1 + " " + p2);

        sc.close();
    }
}
