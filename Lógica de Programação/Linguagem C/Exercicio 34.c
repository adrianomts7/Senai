#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <time.h>
#include <limits.h >

#define TAM 5

int main(){
	setlocale(LC_ALL,"");
	
	int i,numero[TAM],maiorNumero = INT_MIN, menorNumero = INT_MAX;
	
	for(i = 0; i < 5; i++){
		printf("Digite o %iº Número: ", i + 1);
		scanf("%i", &numero[i]);
		
		if(numero[i] > maiorNumero){
			maiorNumero = numero[i];
		}
		if(numero[i] < menorNumero){
			menorNumero = numero[i];
		}
	}

	system("cls");
	
	for(i = 0; i < 5; i++){
		printf("O %iº Número digitado: %i\n", i + 1, numero[i]);
	}

	printf("O Maior Número digitado: %i\n", maiorNumero);
	printf("O Menor Número digitado: %i\n", menorNumero);
}
