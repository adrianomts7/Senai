
public class Main {
    public static void main(String[] args) {

    CadastroConta cadastro = new CadastroConta();

    // Cadastrando Conta
    cadastro.cadastrarConta("20", "Adriano", 200.0);

    // Conta já existe
    cadastro.cadastrarConta("20", "Mateus", 50.0);

    // Verificando se a conta e valida "Conta invalida"
    cadastro.buscarContaUsuario("21");
    
    // Conta Existe
    cadastro.buscarContaUsuario("20");
    
    // Removendo conta cadastrada
    cadastro.removerConta("20");        

    }
}
