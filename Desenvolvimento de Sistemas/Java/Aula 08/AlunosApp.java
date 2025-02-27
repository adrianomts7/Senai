import java.util.Scanner;

public class AlunosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.next();

        Alunos aluno = new Alunos(nome);
        
        System.out.print("Quantas notas deseja inserir: ");
        int quantidade = sc.nextInt();

        double soma = 0;

        for(int i = 0; i < quantidade; i++){
            System.out.print("Digite a " + (i + 1) + "º Nota: ");
            double nota = sc.nextDouble();

            aluno.AdicionarNota(nota);
            System.out.println("Nota inserida com sucesso");
            System.out.println();
        }

        double media = soma / quantidade;

        System.out.println("Nome do aluno: " + aluno.getNome());

        int cont = 1;

        for(double nota : aluno.getNotas()){
            System.out.println(cont + "º Nota: " + nota);
            cont += 1;
        }

        System.out.println("Média do Aluno: " + aluno.calcularMedia());

        sc.close();
    }
}
