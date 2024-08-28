#include <stdio.h>

int main(){
	
	int j;
	
	printf("Digite um valor para fazer em ordem decrescente: ");
	scanf("%i", &j);
	
	for(j; j >= 1; j--){
		printf(" %i ", j);
	}
}
