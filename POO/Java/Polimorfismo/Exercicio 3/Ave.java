public class Ave extends Animal{
    private String corPele;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo sementes");
    }

    public void fazerNInho(){
        System.out.println("Fazendo Ninho");
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
}
