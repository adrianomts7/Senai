public class Programador extends Funcionario {

    private double salario = 5000;
    private int qtdProjeto;
    private int bonus = 200;
    
    public Programador(String nome,int qtdProjeto) {
        super(nome);
        this.qtdProjeto = qtdProjeto;
    }

    public double getSalario() {
        return salario;
    }

    public int getQtdProjeto() {
        return qtdProjeto;
    }

    public void setQtdProjeto(int qtdProjeto) {
        this.qtdProjeto = qtdProjeto;
    }

    public int getBonus() {
        return bonus;
    }


    @Override
    public void calcularSalario() {
        System.out.println("Salário: " + (salario + (qtdProjeto * bonus)));
        
    }

}
