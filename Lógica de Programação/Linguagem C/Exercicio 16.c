#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	
	int i, numero, impares = 0, pares = 0;
	
	for(i = 1; i <= 5; i++){
		printf("Digite %i número: ", i);
		scanf("%i ", &numero);
		
		if(numero % 2 == 0){
			pares ++;
		}else{
			impares ++;
		}
	}
	
	printf("Números pares digitados: %i\n", pares);
	printf("Números Impares digitados: %i\n", impares);
}
