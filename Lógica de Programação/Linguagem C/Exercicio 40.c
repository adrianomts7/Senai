#include <stdio.h>
#include <locale.h>
#include <ctype.h>

int main(){
	setlocale(LC_ALL,"");
	
	int numeros,contadorNumeros = 0,contadorPares = 0,contadorImpares = 0;
	int contadorPositivo = 0, contadorNegativo = 0;
	
	do{	
		printf("Digite o n�mero inteiro: ");
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
	
	printf("Quantidade de n�meros inseridos: %d\n", contadorNumeros);
	printf("N�meros pares iseridos: %d\n", contadorPares);
	printf("N�meros impares iseridos: %d\n", contadorImpares);
	printf("N�meros Positivos inseridos: %d\n", contadorPositivo);
	printf("N�meros Negativos inseridos: %d\n", contadorNegativo);
	
	return 0;
}
