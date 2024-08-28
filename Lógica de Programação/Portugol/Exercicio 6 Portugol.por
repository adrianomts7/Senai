programa {
  funcao inicio() {
  // Declarandoi variaveis  
    cadeia nome_do_aluno,situacao
    inteiro idade
    real nota1, nota2, nota3, media
  
  // Pedindo dados ao usuario
    escreva("Qual o nome do aluno: ")
    leia(nome_do_aluno)
    escreva("Qual a idade do aluno: ")
    leia(idade)
    escreva("Qual a primeira nota do aluno: ")
    leia(nota1)
    escreva("Qual a segunda nota: ")
    leia(nota2)
    escreva("Qual a terceira nota: ")
    leia(nota3) 
  
  // Calculando a Média do aluno
  media = (nota1 + nota2 + nota3) / 3
   
  // Resultados
  escreva("O Nome do aluno é ", nome_do_aluno," Sua idade é ",  idade , " As notas do aluno é ",  nota1, " - ", nota2, " - ",  nota3)
  se (media >= 7)
    escreva("\n Sua situação é: Aprovado, Parabéns")
  senao
  escreva("\n Sua situação é: Reprovado, Estude mais")
   }
}
