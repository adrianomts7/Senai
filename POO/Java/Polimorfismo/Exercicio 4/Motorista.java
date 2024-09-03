public class Motorista extends Funciionario{
    private String habilitacao;

    public Motorista(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, String habilitacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.habilitacao = habilitacao;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    @Override
    public String toString() {
        return "Motorista: " +
                super.toString() +
                "\nHabilitação: " + habilitacao;
    }

    @Override
    public double salarioFinal() {
        return 0;
    }
}
