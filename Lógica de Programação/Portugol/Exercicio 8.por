programa {
  funcao inicio() {
  // Declarando variaveis
  cadeia login, senha, loginCadastrado = "Adriano", senhaCadastrada = "017"

  // Solicitando dados ao usuario
  escreva("Digite o Login: ")
  leia(login)

  escreva("Digite sua senha: ")
  leia(senha)

  // Verificando usuário é senha>
  se(login == loginCadastrado e senha == senhaCadastrada){
    escreva("Seja Bem Vindo")
  } senao {
    escreva("Acesso Negado!")
  }
  }
}
