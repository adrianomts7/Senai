#include <stdio.h>
#include <ctype.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	float altura, pesoIdeal;
	char sexo;
	
	printf("Qual seu sexo: ");
	scanf("%c", &sexo);
	
	printf("altura: ");
	scanf("%f", &altura);
	
	sexo = toupper(sexo);
	
	switch(sexo){
	
	case 'M':
		pesoIdeal = (72.7 * altura) - 58;
		printf("O seu peso ideial %.1f", pesoIdeal);
		break;
	case 'F':
		pesoIdeal = (62.1 * altura) - 44.7;
		printf("O seu peso ideial %.1f", pesoIdeal);
		break;
	
	default:
		printf("caracter Invalido");
	}
}
