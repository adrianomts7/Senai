public abstract class CargoDeConfiança  extends Funciionario{
    protected Bonificacao bonificacao;

    public CargoDeConfiança(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

}
