#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

int main(){
	setlocale(LC_ALL,"");
	
	int i,j;
	char nomeDeDisciplina[3][200];
	float notas[3][2];
	float soma[3],media[3];
	
	for(i = 0; i < 3; i++){
		printf("Digite o nome da %iª Disciplina: ", i + 1);
		scanf("%s", &nomeDeDisciplina[i]);
		
		for(j = 0; j < 2; j++){
			printf("Digite a %iª Nota: ", j + 1);
			scanf("%f", &notas[i][j]);
			soma[i] += notas[i][j];
		}
	
		media[i] = soma[i] / 2;
		printf("\n");
	}
	
	system("cls");
	
	for(i = 0; i < 3;i++){
		printf("%iª Disciplina: %s\n",j + 1,nomeDeDisciplina[i]);
		
		for(j = 0; j < 2; j++){
			printf("%iª Nota: %.1f\n",i + 1,notas[i][j]);
		}
	
		printf("Media: %.1f\n", media[i]);
		printf("\n");
	}
	
	
	return 0;
}
