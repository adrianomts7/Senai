#include <stdio.h>
#include <locale.h>
#include <ctype.h>

int main(){
	setlocale(LC_ALL,"");
	
	int numeros,contadorNumeros = 0,contadorPares = 0,contadorImpares = 0;
	int contadorPositivo = 0, contadorNegativo = 0;
	
	do{	
		printf("Digite o número inteiro: ");
		scanf("%d", &numeros);
			
		if(numeros != 0){
			contadorNumeros++;
			
		if(numeros % 2 == 0){
			contadorPares ++;
		}
		else{
		contadorImpares ++;
		}		
		if(numeros > 0){
			contadorPositivo ++;
		}
		else if(numeros < 0 ){
			contadorNegativo ++;
			}				
		}
	}while(numeros != 0);
	
	system("cls");
	
	printf("Quantidade de números inseridos: %d\n", contadorNumeros);
	printf("Números pares iseridos: %d\n", contadorPares);
	printf("Números impares iseridos: %d\n", contadorImpares);
	printf("Números Positivos inseridos: %d\n", contadorPositivo);
	printf("Números Negativos inseridos: %d\n", contadorNegativo);
	
	return 0;
}
