#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	
	int i,j;
	char aluno[4][200];
	float notas[4][3];
	float media[4],soma[3];
	
	for(i = 0; i < 4; i++){
		printf("Digite o nome do %iº aluno: ",i +1);
		scanf("%s", &aluno[i]);
	
		for(j = 0; j < 3; j++){
			printf("Digite a %dª nota: ", j + 1);
			scanf("%f", &notas[i][j]);
			soma[i] += notas[i][j];
		}
		media[i] = soma[i] / 3;
	
		printf("\n");	
	}
	
	for(i = 0; i < 4; i++){
		printf("%iº aluno: %s \n", i + 1,aluno[i]);
		
		for(j = 0; j < 3; j++){
			printf("%iª notas: %.1f\n", j+1,notas[i][j]);
		}
		
		printf("Media: %.1f\n", media[i]);
		printf("\n");
	}
	
	return 0;
}
