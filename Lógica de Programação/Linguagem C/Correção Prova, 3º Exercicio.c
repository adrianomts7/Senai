#include <stdio.h>
#include <locale.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

int main(){
	setlocale(LC_ALL,"");
	
	char nome[200],email[200];
	int idade,numero,opcao,tempo;
	
	printf("Digite o seu Nome: ");
	gets(nome);
	
	printf("Digite a sua idade: ");
	scanf("%d", &idade);
	
	printf("Digite o seu email: ");
	scanf("%s", &email);
	
	printf("Digite o número: ");
	scanf("%d", &numero);
	
	system("cls");
	
	
	do{
		printf("\n1 \t\tNome e Idade");
		printf("\n2 \t\tNome e e-mail");
		printf("\n3 \t\tNome e telefone");
		printf("\n4 \t\tMostrar Todas as opções");
		printf("\n0 \t\tSair do programa");
		printf("\nDigite qual opção você deseja: ");
		scanf("%d", &opcao);
		system("cls");
		
		printf("Deseja mostrar por quanto tempo a opção na tela: ");
		scanf("%d", &tempo);
		system("cls");
		
		switch(opcao){
			case 1:
				printf("Nome: %s\n", nome);
				printf("Idade: %d\n", idade);
				sleep(tempo);
				system("cls");
			break;
			
			case 2:
				printf("Nome: %s\n",nome);
				printf("E-mail: %s\n", email);
				sleep(tempo);
				system("cls");
			break;
			
			case 3:
				printf("Nome: %s\n", nome);
				printf("Número: %d\n", numero);
				sleep(tempo);
				system("cls");
			break;
			
			case 4:
				printf("Nome: %s\n", nome);
				printf("Idade: %d\n", idade);
				printf("E-mail: %s\n", email);
				printf("Número: %d\n", numero);
				sleep(tempo);
				system("cls");
			break;
			
			default:
				printf("Opção invalida,tente Novamente!");
				sleep(5);
				system("cls");
		}
		
	}while(numero != 0);
	
}
