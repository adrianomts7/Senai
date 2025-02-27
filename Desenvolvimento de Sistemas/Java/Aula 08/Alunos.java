
import java.util.ArrayList;

public class Alunos {
    private String nome;

    private ArrayList<Double> notas = new ArrayList<>();

    public Alunos(String nome){
        this.nome = nome;
        this.notas =  new ArrayList<>();
    }

    public void AdicionarNota(Double nota){
        this.notas.add(nota);
    }

    public double calcularMedia(){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.size();
    }

    public ArrayList<Double> getNotas(){
        return this.notas;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
