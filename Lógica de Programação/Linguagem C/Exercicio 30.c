#include <stdio.h>
#include <locale.h>
#include <limits.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

int main() {
    setlocale(LC_ALL, "");
   	
 	char loginSalvo[200] = "adriano";
	char senhaSalva[200] = "017";
	char login[200];
	char senha[200];
	int i;
	
	for(i = 1; i <= 3; i++){
		printf("Digite seu login: ");
		scanf("%s", &login);
		fflush(stdin);
		
		printf("Digite a senha: ");
		scanf("%s", &senha);
		fflush(stdin);
	
		system("cls");
		
		if(strcmp(login,loginSalvo) == 0 && strcmp(senha,senhaSalva) == 0){
			printf("Acesso Autorizado!");
			break;
		}
	
		else if(i == 3 && strcmp(login,loginSalvo) != 0 && strcmp(senha,senhaSalva) != 0){
			printf("Programa finalizado");
			break;
		}
	
		else if(strcmp(login,loginSalvo) != 0 && strcmp(senha,senhaSalva) != 0){
			printf("Tente Novamente!");
			sleep(2);
			system("cls");
			continue;
		}
	}

}
