programa {
  funcao inicio() {
    real primeiro_numero, segundo_numero, resultado
    cadeia operacao

    escreva("Digite um n�mero: ")
    leia(primeiro_numero)

    escreva("Digite o segundo n�mero: ")
    leia(segundo_numero)

    escreva("Qual opera��o deseja fazer: ")
    leia(operacao)
    
    escolha(operacao){
      caso "+":
        resultado = primeiro_numero + segundo_numero
      pare
      caso "-":
        resultado = primeiro_numero - segundo_numero
      pare
      caso "*": 
        resultado = primeiro_numero * segundo_numero
      pare
      caso "/":
        resultado = primeiro_numero / segundo_numero
      pare
      caso contrario:
      escreva("Op��o invalida")

   }

  escreva("\n=== Exibindo Resultado ===")
  escreva("\nOs n�meros digitados foram ", primeiro_numero, "-", segundo_numero)
  escreva("\nO Resultado foi de ", resultado)
  }
}
