#include <stdio.h>
#include <locale.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

#define MAX 4

int main(){
	setlocale(LC_ALL,"");
	
	char nome[200],situacao[200];
	float notas[MAX],soma = 0,media;
	int i;
	
	printf("Digite o seu nome: ");
	gets(nome);
	
	for(i = 0; i < MAX; i++){
		printf("Digite a %dª Nota: ", i + 1);
		scanf("%f", &notas[i]);
		soma += notas[i];
	}
	
	system("cls");
	
	media = soma / i;
	
	if(media >= 7){
		strcpy(situacao, "Aprovado!");
	}
	else if(media >= 5){
		strcpy(situacao, "Recuperação!");
	}
	else{
		strcpy(situacao, "Reprovado!");
	}

	printf("Nome do Aluno: %s\n", nome);
	for(i = 0; i < MAX; i++){
		printf("%iª Nota: %.1f\n", i + 1,notas[i]);
	}

	printf("Situação: %s", situacao);
}
