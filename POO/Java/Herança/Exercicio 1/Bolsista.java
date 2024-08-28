public class Bolsista extends Aluno{
    private float bolsa;

    public void removerBolsa(){
        System.out.println("Renovando Bolsa de " + this.nome);
    }

    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento facilitado");
    }

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
