#include <stdio.h>
#include <locale.h>

#define MAX 6

int main(){
    
    int i,numeros[MAX];

    for(i = 0; i < MAX; i++){
        do{
            printf("Digite o %iº Valor: ", i + 1);
            scanf("%i", &numeros[i]);
        }while(numeros[i] < 0 || numeros[i] % 2 == 1);
    }

    for(i = MAX - 1; i >= 0; i--){
        printf("%i ", numeros[i]);
    }

}