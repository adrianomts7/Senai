#include <stdio.h>
#include <locale.h>

int main(){
	
	int i;
	
	printf("\nTabuada de 2\n\n");
	for(i = 1; i <= 10; i ++){
		printf("%d x %d = %d \n", 2, i, i * 2);
	}

	printf("\nTabuada de 3 \n\n");
	for(i = 1; i <= 10; i ++){
		printf("%d x %d = %d \n", 3, i, i * 3);
	}

	printf("\nTabuada de 5 \n\n");
	for(i = 1; i <= 10; i ++){
		printf("%d x %d = %d \n", 5, i, i * 5);
	}



}

