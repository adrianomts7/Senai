#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <time.h>
#include <limits.h >

#define TAM 6

int main(){
	setlocale(LC_ALL,"");
	
	int i,numero[TAM],contadorPares = 0,contadorImpares = 0;
	
	for(i = 0; i < TAM; i++){
		printf("Digite o %iº Número: ", i + 1);
		scanf("%i", &numero[i]);
		
		if(numero[i] % 2 == 0){
			contadorPares ++;
		}
		else{
			contadorImpares ++;
		}
	}

	system("cls");
	
	for(i = 0; i < TAM; i++){
		printf("O %iº Número digitado: %i\n", i + 1, numero[i]);
	}

	printf("Foram digitado %i Números Pares\n", contadorPares);
	printf("Foram digitado %i Números Impares\n", contadorImpares);
}
