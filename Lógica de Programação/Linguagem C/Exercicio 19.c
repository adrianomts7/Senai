#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	
	float nota;
	
	do{
		printf("Digite a Nota: ");
		scanf("%f",  &nota);
		
	}while(nota < 0 || nota > 10);
	
	printf("A Nota digitada foi %.1f", nota);
	
}
