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
		printf("Digite a %iª Nota: ", i + 1);
		scanf("%f", &notas[i]);
		soma += notas[i];
		fflush(stdin);
	}
	
	system("cls");
	printf("Calculando Média!");
	sleep(2);
	system("cls");
	
	media = soma /(float)TAM;
	
	for(i = 0; i < TAM; i++){
		printf("A %iª Nota: %.1f\n",i + 1, notas[i]);
	}
	
	if(media >= 7){
		strcpy(situacao, "Aprovado");
	}
	else if(media >= 5 && media < 7){
		strcpy(situacao, "Recuperação");
	}
	else{
		strcpy(situacao, "Reprovado");
	}
	
	printf("Média: %.1f\n", media);
	printf("A situação do aluno: %s\n", situacao);
	return 0;
}
