programa {
  funcao inicio() {
    //Declarando variaveis
    real quantidade, preco

    // Pedindo dados aos usu�rio
    escreva("Quantas ma�as voce pegou: ")
    leia(quantidade)

    // Mostrando o valor ao usuario
    se(quantidade < 12)
    preco = (quantidade * 1.30)
        
    senao se(quantidade > 12)
    preco = (quantidade * 1)
escreva("voc� pegou ", quantidade, " Ma��s que deu no total de R$ ", preco)
    

  }
}
