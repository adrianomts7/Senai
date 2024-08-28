#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	
	char nome[200];
	char conceito;
	float primeiraNota,segundaNota,media;
	
	printf("Nome: ");
	scanf("%s", &nome);
	
	printf("Primeira Nota: ");
	scanf("%f", &primeiraNota);
	
	printf("Segunda Nota: ");
	scanf("%f", &segundaNota);
	
	media = (primeiraNota + segundaNota) / 2;
	
	if(media >= 9.0){
		conceito = 'A';
	}else if(media >= 7.5){
		conceito = 'B';
	}else if(media >= 6.0){
		conceito = 'C';
	}else if(media >= 4){
		conceito = 'D';
	}else{
		conceito ='E';
	} 
	
	if(conceito == 'A' || conceito == 'B' || conceito == 'C'){
		printf("O Aluno %s foi Aprovado com o conceito %c", nome,conceito);
	}else{
		printf("O Aluno %s foi Reprovado com o conceito %c", nome,conceito);
	}
}
