programa {
  funcao inicio() {
  // Declarando variaveis
    inteiro primeiroNumero, segundoNumero, terceiroNumero
    inteiro maiorNumero, menorNumero
  
  // Pedindo dados ao usuario
  escreva("Digite a primeiro número: ")
  leia(primeiroNumero)

  escreva("Digite o segundo número: ")
  leia(segundoNumero)

  escreva("Digite a Terceiro número: ")
  leia(terceiroNumero)

  // Verificando maior é menor número  
  se(primeiroNumero > segundoNumero e primeiroNumero > terceiroNumero)
    maiorNumero = primeiroNumero
    senao se(segundoNumero > terceiroNumero e segundoNumero > primeiroNumero)
    maiorNumero = segundoNumero
    senao
    maiorNumero = terceiroNumero

  se (primeiroNumero < segundoNumero e primeiroNumero < terceiroNumero)
    menorNumero = primeiroNumero
    senao se(segundoNumero < primeiroNumero e segundoNumero < terceiroNumero)
    menorNumero = segundoNumero
    senao
    menorNumero = terceiroNumero
  

escreva("\nExibindo resultados")
escreva("\nMaior número digitado foi ", maiorNumero)
escreva("\nMenor Número digitado foi ", menorNumero)
  }
}
