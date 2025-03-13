public class Cachoro extends Animal{

    private String raca;

    public Cachoro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " AU AU AU");
        
    }
    
}
