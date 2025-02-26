
import java.util.ArrayList;
import java.util.Scanner;

public class CarrosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Carros> listCars = new ArrayList<>();
        int opc = 1;

        while(opc != 5){
            System.out.println("\n === Menu Carros ===");
            System.out.println("1 - Registrar Carro");
            System.out.println("2 - Listar Carros");
            System.out.println("3 - Remover Carro");
            System.out.println("4 - Editar carro");
            System.out.println("5 - Sair Sistema");
            System.out.print("Qual opção: ");
            opc = sc.nextInt();

            switch(opc){
                case 1: 
                    System.out.print("Digite a marca do carro: ");
                    String carro = sc.next();

                    sc.nextLine();

                    System.out.print("Digite o modelo do carro: ");
                    String modelo = sc.next();

                    sc.nextLine();

                    System.out.print("Ano de Fabricação do carro: ");
                    String anoFabricacao = sc.next();

                    listCars.add(new Carros(carro, modelo, anoFabricacao));
                    System.out.println("Carrro registrado com sucesso!");

                    break;

                case 2: 
                    if(listCars.isEmpty()){
                        System.out.println("Lista Vazia");
                        return;
                    }

                    for(Carros c : listCars){
                        System.out.println("Marca: " + c.getMarca() + "\nModelo: " + c.getModelo() + "\nAno Fabricação: " + c.getAnoFabricacao());
                        System.out.println();
                    }

                    break;

                case 3:
                    if(listCars.isEmpty()){
                        System.out.println("Lista vazia");
                        break;
                    }

                    System.out.print("Digite o indice que deseja remover: ");
                    int indice = sc.nextInt();

                    if(indice >= 0 && indice < listCars.size()){
                        listCars.remove(indice);
                        System.out.println("Carro removido com sucesso!");
                    }

                    break;

                case 4:
                    if(listCars.isEmpty()){
                        System.out.println("Lista vazia");
                        break;
                    }

                    System.out.print("Digite o indice que deseja editar: ");
                    int ind = sc.nextInt();

                    if(ind >= 0 && ind < listCars.size()){

                        System.out.print("Digite a marca do carro: ");
                        String car = sc.next();
    
                        sc.nextLine();
    
                        System.out.print("Digite o modelo do carro: ");
                        String mod = sc.next();
    
                        sc.nextLine();
    
                        System.out.print("Ano de Fabricação do carro: ");
                        String anoFabri = sc.next();
    
                        listCars.set(ind, new Carros(car, mod, anoFabri));
                        System.out.println("Contato Editado com sucesso!");

                    }

                    break;
                
                case 5:
                    System.out.println("Saindo do Sistema");
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;

            }

        }

        sc.close();
    }
}
