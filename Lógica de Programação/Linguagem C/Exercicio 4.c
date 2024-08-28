#include <locale.h>
#include <stdio.h>

int main(){
	setlocale(LC_ALL, "portuguese");
	
	int numero;
	
	printf("Digite um número: ");
	scanf("%i", &numero);
	fflush(stdin);
	system("cls");
	
	printf("o Número digitado: %i\n",numero);
	printf("O Antecessor do número digitado: %i\n", numero - 1);
	printf("O Sucessor do número digitado : %i\n", numero +1);
}
