import java.util.ArrayList;

public class Passageiro {
    private String nome;
    private int qtdReserva = 0;
    private ArrayList<Aviao> avioesReserva = new ArrayList<>();

    public Passageiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdReserva() {
        return qtdReserva;
    }

    public ArrayList<Aviao> getNumeroAvioesReserva() {
        return avioesReserva;
    }

    public void adicionarReserva(Aviao aviao){
        qtdReserva ++;
        boolean existe = false;

        if(avioesReserva.isEmpty()){
            avioesReserva.add(aviao);
        }
        
        for(Aviao avi : avioesReserva){
            if(aviao.getNumeroAviao() == avi.getNumeroAviao()){
                existe = true;
                break;
            }
        }

        if(!existe){
            avioesReserva.add(aviao);
        }
        
        aviao.reservarAssento();
    }

}