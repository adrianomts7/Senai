#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

#define MAX 6

int main(){
	setlocale(LC_ALL,"");
	
	int i,numeros[MAX],numerosPares = 0, numerosImpares = 0;
	
	for(i = 0; i < MAX; i++){
		printf("Digite o %d� N�mero: ", i + 1);
		scanf("%d",&numeros[i]);
		
		if(numeros[i] % 2 == 0){
			numerosPares ++;
		}
		else{
			numerosImpares ++;
		}
	}
	
	for(i = 0; i < MAX; i++){
		printf("%d� N�mero: %d \n", i + 1,numeros[i]);
		
	}
	
	printf("N�meros Pares digitados: %d\n", numerosPares);
	printf("N�meros Impares digitados: %d\n", numerosImpares);

}
