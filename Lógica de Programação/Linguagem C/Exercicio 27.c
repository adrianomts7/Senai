#include <stdio.h>
#include <locale.h>
#include <limits.h>
#include <stdlib.h>
#include <ctype.h>

int main() {
    setlocale(LC_ALL, "");
   
    float salario,mediaSalariaMasc,mediaSalariaFem,mediaGeralSalario;
	int idade,maiorIdadeM = INT_MIN, menorIdadeM = INT_MAX,maiorIdadeH = INT_MIN,menorIdadeH = INT_MAX,maiorIdade = INT_MIN,menorIdade = INT_MAX;
	int contadorMulheres = 0,somaSalMul = 0,contadorSalarioF = 0,somaSalMasc = 0,contadorHomens = 0;
	char sexo, opcao;
	
	do{
	printf("\nCodígo  \tDescrição:");
	printf("\n1  \t\tAdicionar Pessoa");	
	printf("\n2 \t\tExibir Resultados e sair\n");	
	
	printf("Digite Qual opção você deseja: ");
	scanf("%c", &opcao);
	
	if(opcao == '1'){
		printf("Digite sua idade: ");
		scanf("%i", &idade);
		
		if(idade > maiorIdade){
			maiorIdade = idade;
		}
		
		if(idade < menorIdade){
			menorIdade = idade;
		}
		
		fflush(stdin);
		printf("Qual seu sexo: ");
		scanf("%c", &sexo);
		
		sexo = toupper(sexo);
		
		if(sexo == 'F'){
			contadorMulheres ++;
			
			if(idade > maiorIdadeM){
				maiorIdadeM = idade;
			}
			if(idade < menorIdadeM){
				menorIdadeM = idade;
			}
			
			printf("Digite O Seu salário: ");
			scanf("%f", &salario);
			somaSalMul += salario;
			
			if(salario >= 5.000){
				contadorSalarioF ++;
			}
		
		}
		
		if(sexo == 'M'){
			contadorHomens ++;

            if(idade > maiorIdadeH){
				maiorIdadeH = idade;
			}
			if(idade < maiorIdadeH){
				menorIdadeH = idade;
			}
			
			printf("Digite O Seu salário: ");
			scanf("%f", &salario);
			somaSalMasc += salario;
		
		}
	
	fflush(stdin);
	
	}else{
		break;
	} 
	
    system("cls");

	}while(opcao == '1');
	
	mediaSalariaFem = somaSalMul / (float) contadorMulheres;
	mediaSalariaMasc = somaSalMasc / (float) contadorHomens;
	mediaGeralSalario = mediaSalariaFem + mediaSalariaMasc;
	
	system("cls");
    
    printf("A Media de salario do Grupo Feminino %.2f\n", mediaSalariaFem);
	printf("A Media de salario do Grupo Masculino %.2f\n", mediaSalariaMasc);
 	printf("Maior idade entre as mulheres: %i anos\n", maiorIdadeM);
    printf("Menor idade entre as mulheres: %i anos\n", menorIdadeM);
    printf("Maior idade entre os homens: %i anos\n", maiorIdadeH);
    printf("Menor idade entre os homens: %i anos\n", menorIdadeH);
    printf("Número de mulheres com salário acima de R$ 5000,00: %i\n", contadorSalarioF);
	printf("Maior idade do Grupo %i\n", maiorIdade);
	printf("Menor idade do Grupo %i\n", menorIdade);
	printf("Media Salarial Geral: %.1f\n", mediaGeralSalario);
	
	return 0;
}
