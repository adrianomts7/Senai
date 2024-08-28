#include <locale.h>
#include <stdio.h>
//#include <stdlib.h>

int main(){
	setlocale(LC_ALL, "portuguese");
	
	int numero;
	
	printf("Digite um número: ");
	scanf("%i", &numero);
	fflush(stdin);
	
	if(numero % 2 == 0){
		printf("O Número Digitado é par");
	}else{
		printf("O Número Digitado é impar");
	}
}
