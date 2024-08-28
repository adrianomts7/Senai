#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <string.h>

int main(){
	setlocale(LC_ALL, "");
	 
	 char login_salvo[200] = "adriano";
	 char senha_salvo[200] = "071";
	 char login[200];
	 char senha[200];
	 
	 printf("Digite o Login: ");
	 scanf("%s", &login);
	 
	 printf("Digite sua senha: ");
	 scanf("%s", &senha);
	 
	 // && -> e -> and
	 // \\ -> ou -> or
	 if(strcmp(login, login_salvo) == 0 && strcmp(senha, senha_salvo) == 0){
	 	printf("Login Feito!");
	 }else{
	 	printf("Login Incorreto!");
	 }
		
}
