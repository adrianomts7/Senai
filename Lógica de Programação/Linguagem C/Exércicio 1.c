#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL, "portuguese");
    
    float primeiro_numero, segundo_numero, soma, subtracao, multiplicacao, divisao;

    printf("Digite o Primeiro n�mero: ");
    scanf("%f", &primeiro_numero);

    printf("Digite o Segundo n�mero: ");
    scanf("%f", &segundo_numero);

    fflush(stdin);
    //system("cls") limpar o terminal

    soma = primeiro_numero + segundo_numero;
    subtracao = primeiro_numero - segundo_numero;
    multiplicacao = primeiro_numero * segundo_numero;
    divisao = primeiro_numero / segundo_numero;
    fflush(stdin);
    
    printf("=== Exibindo Resultados ===\n");
    printf("O primeiro n�mero digitado: %1.f\n",primeiro_numero);
    printf("O segundo n�mero digitado: %1.f\n",segundo_numero);
    printf("A soma: %2.f \n", soma);
    printf("A subtra��o: %2.f\n", subtracao);
    printf("A multiplica��o: %2.f\n", multiplicacao);
    printf("A Divis�o: %2.f\n", divisao);
   
    return  0;
}
