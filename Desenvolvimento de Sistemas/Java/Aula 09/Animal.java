

public class Animal {
    
    private String nome;
    private int patas;
    
    public Animal(String nome, int patas) {
        this.nome = nome;
        this.patas = patas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Patas: " + patas);
    }

}
