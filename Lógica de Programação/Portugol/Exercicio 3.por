programa {
  funcao inicio() {
    // Declarando variaveis
    inteiro idade

    // Pedindo dados ao usuario
    escreva("Digite sua idade: ")
    leia(idade)

    // Resultado de uma possivel resposta
    se(idade >= 18) {
      escreva("Maior de idade")
    }
    
    // Resultado de outra possivel resposta
    senao {
      escreva("Menor de idade")
    }
    // Fim do programa
    escreva("\n === FIM DO PROGRAMA ===")
    
  }
}
