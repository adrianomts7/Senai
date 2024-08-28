#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

#define TAM 4

int main(){
	setlocale(LC_ALL,"");
	
	float notas[TAM];
	float media,soma = 0;
	int i;
	char situacao[100];
	
	for(i = 0; i < TAM; i++){
		printf("Digite a %i� Nota: ", i + 1);
		scanf("%f", &notas[i]);
		soma += notas[i];
		fflush(stdin);
	}
	
	system("cls");
	printf("Calculando M�dia!");
	sleep(2);
	system("cls");
	
	media = soma /(float)TAM;
	
	for(i = 0; i < TAM; i++){
		printf("A %i� Nota: %.1f\n",i + 1, notas[i]);
	}
	
	if(media >= 7){
		strcpy(situacao, "Aprovado");
	}
	else if(media >= 5 && media < 7){
		strcpy(situacao, "Recupera��o");
	}
	else{
		strcpy(situacao, "Reprovado");
	}
	
	printf("M�dia: %.1f\n", media);
	printf("A situa��o do aluno: %s\n", situacao);
	return 0;
}
