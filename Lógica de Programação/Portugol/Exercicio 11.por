programa {
  funcao inicio() {
  // Declarando variaveis
    cadeia nome, requer_aposentadoria,nao_de_trabalho, aposentadoria
    inteiro anos_de_nascimento, anos_de_trabalho, ano_atual, idade
    real matricula

  // Pedindo dados ao usu�rio
  escreva("Qual o seu nome: ")
  leia(nome)

  escreva("Qual o seu ano de nascimento: ")
  leia(anos_de_nascimento)
  
  escreva("Qual o ano atual: ")
  leia(ano_atual)

  escreva("Trabalha a quantos anos: ")
  leia(anos_de_trabalho)

  escreva("Qual a sua matricula: ")
  leia(matricula)

  // calculando idade 
  idade = ano_atual - anos_de_nascimento
  
  //Exibindo os resultados
  escreva("-=-= Exibindo Resultados -=-=")
  escreva("\nSeu codigo de empregado �: ",  matricula, "\n Sua idade �: ", idade, "\n O seu tempo de contribui��o �: ", anos_de_trabalho)
  
  //Verificando se pode se aposentar
  se (idade >= 65 ou anos_de_trabalho >= 30)
  escreva("\nRequer aposentadoria ou n�o requer aposentadoria: ")
  leia(aposentadoria)
    se(aposentadoria == "requer aposentadoria" )
      escreva("Aposentadoria requerida com sucesso.")
    senao
      escreva("Aposentadoria n�o requerida")
  }
}
