#include <locale.h>
#include <stdio.h>

int main(){
	setlocale(LC_ALL, "portuguese");
	
	int numero;
	
	printf("Digite um n�mero: ");
	scanf("%i", &numero);
	fflush(stdin);
	system("cls");
	
	printf("o N�mero digitado: %i\n",numero);
	printf("O Antecessor do n�mero digitado: %i\n", numero - 1);
	printf("O Sucessor do n�mero digitado : %i\n", numero +1);
}
