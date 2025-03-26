public class Assistente extends Funcionario {
    
    public Assistente(String nome, Double Salario, String cargo){
        super(nome, Salario, cargo);
    }

    public void calcularBonus(){
        System.out.println("Bônus: " + (getSalario() * 5) / 100 );
    }

}
