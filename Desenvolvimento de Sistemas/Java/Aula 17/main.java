import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opc = 1;
        ArrayList<Aviao> avioes = new ArrayList<>();
        ArrayList<Passageiro> passageiros = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos aviões disponiveis: ");
        int qtdAviao = sc.nextInt();
       
        sc.nextLine();

        if(qtdAviao > 4) {
            System.out.println("Quantidade de avião indisponivel");
            return;
        }
        

        while(opc != 6) {
            System.out.println("1 - Registrar número de avião");
            System.out.println("2 - Assentos disponiveis nos aviões");
            System.out.println("3 - Reservar passagem aérea");
            System.out.println("4 - Realizar consulta por avião");
            System.out.println("5 - Realizar consulta por Passageiro");
            System.out.println("6 - Encerrar sistema");
            System.out.print("Qual opcao: ");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            switch(opc) {
                case 1: 
                    if(avioes.size() >= qtdAviao){
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        System.out.print("Todos os aviões ja foram cadastrado");
                        continue;
                    }
                    
                    boolean numeroExiste = false;

                    for(int i = 0; i < qtdAviao; i++) {
                        System.out.print("Digite a quantidade de assentos do " + (i + 1) + "º avião: ");
                        int assento = sc.nextInt();
                        
                        sc.nextLine();

                        System.out.print("Digite o número do " + (i + 1) + "º Avião: ");
                        int numeracaoAviao = sc.nextInt();

                        for(Aviao avi : avioes) {
                            if(avi.getNumeroAviao() == numeracaoAviao){
                                System.out.println("Esse número de avião, já foi cadastrado");
                                numeroExiste = true;
                                return;
                            }

                        }

                        if(!numeroExiste){
                            avioes.add(new Aviao(assento, qtdAviao, numeracaoAviao));
                            System.out.println("Avião cadastrado com sucesso");
                        }

                        System.out.print("\033[H\033[2J");  
                        System.out.flush();

                    }
                    
                    break;

                case 2:
                    if(avioes.isEmpty()){
                        System.out.println("Não tem nenhum avião registrado");
                        continue;
                    }

                    for(Aviao avi : avioes){    
                        System.out.println("Avião: " + avi.getNumeroAviao() + "\nQuantidade de Assentos " + avi.getQtdAssentos());
                        System.out.println();
                    }

                    break;

                case 3:
                    boolean aviaoExiste = false;
                    Passageiro passageiroEncontrado = null;

                    if(avioes.isEmpty()){
                        System.out.println("Não tem nenhum avião cadastrado");
                        continue;
                    }
                    
                    System.out.print("Digite o número do avião: ");
                    int numeracaoAviao = sc.nextInt();

                    sc.nextLine();

                    for(Aviao avi : avioes){
                        if(avi.getQtdAssentos() == 0){
                            System.out.println("Não tem assentos disponiveis");
                            continue;
                        }

                        if(avi.getNumeroAviao() == numeracaoAviao){
                            aviaoExiste = true;
                            System.out.print("Digite o nome do passageiro: ");
                            String nome = sc.nextLine();

                            if(nome == null){
                                System.out.println("Digite um nome válido!");
                            }

                            for(Passageiro passageiro : passageiros){
                                if(passageiro.getNome().equalsIgnoreCase(nome)){
                                    passageiroEncontrado = passageiro;
                                }
                            }
                            
                            if(passageiroEncontrado == null){
                                Passageiro p1 = new Passageiro(nome);
                                passageiroEncontrado = p1;
                                passageiros.add(p1);
                                System.out.println("cadastro adicionada com sucesso");
                            }

                            passageiroEncontrado.adicionarReserva(avi);
                            System.out.println("Reserva realizada com sucesso");
                        } 


                    }
                    if(!aviaoExiste){
                        System.out.println("Este avião não existe");
                    }
                    
                    break;
                
                case 4:
                    System.out.println();
                    
                    if(avioes.isEmpty()){
                        System.out.println("Não tem nenhum avião cadastrado");
                    }
                    
                    System.out.print("Digite o número do avião: ");   
                    int numeroAviao = sc.nextInt();
                    
                    boolean aviaoNaoExiste = true;

                    for(Aviao avi : avioes){
                        System.out.println();
                        if(avi.getNumeroAviao() == numeroAviao){
                            aviaoNaoExiste = false;
                            System.out.println("Avião " + avi.getNumeroAviao());
                            
                            for(Passageiro cliente : passageiros){
                                for(Aviao aviao : cliente.getNumeroAvioesReserva()){
                                    if(aviao.getNumeroAviao() == numeroAviao){
                                        System.out.println("Nome: " + cliente.getNome() + " - " + " Quantidade de Reservas: " + cliente.getQtdReserva());
                                    }
                                }
                            }
                       
                        }
                    }

                    try {
                        
                        for(Aviao avi : avioes){
                            System.out.println();
                            if(avi.getNumeroAviao() == numeroAviao){
                                aviaoNaoExiste = false;
                                FileWriter escritor = new FileWriter("dadosAvioes " + avi.getNumeroAviao() + ".txt", true);
                                
                                System.out.println("Avião " + avi.getNumeroAviao());
                                escritor.write("=== Dados do aviaão " + avi.getNumeroAviao() + " ===\n");
                                escritor.write("\n");
                                
                                escritor.write("Assentos disponiveis: " + avi.getQtdAssentos());
                                escritor.write("\n");
                                
                                escritor.write("Passageiros: ");
                                for(Passageiro cliente : passageiros){
                                    for(Aviao aviao : cliente.getNumeroAvioesReserva()){
                                        
                                        if(aviao.getNumeroAviao() == numeroAviao){
                                            System.out.println("Nome: " + cliente.getNome() + " - " + " Quantidade de Reservas: " + cliente.getQtdReserva());
                                            escritor.write("\nNome: " + cliente.getNome() + " - " + " Quantidade de Reservas: " + cliente.getQtdReserva());
                                        }
                                    
                                    }
                                }
                                escritor.write("\n");
                                escritor.close();
                            }
                        }

                        
                    } catch (IOException e) {
                        System.out.println("Erro ao ");
                    }


                    if(aviaoNaoExiste){
                        System.out.println("Avião não existe");
                    }

                    break;

                case 5:
                    Passageiro passageiroAchado = null;
                
                    System.out.print("Nome do Passageiro: ");
                    String cliente = sc.nextLine();
            
                    for(Passageiro passageiro : passageiros){
                        if(passageiro.getNome().equalsIgnoreCase(cliente)){
                            passageiroAchado = passageiro;
                        }
                        }
                        
                    if(passageiroAchado != null){
                        try {
                            
                            System.out.print("\033[H\033[2J");  
                            System.out.flush();
                            
                            System.out.println("Nome: " + passageiroAchado.getNome());
                            System.out.println("Reservas: " + passageiroAchado.getQtdReserva());
                            
                            System.out.println("Você tem reserva nos Aviões");
                            for(Aviao avi : passageiroAchado.getNumeroAvioesReserva()){
                                System.out.println("Avião: " + avi.getNumeroAviao());
                            }

                            FileWriter escritor = new FileWriter("Reserva do Passageiro" + passageiroAchado + ".txt", true);

                            escritor.write("===== Dados do Passageiro " + passageiroAchado.getNome() + " =====");

                            // Criando arquivo com os dados da reserva do passageiro
                            escritor.write("Nome: " + passageiroAchado.getNome());
                            escritor.write("\n");
                            escritor.write("Reservas: " + passageiroAchado.getQtdReserva());
                            
                            escritor.write("\n");

                            escritor.write("Você tem reserva nos Aviões");
                            escritor.write("\n");
                            for(Aviao avi : passageiroAchado.getNumeroAvioesReserva()){
                                escritor.write("Avião: " + avi.getNumeroAviao());
                                break;
                            }

                            escritor.write("\n");
                            escritor.close();

                        } catch (IOException e) {
                            System.out.println("Ocorreu um erro ao criar um arquivo");
                            e.printStackTrace();
                        }
                    }

                    if(passageiroAchado == null){
                        System.out.println("Passageiro não encontrado");
                    }

                    break;    

                case 6:
                    System.out.println("Saindo do sistema");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;

            }

        }

        sc.close();
    }
}
