#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <string.h>

int main(){
	setlocale(LC_ALL, "");
	 int primeiro_numero, segundo_numero,soma,produto;
	 float media;
	 
	 printf("Digite o primeiro n�mero: ");
	 scanf("%i", &primeiro_numero);
	 
	 printf("Digite o segundo n�mero: ");
	 scanf("%i", &segundo_numero);
	 
	 soma = primeiro_numero + segundo_numero;
	 media = soma / (float) 2;
	 produto = primeiro_numero * segundo_numero;
	 
	system("cls");
	printf("=== Exibindo Resultados ===\n");
	printf("O primeiro N�mero Digitado: %i\n", primeiro_numero);
	printf("O Segundo n�mero digitado: %i\n", segundo_numero);
	printf("A soma: %i\n", soma);
	printf("O produto: %i\n", produto);
	printf("A media: %.1f\n", media);
	
	if(primeiro_numero > segundo_numero){
		printf("O Maior n�mero digitado: %i\n", primeiro_numero);
		printf("O Menor n�mero digitado: %i\n", segundo_numero);
	}else if(segundo_numero > primeiro_numero){
		printf("O Maior n�mero digitado: %i\n", segundo_numero);
		printf("O Menor n�mero digitado: %i\n", primeiro_numero);
	}else{
		printf("Os n�meros digitados s�o iguais\n %i,%i",primeiro_numero, segundo_numero);
	}
}
