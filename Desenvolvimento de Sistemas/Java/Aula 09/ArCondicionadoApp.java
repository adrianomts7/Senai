
import java.util.ArrayList;
import java.util.Scanner;

public class ArCondicionadoApp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);    

        ArrayList<Splinter> splinter = new ArrayList<>();
        ArrayList<Portatil> portatil = new ArrayList<>();

        int modelo = 1;

        while(modelo != 4){
            System.out.println("1 - Splinter");
            System.out.println("2 - Portatil");
            System.out.println("3 - Exibir Relatorios");
            System.out.println("Digite o número conforme seja o seu ar condicionado: ");
            modelo = sc.nextInt();
            sc.nextLine();

            switch(modelo){
                case 1:
                    System.out.print("Digite o Codigo: ");
                    String codigo = sc.next();

                    sc.nextLine();

                    System.out.print("Digite a marca: ");
                    String marca = sc.next();

                    sc.nextLine();

                    System.out.print("Btu: ");
                    String btu = sc.next();

                    sc.nextLine();

                    System.out.print("Defeito: ");
                    String defeito = sc.next();
                    
                    sc.nextLine();

                    System.out.print("Tipos: ");
                    String tipos = sc.next();

                    sc.nextLine();

                    System.out.print("Tamanho: ");
                    int tamanho = sc.nextInt();

                    Splinter spli = new Splinter(codigo, marca, btu, defeito, tipos, tamanho);

                    splinter.add(spli);

                    break;

                case 2:
                    System.out.print("Digite o Codigo: ");
                    String cod = sc.next();

                    sc.nextLine();

                    System.out.print("Digite a marca: ");
                    String mar = sc.next();

                    sc.nextLine();

                    System.out.print("Btu: ");
                    String bt = sc.next();

                    sc.nextLine();

                    System.out.print("Defeito: ");
                    String def = sc.next();
                    
                    sc.nextLine();

                    System.out.print("Voltagem: ");
                    int voltagem = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Cor: ");
                    String cor = sc.next();

                    Portatil por = new Portatil(cod, mar, bt, def, voltagem, cor);
                    portatil.add(por);

                    break;
                
                case 3:
                    System.out.println("Exibindo Relatorio dos Ar condicionados Splinter");
                    for(int i = 0; i < splinter.size(); i++){
                        System.out.println();
                        System.out.println((i + 1) + "º Modelo: " + splinter.get(i).toString());
                    }

                    System.out.println("Exibindo Relatorio dos Ar Condicionado Portatil");
                    for(int i = 0; i < portatil.size(); i++){
                        System.out.println();
                        System.out.println((i + 1) + "º Modelo: " + portatil.get(i).toString());
                    }

                case 4:
                    System.out.println("Saindo do Sistema");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;

            }       


        }

    
        sc.close();
    }
}
