#include <locale.h>
#include <stdio.h>
#include <stdlib.h>

int main(){
	setlocale(LC_ALL, "portuguese");
	
	float salario, salario_minimo, quantos_salario_minimos;
	
	printf("Qual o seu salário: ");
	scanf("%f", &salario);
	fflush(stdin);
	
	salario_minimo = 1.412,00;
	quantos_salario_minimos = salario / salario_minimo;
	
	system("cls");
	printf("Você ganha %.1f", quantos_salario_minimos);
	printf(" vezes a mais que o salarios Minino");
	
}
