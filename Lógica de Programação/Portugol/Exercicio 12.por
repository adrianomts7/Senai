programa {
  funcao inicio() {
    //Declarando variaveis
    real quantidade, preco

    // Pedindo dados aos usuário
    escreva("Quantas maças voce pegou: ")
    leia(quantidade)

    // Mostrando o valor ao usuario
    se(quantidade < 12)
    preco = (quantidade * 1.30)
        
    senao se(quantidade > 12)
    preco = (quantidade * 1)
escreva("você pegou ", quantidade, " Maçâs que deu no total de R$ ", preco)
    

  }
}
