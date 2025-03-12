public class Splinter extends ArCondicionado{
    
    private String tipos;
    private int tamanho;
    
    public Splinter(String codigo, String marca, String btu, String defeito, String tipos, int tamanho) {
        super(codigo, marca, btu, defeito);
        this.tipos = tipos;
        this.tamanho = tamanho;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Splinter \nTipos:" + tipos + " \nTamanho:" + tamanho + " \nCodigo: "
                + getCodigo() + " \nMarca: " + getMarca() + " \nBtu: "
                + getBtu() + "\nDefeito:" + getDefeito();
    }


}
