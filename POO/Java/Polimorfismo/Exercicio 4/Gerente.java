public class Gerente extends CargoDeConfiança{

    public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    @Override
    public double salarioFinal() {
        double sf = 0;
        sf = getSalario() * bonificacao.GERENTE.getV();
        sf += getSalario();
        return sf;
    }

    @Override
    public String toString() {
        return "\nGerente" +
                super.toString();
    }

}
