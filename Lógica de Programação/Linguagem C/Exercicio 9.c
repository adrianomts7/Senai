#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <string.h>

int main(){
	setlocale(LC_ALL, "");
	 int idade;
	 
	 printf("Digite a sua idade: ");
	 scanf("%i", &idade);
	 
	 if(idade >= 18 && idade <= 65){
	 	printf("voto obrigatorio!");
	}else{
		printf("Voto opcional!");
	}
		
}
