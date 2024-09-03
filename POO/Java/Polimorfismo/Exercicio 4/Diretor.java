public class Diretor extends CargoDeConfiança implements Contratacao{

    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    private double PREMIO = 0.5;


    @Override
    public void admitir(Funciionario funcionario) {
        System.out.println(funcionario + " Foi admitido");
    }

    @Override
    public void demitir(Funciionario funcionario) {
        System.out.println(funcionario + " Foi demitido");
    }

    @Override
    public double salarioFinal() {
        double sf = 0;
        sf = ((getSalario() * bonificacao.DIRETOR.getV()) + getSalario() * PREMIO);
        sf += getSalario();
        return sf;
    }

    @Override
    public String toString() {
        return  "\nDiretor" +
                super.toString() +
                "PREMIO=" + PREMIO;
    }
}
