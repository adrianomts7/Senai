#include <locale.h>
#include <stdio.h>
#include <stdlib.h>

int main(){
	setlocale(LC_ALL, "portuguese");
	
	float valor, reajuste;
	
	printf("Digite o valor para saber o reajuste: ");
	scanf("%f", &valor);
	
	reajuste = valor - (valor * 10 / 100);
	
	system("cls");
	
	printf("O valor digitado: %2.f \n", valor);
	printf("O valor com reajuste: %2.f\n", reajuste);
	
}
