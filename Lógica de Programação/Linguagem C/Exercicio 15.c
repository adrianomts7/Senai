#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	
	int i, numero, soma = 0;
	
	for(i = 0; i < 5; i++) {
		printf("Digite o número: ");
		scanf("%i ", &numero);
		soma += numero;
	}
	printf("A soma de todos os números: %i \n", soma);	
}
