#include <stdio.h>
#include <locale.h>
#include <string.h>

int main(){
	setlocale(LC_ALL,"");
	
	float nota,media,soma = 0;
	int i;
	char condicao[200];
	
	for(i = 1; i <= 3; i++){
		do{	
			printf("Digite a %i nota: ", i);
			scanf("%f", &nota);
		
		}while(nota < 0 || nota > 10);
		
		soma += nota;
	}
	
	media = soma / 3;
	
	if(media >= 7){
		strcpy(condicao, "Aprovado");
	}else if(media >= 5 && media < 7){
		strcpy(condicao, "Recuperação");
	}else{
		strcpy(condicao, "Reprovado");
	}
	
	printf("=== Exibindo Resultados ===\n");
	printf("Media: %.1f\n", media);
	printf("Condição: %s\n", condicao);

}

