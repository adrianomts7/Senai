programa {
  funcao inicio() {
    //Declarando variaveis
    real altura,base,area

    //pedindo dados ao usuario
    escreva("\nQual a altura do seu triângulo: ")
    leia(altura)
    escreva("\nQual a base do seu triãngulo: ")
    leia(base)

    //achando a area deseja pelo usuario
    area = (base * altura) /2

    //resultado da area
    escreva("\nA area do seu triângulo é: ",area)
  }
}
