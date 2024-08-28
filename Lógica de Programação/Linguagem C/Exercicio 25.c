#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <locale.h>

int main(){
   setlocale(LC_ALL,"");
  
  int numeros = 1,soma = 0,somaPares = 0,contadorImpares = 0,contador = 0,contadorPares = 0;
  float media = 0,mediaPares = 0;

  while(numeros > 0){
      printf("Digite O Número: ");
      scanf("%i", &numeros);
      
      if(numeros > 0){
         contador ++;
         soma += numeros;
      
            if(numeros % 2 == 0){
               somaPares += numeros;
               contadorPares ++;
            }else{
               contadorImpares ++;
            }
      }
      
      system("cls");
      sleep(1);
  }
   
   mediaPares = somaPares / (float) contadorPares;
   media = soma / (float) contador;
   
   printf("Números Pares Digitados: %i\n", contadorPares);
   printf("Números Impares digitados: %i\n", contadorImpares);
   printf("Media Dos Números Pares: %.2f\n", mediaPares);
   printf("Média Geral: %.2f\n",media);

}
