#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	
	int numeros,contador = 0;
	float media,soma = 0;
	
	printf("Digite um n�mero: ");
	scanf("%d", &numeros);
	
	while(numeros > 0){
		contador ++;
		soma += numeros;
		
		printf("Digite outro n�mero: ");
		scanf("%d", &numeros);
	}
	
	media = soma /contador;
	
	printf("M�dia do n�meros Digitados: %.1f", media);
	
}
