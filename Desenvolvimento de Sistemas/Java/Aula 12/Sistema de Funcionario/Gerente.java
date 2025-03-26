public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, String cargo, double bonus) {
        super(nome, salario, cargo);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void calculaBonus(){
        System.out.println("Bônus: " + ((getSalario() * 10) / 100 ));
    }

}
