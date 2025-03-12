public class Portatil extends ArCondicionado {

    private int voltagem;
    private String cor;

    public Portatil(String codigo, String marca, String btu, String defeito, int voltagem, String cor) {
        super(codigo, marca, btu, defeito);
        this.voltagem = voltagem;
        this.cor = cor;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Portatil \nvoltagem: " + voltagem + " \nCor: " + cor + " \nCodigo "
                + getCodigo() +  " Marca: " + getMarca() + "\nBtu: " + getBtu()
                + "Defeito: " + getDefeito();
    }

    


}
