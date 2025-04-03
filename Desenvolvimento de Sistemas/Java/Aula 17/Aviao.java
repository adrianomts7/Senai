import java.util.ArrayList;

public class Aviao {
    private int qtdAviao;
    private int qtdAssentos;
    private int numeroAviao;

    public Aviao(int qtdAssentos, int qtdAviao, int numeroAviao) {
        this.qtdAssentos = qtdAssentos;
        this.qtdAviao = qtdAviao;
        this.numeroAviao = numeroAviao;
    }

    public int getQtdAviao() {
        return qtdAviao;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void atualizarNumeroAssentos(int novoAssentos) {
        this.qtdAssentos = novoAssentos;
    }

    public void reservarAssento(){
        if(qtdAssentos > 0){
            qtdAssentos --;
        }
    }

    public int getNumeroAviao() {
        return numeroAviao;
    }

}