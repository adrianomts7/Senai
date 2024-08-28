programa {
  funcao inicio() {
    //Declarando variaveis
    real idade,notas,media,notasdoaluno1,notasdoaluno2,notasdoaluno3,notasdoaluno4
    cadeia nomedoaluno
    //pedindo dados ao usuario
    escreva("\nQual o Nome do aluno: ")
    leia(nomedoaluno)
    escreva("\nQual idade dos aluno: ")
    leia(idade)
    escreva("\nQual a primeira nota do aluno: ")
    leia(notasdoaluno1)
    escreva("\nQual a segunda nota do aluno: ")
    leia(notasdoaluno2)
    escreva("\nQual a terceira nota do aluno: ")
    leia(notasdoaluno3)
    escreva("\nQual a quarta nota de aluno: ")
    leia(notasdoaluno4)

    //calculando a media do aluno
    media =  (notasdoaluno1 + notasdoaluno2 + notasdoaluno3 + notasdoaluno4) /4

    // resultado da media do aluno:
    
    escreva("\nA Média do ", nomedoaluno, " é ", media, " com as notas  " )
  }
}
