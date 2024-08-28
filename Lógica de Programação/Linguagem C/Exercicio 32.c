#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <time.h>

#define TAM 3

int main(){
	setlocale(LC_ALL,"");
	
	float notas[TAM];
	float media,soma = 0;
	int i;
	
	for(i = 0; i < TAM; i++){
		printf("Digite a %iª Nota: ", i + 1);
		scanf("%f", &notas[i]);
		soma += notas[i];
		fflush(stdin);
	}
	
	system("cls");
	printf("Calculando Média!");
	sleep(2);
	system("cls");
	
	media = soma /i;
	
	for(i = 0; i < TAM; i++){
		printf("A %iª Nota: %.1f\n",i + 1, notas[i]);
	}
	
	printf("Média: %.1f\n", media);
	
	return 0;
}
