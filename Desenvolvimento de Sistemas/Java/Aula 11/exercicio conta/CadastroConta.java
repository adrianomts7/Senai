import java.util.ArrayList;

public class CadastroConta {
    
    private ArrayList<Conta> contas;

    public CadastroConta() {
        contas = new ArrayList<>();
    }

    public void cadastrarConta(String numeroConta, String nome, Double saldo){
        try {
            for(Conta conta : contas){
                
                if(conta.getNumeroConta().equals(numeroConta)){
                    throw new ExcecaoConta.DadosInvalido("Essa Conta já existe");
                }
            }
            contas.add(new Conta(numeroConta, nome, saldo));
        } catch (ExcecaoConta.DadosInvalido e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public Conta buscarConta(String numero) throws ExcecaoConta.ElementoInexistente  {
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numero)) {
                return conta; 
            }
        }
        
        throw new ExcecaoConta.ElementoInexistente("Conta Inexistente: " + numero);
    }

    public void buscarContaUsuario(String numero){
        try{
            Conta conta = buscarConta(numero);
            System.out.println("Conta Encontrada: " + conta.getNome() + "\nNúmero da Conta: " + conta.getNumeroConta() + "\nSaldo: R$ " + conta.getSaldo());
        }
        catch (ExcecaoConta.ElementoInexistente e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void removerConta(String numero){
        try {
            for(Conta conta : contas){
                if(conta.getNumeroConta().equals(numero)){
                    contas.remove(conta);
                    System.out.println("Conta removida com sucesso");
                }

                if(conta.getNumeroConta().equals(numero)){
                    throw new ExcecaoConta.ElementoInexistente("A conta não existe");
                }

            }
        }   
         catch (ExcecaoConta.ElementoInexistente e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
