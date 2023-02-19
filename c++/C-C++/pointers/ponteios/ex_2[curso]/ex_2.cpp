#include<stdio.h>

int main (){
	
	int teste = 123;
	int *p; //<- inizializando o ponteiro
	
	p = &teste; // <- assim ele está salvando o endereço o endereço de teste
	
	//printf("%d", p);
	//*p retorna o valor do apontado
	//p retorna o endereço do apontado
	
	printf("\n--- END DO APONTADO (&teste) -----\n");
	printf("teste = %x",&teste);
	printf("\n\n--- END DE AONDE O PONTEIRO APONTA (p) -----\n");
	printf("p = %x",p);
	
	printf("\n\n\n---- END DA ONDE O PONTEIRO ESTA SALVO (&p)-----\n");
	printf("p = %x",&p); //<- endereço de onde o ponteiro está salvo
	
	printf("\n\n\n---- MUDANDO O VALOR DE TESTE PELO PONTEIRO -----\n");
	printf("teste = %d",teste);
	printf("\n\n---- MUDADO ----(*p = 321)\n");
	
	*p = 321; //<- mudando o valor de onde o ponteiro aponta
	
	printf("teste = %d", teste);
	
}
