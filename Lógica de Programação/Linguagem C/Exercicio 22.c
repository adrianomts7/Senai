#include <stdio.h>
#include <locale.h>
#include <string.h>

int main(){
    setlocale(LC_ALL,"");

    float nota,media = 0, soma = 0;
    int contador = 0;
    char continuar;

    do{
        printf("Digite a %i ª Nota: ", contador + 1);
        scanf("%f", &nota);
        soma += nota;
        contador ++;

        fflush(stdin);
        printf("Deseja inserir mais uma nota: ");
        scanf("%c", &continuar);
    
    }while(continuar == 's' || contador == 'S');

    media = soma / contador;

    printf("A Média: %.1f", media);

}