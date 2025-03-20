public class Conta {

    private String numeroConta;
    private String nome;
    private Double saldo;
    
    public Conta(String numeroConta, String nome, Double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        try{

            if(numeroConta == null){
                throw new ExcecaoConta.DadosInvalido("Número invalido");
            }

            if(numeroConta.length() < 2){
                throw new ExcecaoConta.DadosInvalido("Número de conta invalido");
            }

            this.numeroConta = numeroConta;
        }
        catch(ExcecaoConta.DadosInvalido e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        try {
            
            if(nome == null){
                throw new ExcecaoConta.DadosInvalido("Nome invalido");
            }

            this.nome = nome;
        } 
        catch (ExcecaoConta.DadosInvalido e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        try {
            
            if(saldo == null){
                throw new ExcecaoConta.DadosInvalido("Saldo Invalido");
            }

            this.saldo = saldo;
        } catch (ExcecaoConta.DadosInvalido e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}

