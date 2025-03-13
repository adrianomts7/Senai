public class Gerente extends Funcionario {
    private double salario;

    public Gerente(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salario: R$ " + salario);
    }

    

}
