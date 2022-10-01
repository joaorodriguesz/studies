#include<stdio.h>

main()
{
	int num, b, *pont;
	char sexo;
	printf("Numero: ");
	scanf("%d", &num);//30
	printf("Valor de num: %d\n", num);
	printf("endereco de num: %x\n", &num);
	pont=&num;
	printf("valor de pont: %x\n", pont);

	*pont=*pont+10;
	
	// pega aonde o ponteiro esta apontando = o valor dele + 10
	// e armazena o valor do que o ponteiro aponta + 10
	
}


