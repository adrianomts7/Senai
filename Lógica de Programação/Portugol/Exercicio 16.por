programa {
  funcao inicio() {
   inteiro  preco, comida, opcao
   cadeia comida
   
   
    escreva("\n=== Cardapio ===")
    escreva("\nCódigo  \tPrato  \t\t\t\tValor")
    escreva("\n1   \t\t\tPicanha  \t\t\tR$ 25,00")
    escreva("\n2  \t\t\t\tLasanha  \t\t\tR$ 18,00")
    escreva("\n4  \t\t\tBife Acebolado \tR$ 15,00")
    escreva("\n5 \t\t\tPão com ovo \t\tR$ 5,00")
    escreva("\n=== Fim do Cardapio ===")
    escreva("\nQual opção deseja escolher: ")
    leia(opcao)

    escolha(opcao){
      caso 1:
        comida = "Picanha"
        preco = 25.00
        pare
      caso 2:
      comida = "Lasanha"
      preco = 18.00
      pare
      caso 3:
      comida = "Bife Acebolado"
      preco = 15.00
      pare
      caso 4:
      comida = "Pão com ovo"
      preco = 5.00
      pare
      caso contrario:
        escreva("A opção não esta disponivel no cardapio")
      pare

    }
    escreva("Você pediu ",comida, " No valor de R$ ", preco)  
  
  }
}
