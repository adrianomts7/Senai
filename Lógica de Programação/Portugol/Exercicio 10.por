programa {
  funcao inicio() {
  // Declarando variaveis
    inteiro primeiroNumero, segundoNumero, terceiroNumero
    inteiro maiorNumero, menorNumero
  
  // Pedindo dados ao usuario
  escreva("Digite a primeiro n�mero: ")
  leia(primeiroNumero)

  escreva("Digite o segundo n�mero: ")
  leia(segundoNumero)

  escreva("Digite a Terceiro n�mero: ")
  leia(terceiroNumero)

  // Verificando maior � menor n�mero  
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
escreva("\nMaior n�mero digitado foi ", maiorNumero)
escreva("\nMenor N�mero digitado foi ", menorNumero)
  }
}
