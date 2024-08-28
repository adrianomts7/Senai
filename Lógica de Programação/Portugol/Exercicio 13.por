programa {
  funcao inicio() {
    real primeiro_numero, segundo_numero, resultado
    cadeia operacao

    escreva("Digite um número: ")
    leia(primeiro_numero)

    escreva("Digite o segundo número: ")
    leia(segundo_numero)

    escreva("Qual operação deseja fazer: ")
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
      escreva("Opção invalida")

   }

  escreva("\n=== Exibindo Resultado ===")
  escreva("\nOs números digitados foram ", primeiro_numero, "-", segundo_numero)
  escreva("\nO Resultado foi de ", resultado)
  }
}
