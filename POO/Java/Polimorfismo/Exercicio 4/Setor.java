public enum Setor {
    ENGENHARIA("Engenharia"),JURIDICO("Juridico"),RECURSOS_HUMANOS("Recursos Humanos"),MARKETING("Marketing"),OPERACOES("Operações");

    String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
