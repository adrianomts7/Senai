public class Advogado extends Funciionario{
    private String oab;

    public Advogado(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, String oab) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }



    @Override
    public String toString() {
        return super.toString() +
                "\nAdvogado" +
                "\nOab: " + oab;
    }

    @Override
    public double salarioFinal() {
        return 0;
    }
}
