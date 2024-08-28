#include <stdio.h>
#include <locale.h>
#include <ctype.h>
#include <stdlib.h>

int main(){
    setlocale(LC_ALL,"");
	
    int valores = 1, contador = 0,soma = 0;
    float media = 0;
	
	while(valores > 0){
		printf("Digite o %i valor: ", contador);
		scanf("%i", &valores);	
		
		if(valores > 0){
		contador ++;
		soma += valores;
    	}
	}
	
    media = soma / (float)contador;
	    
    if(contador == 0){
    	printf("Não Foram inseridos os números positivos");
	}else{
		printf("Media: %.1f", media);
	}
	
}
