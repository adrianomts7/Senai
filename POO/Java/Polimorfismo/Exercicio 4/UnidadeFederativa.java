public enum UnidadeFederativa {
    BAHIA("Bahia","BA"),SAO_PAULO("São Paulo","SP"),RIO_DE_JANEIRO("Rio de Janeiro","RJ");

    String nome;
    String sigla;

    UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
