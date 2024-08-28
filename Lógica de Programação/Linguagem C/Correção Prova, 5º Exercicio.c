#include <stdio.h>
#include <locale.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>
#include <limits.h>

#define MAX 5

int main(){
	setlocale(LC_ALL,"");
	
	int i,valores[MAX],maiorValor = INT_MIN,menorValor = INT_MAX;
	
	for(i = 0; i < MAX; i++){
		printf("Digite o %dº Valor: ", i + 1);
		scanf("%d",&valores[i]);
		
		if(valores[i] > maiorValor){
			maiorValor = valores[i];
		}
		if(valores[i] < menorValor){
			menorValor = valores[i];
		}
	}
	
	printf("O Maior Valor: %d\n", maiorValor);
	printf("O Menor Valor: %d\n", menorValor);
}
