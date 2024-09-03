public enum Bonificacao {
    GERENTE(0.35),DIRETOR( 0.45);

    private double v;

    Bonificacao(double v) {
        this.v = v;
    }

    public double getV() {
        return v;
    }
}
