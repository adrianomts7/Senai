#include <stdio.h>

int main(){
    // Declarando Variaveis
    char nome[100];
    int idade;
    float media,primeira_nota, segunda_nota, terceira_nota, quarta_nota;

    // Pedindo Dados ao usuario
    printf("Digite o nome do aluno: ");
    scanf("%s", &nome);

    printf("Digite a idade do aluno: ");
    scanf("%i", &idade);

    fflush(stdin);
    
    printf("Digite Primeira Nota: " );
    scanf("%f" ,&primeira_nota);

    printf("Digite Segunda Nota: ");
    scanf("%f", &segunda_nota);

    printf("Digite a terceira nota: ");
    scanf("%f", &terceira_nota);

    printf("Digite Quarta Nota: ");
    scanf("%f", &quarta_nota);

    // Calculando a media
    media = (primeira_nota + segunda_nota + terceira_nota + quarta_nota) / 4;

    printf("=-=-= Exibindo Resultados =-=-=\n");
    printf("Nome do aluno: %s\n", nome);
    printf("Idade do aluno: %i\n", idade, "Anos");
    printf("A notas do aluno: %.1f, %.1f, %.1f, %.1f\n", primeira_nota,segunda_nota,terceira_nota,quarta_nota);
    printf("A Media dos alunos: %.2f\n",media);
    
    // vendo se o aluno foi aprovado ou não
    if(media >= 7){
        printf("Parabens, Voce esta aprovado");
    }else if (media < 5 ){
        printf("Precisa estudar mais, esta reprovado!");
    }else{
        printf("Voce esta na recuperacao!");
    }
    
    return 0;

}
