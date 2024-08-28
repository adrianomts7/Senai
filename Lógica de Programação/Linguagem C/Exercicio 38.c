#include <stdio.h>
#include <locale.h>

#define MAX 5

int main(){
	setlocale(LC_ALL,"");
	
	int i,numeros[MAX];
	
	for(i = 0; i < MAX; i++){
		printf("Digite o %iº Valor: ", i + 1);
		scanf("%d", &numeros[i]);
		fflush(stdin);
		
		if(numeros[i] < 0){
			numeros[i] = 0;
		}
	}
	
	for(i = 0; i < MAX; i++){
		printf("O %iº Valor digitado:%d \n",i + 1,numeros[i]);
	}
	
	return 0;
}
