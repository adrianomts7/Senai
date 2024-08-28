#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL, "portuguese");
    
    float primeiro_numero, segundo_numero, soma, subtracao, multiplicacao, divisao;

    printf("Digite o Primeiro número: ");
    scanf("%f", &primeiro_numero);

    printf("Digite o Segundo número: ");
    scanf("%f", &segundo_numero);

    fflush(stdin);
    //system("cls") limpar o terminal

    soma = primeiro_numero + segundo_numero;
    subtracao = primeiro_numero - segundo_numero;
    multiplicacao = primeiro_numero * segundo_numero;
    divisao = primeiro_numero / segundo_numero;
    fflush(stdin);
    
    printf("=== Exibindo Resultados ===\n");
    printf("O primeiro número digitado: %1.f\n",primeiro_numero);
    printf("O segundo número digitado: %1.f\n",segundo_numero);
    printf("A soma: %2.f \n", soma);
    printf("A subtração: %2.f\n", subtracao);
    printf("A multiplicaçâo: %2.f\n", multiplicacao);
    printf("A Divisâo: %2.f\n", divisao);
   
    return  0;
}
