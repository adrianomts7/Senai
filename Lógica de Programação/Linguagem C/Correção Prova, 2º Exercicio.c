#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	
	int numeros,contador = 0;
	float media,soma = 0;
	
	printf("Digite um número: ");
	scanf("%d", &numeros);
	
	while(numeros > 0){
		contador ++;
		soma += numeros;
		
		printf("Digite outro número: ");
		scanf("%d", &numeros);
	}
	
	media = soma /contador;
	
	printf("Média do números Digitados: %.1f", media);
	
}
