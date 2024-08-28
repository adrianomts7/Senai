#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	
	//Declarando Matriz
	int numeros[2][2];
	int i,j;
	
	printf("Digite os elementos das matrizes:\n");
	
	for(i = 0;i < 2; i++){
		for(j = 0; j < 2; j++){
			printf("Elemento da linha %d coluna %d: ", i + 1, j + 1);
			scanf("%d", &numeros[i][j]);
		}
	}
	
	// Exibindo os dados em uma matriz em dois laços de reperição.
	
	for(i = 0;i < 2; i++){
		for(j = 0; j < 2; j++){
			printf("Elemento da linha %d coluna %d: %d\n", i + 1, j + 1,numeros[i][j]);
		}
	}
	
	return 0;
}
