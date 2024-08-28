public class Main {

    public static void main(String[] args) {
        Bolsista b1 = new Bolsista("Marta",22,"F",1234,"Informatica", 350.99F);
        System.out.println(b1.getCurso());
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico("Maria",30,"Feminino",2314,"Segurança do Trabalho",231498);
        System.out.println(t1.registroProfissional);
        t1.praticar();

    }

}