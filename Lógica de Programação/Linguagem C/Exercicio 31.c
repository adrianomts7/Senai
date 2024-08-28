#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

#define TAM 3

int main(){
	setlocale(LC_ALL,"");
	
	float notas[TAM];
	int i;
	
	for(i = 0; i < TAM; i++){
		printf("Digite a %iª Nota: ", i + 1);
		scanf("%f", &notas[i]);
		fflush(stdin);
	}
	
	system("cls");
	
	for(i = 0; i < TAM; i++){
		printf("A %iª Nota: %.1f\n",i + 1, notas[i]);
	}
	
	return 0;
}
