programa {
  funcao inicio() {
    // Declarando variaveis
    cadeia nome
    inteiro idade

    // Solicitando dados ao usuário
    escreva("Qual o seu Nome: ")
    leia(nome)

    escreva("Qual a sua idade: ")
    leia(idade)

    // Respondendo ao usuario
    se (idade 18 > idade < 65)
      escreva(nome, "Seu voto é obrigatorio")
    
    senao 
      escreva(nome, "Voc~e não tem idade suficiente para votar")
    }
}
