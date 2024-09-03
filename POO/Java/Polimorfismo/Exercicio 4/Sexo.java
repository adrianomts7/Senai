public enum Sexo {
    MASCULINO("Masculino"),FEMININO("Feminino");

    String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
