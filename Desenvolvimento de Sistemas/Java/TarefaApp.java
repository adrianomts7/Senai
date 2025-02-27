import java.util.ArrayList;
import java.util.Scanner;

public class TarefaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Tarefa> tarefas = new ArrayList<>();

        System.out.print("Quantas tarefas deseja registrar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < quantidade; i++){
            System.out.println();
            System.out.print("Descrição da tarefa: ");
            String descricao = sc.nextLine();

            System.out.print("Status da tarefa: (concluida / pendente) ");
            String status = sc.nextLine().toLowerCase();

            tarefas.add(new Tarefa(descricao, status));

        }

        for(Tarefa tarefa : tarefas){
            if(!tarefa.getStatus().equalsIgnoreCase("concluida")){
                System.out.println("Tarefa Pendente: " + tarefa.getDescricao() );
                continue;
            }
            
            System.out.println("Tarefa Concluida: " + tarefa.getDescricao());
        }

        sc.close();
    }
}
