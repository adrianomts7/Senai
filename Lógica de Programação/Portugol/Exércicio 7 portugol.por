programa {
  funcao inicio() {
    // Declarando variaveis
    inteiro primeiroNumero, segundoNumero, soma, produto
    real media
    // Pedindo dados ao usuario
    escreva("Escreva o primeiro número: ")
    leia(primeiroNumero)
    
    escreva("Escreva o Segundo Número: ")
    leia(segundoNumero)

    // Fazendo os calculos necéssarios
      soma = (primeiroNumero + segundoNumero)
      produto = (primeiroNumero * segundoNumero)
      media = (primeiroNumero + segundoNumero) / 2

    // Resultado
    escreva("A soma dos valores ", soma)
    escreva("\nO produto dos valores ",  produto)
    escreva("\nAs medias dos valores ",  media)

    se (primeiroNumero == segundoNumero)
      escreva("\nOs Valores são iguais")
    
    senao se(primeiroNumero > segundoNumero)
      escreva("\nO Maior valor digitado foi ", primeiroNumero, "\n É o menor valor foi ", segundoNumero)

    senao
      escreva("\nO Maior valor digitado foi ", segundoNumero, " \nÉ o menor valor foi ", primeiroNumero)
  }
}
