#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	
	int i, numero, soma = 0;
	
	for(i = 0; i < 5; i++) {
		printf("Digite o n�mero: ");
		scanf("%i ", &numero);
		soma += numero;
	}
	printf("A soma de todos os n�meros: %i \n", soma);	
}
