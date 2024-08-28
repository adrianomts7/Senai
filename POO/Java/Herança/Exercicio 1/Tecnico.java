public class Tecnico extends Aluno{
    protected int registroProfissional;

    public void praticar(){
        System.out.println("Praticando " + this.getCurso());
    }

    public Tecnico(String nome, int idade, String sexo, int matricula, String curso, int registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
