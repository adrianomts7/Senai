#include <stdio.h>

int main(){
	// Dedclarando variaveis
	char nome [200]; // cadeia
	char sexo; // caracter
	int idade; // inteiro
	float peso; // real
	
	// Solicitando dados ao usuario
	printf("Digite seu nome: ");
	scanf("%s", &nome);
	
	fflush(stdin); // Limpa o cache de input
	
	printf("Digite seu sexo - M ou F: ");
	scanf("%c", &sexo);
	
	printf("Digite sua idade: ");
	scanf("%i", &idade);

	printf("Digite seu peso: ");
	scanf("%f", &peso);
	
	
	//Exibindo Resultado
	printf("\n=== Exibindo resultados ===\n");
	printf("Nome: %s \n", nome); // %s -> string -> cadeia
	printf("Sexo: %c \n", sexo); // %c -> char -> caracter
	printf("Idade: %i \n", idade); // %i -> int -> inteiro
	printf("Peso: %f \n", peso);	// %f -> float -> real
	
	return 0;
	
}
