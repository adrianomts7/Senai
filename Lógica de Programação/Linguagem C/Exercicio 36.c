#include <stdio.h>
#include <locale.h>

#define MAX 5

int main(){
	setlocale(LC_ALL,"");
	
	int i,idade[MAX];
	char nome[MAX][200];
	
	for(i = 0; i < MAX; i++){
		printf("Digite o Nome da %iª Pessoa: ", i + 1);
		scanf("%s", &nome[i]);
		fflush(stdin);
			
		printf("Digite a idade da %iª Pessoa: ", i + 1);
		scanf("%d", &idade[i]);
		fflush(stdin);
	}
	
	for(i = 0; i < MAX; i++){
		printf("Nome: %s\n",nome[i]);
		printf("Idade: %i\n\n",idade[i]);
	}
	
	return 0;
}
