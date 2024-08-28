#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

int main(){
	setlocale(LC_ALL,"");

	char nomedaDisciplina [3][200];
	float notas[3][3],somaNotas[3],somaTotal,media[3];
	int i, j;
	
	for(i = 0; i < 3; i++){
		printf("Digite o Nome da %dª Disciplina: ", i + 1);
		gets(nomedaDisciplina[i]);
		fflush(stdin);
		
		for(j = 0;j < 3; j++){
			do{
				
				printf("Digite a %dª Nota: ", j + 1);
				scanf("%f", &notas[i][j]);
				fflush(stdin);
			
				if(j < 2){
					somaNotas[i] += (notas[i][j] * 3);
				}
				else{
					somaNotas[i] += (notas[i][j] * 4);
				}
			
			}while(notas[i][j] < 0 ||notas[i][j] > 10);
		
		}
		
		media[i] = somaNotas[i] / 10;
		printf("\n");
	
	}
	
	system("cls");
	printf("Calculando a Média Ponderada!");
	sleep(4);
	system("cls");
	
	for(i = 0; i < 3; i++){
		
		printf("%iª Disciplina: %s\n",i+1, nomedaDisciplina[i]);
		
		for(j = 0; j < 3; j++){
			printf("%iª Nota: %.1f\n", i+1, notas[i][j]);
		}
		
		printf("Média: %.1f\n", media[i]);
		printf("\n");
	}
	
	return 0;
}
