#include <locale.h>
#include <stdio.h>
//#include <stdlib.h>

int main(){
	setlocale(LC_ALL, "portuguese");
	
	int numero;
	
	printf("Digite um n�mero: ");
	scanf("%i", &numero);
	fflush(stdin);
	
	if(numero % 2 == 0){
		printf("O N�mero Digitado � par");
	}else{
		printf("O N�mero Digitado � impar");
	}
}
