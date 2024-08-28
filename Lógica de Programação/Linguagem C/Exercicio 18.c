#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	
	float nota,media,soma;
	int i;
	
	for(i = 1; i <= 3; i++){
		printf("Digite a %i nota: ", i);
		scanf("%f", &nota);
		soma += nota;
	}
	
	media = soma / 3;
	
	if(media >= 7){
		printf("O Aluno esta Aprovado com a media %.1f", media);
	}else if(media > 4 && media < 7){
		printf("O Aluno esta Recuperação com a media %.1f", media);	
	}else{
		printf("O Aluno esta Reprovado com a media %.1f", media);
	}
}
