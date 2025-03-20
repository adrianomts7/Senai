
public class ExcecaoConta {
    
    public static class DadosInvalido extends Exception{
        public DadosInvalido(String mensagem){
            super(mensagem);
        }
    }

    public static class Repositorio extends Exception{
        public Repositorio(String message){
            super(message);
        }
    }

    public static class ElementoJaExiste extends Exception{
        public ElementoJaExiste(String message){
            super(message);
        }
    }

    public static class ElementoInexistente extends Exception{
        public ElementoInexistente(String message){
            super(message);
        }
    }

}
