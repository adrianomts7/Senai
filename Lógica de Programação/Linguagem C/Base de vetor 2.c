#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

int main(){
	setlocale(LC_ALL,"");
	
	int vetor[5];
	int i;
	
	printf("Digite os elementos do vetor\n");
	for(i = 0; i < 5; i++){
		printf("Digite o %i° Elemento: ", i + 1);
		scanf("%i", &vetor[i]);
	}

	system("cls");
	
	printf("Os elementos digitados foram: \n");
	for(i = 0; i < 5; i++){
		printf("o %i° Elemento: %i\n",i + 1, vetor[i]);
	}
}
