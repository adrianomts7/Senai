#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <time.h>

int main(){
	setlocale(LC_ALL,"");
	
	char bandasMusicais[3][200];
	char integrantes[3][5][200];
	int i,j;
	
	for(i = 0; i < 3; i++){
		printf("Digite o nome da %iª Banda: ", i + 1);
		scanf("%s", &bandasMusicais[i]);
		fflush(stdin);
		
		for(j = 0; j < 5; j++){
			printf("Digite o nome do %dº Integrante: ", j + 1);
			scanf("%s", &integrantes[i][j]);
			fflush(stdin);
		}
	
		printf("\n");
	}
	
	system("cls");
	
	for(i = 0; i < 3; i++){
		printf("A %dª Banda foi: %s\n", i + 1, bandasMusicais[i]);
		
		for(j = 0; j < 5; j++){
			printf("%iº Integrante: %s\n", j + 1, integrantes[i][j]);
		}
	
		printf("\n");
	}
	
	
	return 0;
}
