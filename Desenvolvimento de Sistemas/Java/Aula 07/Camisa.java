public class Camisa {

    private String cor;
    private String tamanho;
    private String tipo;

    public Camisa(String cor, String tamanho, String tipo){
        this.cor = cor;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public String getCor(){
        return  cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void SetTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

}
