public class Circulo extends Forma{
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea(){
       System.out.println("Circulo: " + Math.PI * (raio * 2));
    }

}
