#include <stdio.h>
#include <locale.h>
#include <limits.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

int main() {
    setlocale(LC_ALL, "");
   
 	char loginSalvo[200] = "adriano";
	char senhaSalva[200] = "123";
	char login[200];
	char senha[200];
	
	do{
		printf("Digite o seu Login: ");
		scanf("%s", &login);
		fflush(stdin);
		
		printf("Digite a senha: ");
		scanf("%s", &senha);
		fflush(stdin);
		
		if(strcmp(login,loginSalvo) == 0 && strcmp(senha,senhaSalva) == 0){
			system("cls");
			printf("Login Concluido!");
			break;
		}
		
		else{
			system("cls");
			printf("Login Incorreto!");
			sleep(2);
			system("cls");
		}
	
	}while(login != loginSalvo && senha != senhaSalva);
}
