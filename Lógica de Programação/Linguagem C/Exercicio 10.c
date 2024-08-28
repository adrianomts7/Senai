#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL,"");
    float preco,total;
    int maca;

    printf("Quantas maçãs Voce pegou? ");
    scanf("%i", &maca);

    if(maca < 12){
      preco = 1.30;
      total = maca * preco;
    }else{
        preco = 1.0;
        total = maca * preco;
    }
    system("cls");
    printf("Você pegou %i maçãs\n",maca);
    printf("O total R$ %.2f\n", total);
}
