#include <stdio.h>
#include <locale.h>

#define MAX 10

int main(){
	setlocale(LC_ALL,"");
	
	float numeros[MAX],soma = 0;
	int i,numerosNegativos = 0;
	
	for(i = 0; i < MAX; i++){
		printf("Digite o %iº Número: ", i + 1);
		scanf("%f", &numeros[i]);
		fflush(stdin);
		
		if(numeros[i] < 0){
			numerosNegativos ++;
		}
		else if(numeros[i] > 0){
			soma += numeros[i];
		}
	}
	
	for(i = 0; i < MAX; i++){
		printf("O %iº Número digitado: %.1f\n",i + 1,numeros[i]);
	}
	
	printf("Foram digitados %i Número(s) Negativos\n",numerosNegativos);
	printf("A Soma dos Números Positivos: %.1f\n", soma);
	return 0;
}
