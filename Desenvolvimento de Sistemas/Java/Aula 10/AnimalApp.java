import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Animal> dogs = new ArrayList<>();
        ArrayList <Gato> cats = new ArrayList<>();

        String cachorro = "cachorro";
        String gatos = "gatos";

        int opc = 1;

        while(opc != 3){
            System.out.println();
            System.out.println("1 - Adicionar novo animal");
            System.out.println("2 - Fazer um Animal emitir som");
            System.out.println("3 - Sair");
            System.out.print("Qual opção: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch(opc){
                case 1:
                    System.out.println();

                    System.out.println("Qual Tipo de Animal deseja Registrar: (Cachorro/Gato) ");
                    String tipo = sc.next();                    

                    sc.nextLine();

                    if(tipo.equals(cachorro)){
                        System.out.println();
                        System.out.print("Digite o nome do animal: ");
                        String nome = sc.next();
    
                        sc.nextLine();
                    
                        System.out.print("Digite a Raça: ");
                        String raca = sc.next();
    
                        sc.nextLine();
    
                        Cachoro dog = new Cachoro(nome, raca);
    
                        dogs.add(dog);
                    }

                    if(tipo.equals(gatos)){
                        System.out.println();
                        System.out.print("Digite o nome do animal: ");
                        String no = sc.next();
    
                        sc.nextLine();
                    
                        System.out.print("Digite a Cor: ");
                        String cor = sc.next();

                        sc.nextLine();

                        Gato cat = new Gato(no, cor);
                        cats.add(cat);
                    }

                    break;

                case 2:
                    if(dogs.size() < 0 && cats.size() < 0){
                        System.out.println("Lista Vazia");
                        continue;
                    }

                    System.out.print("Qual animal deseja emitir som: ");
                    String animal = sc.next();

                    sc.nextLine();
                    

                    if(animal.equals(cachorro)){
                        for(int i = 0; i < dogs.size(); i++){
                            System.out.println((i + 1) + "º: " +  dogs.get(i).getNome());
                        }

                        System.out.print("Digite o indice do Cachorro que deseja emitir o som: ");
                        int ind = sc.nextInt();
                        System.out.println();
                        dogs.get(ind - 1).fazerSom();
                    }

                    if(animal.equals(gatos)){
                        for(int i = 0; i < cats.size(); i++){
                            System.out.println((i + 1) + "º: " + cats.get(i).getNome() + cats.get(i).getCor());
                        }

                        System.out.print("Digite o indice do Gato que deseja emitir o som: ");
                        int ind = sc.nextInt();

                        cats.get(ind).fazerSom();
                    }

                    break;

                case 3:
                    System.out.println("Saindo do Sistema");
                    break;

                default:
                    System.out.println("Opção Invalida");
                    break;

            }

        }
        
        sc.close();
    }

}
