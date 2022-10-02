#include<stdio.h>
#include<conio.h>
struct cadastro
{
	int cod, idade;
	char nome[30];
};
typedef struct cadastro dados;

main()
{
	int i;
	dados d[3];
	FILE *pont;
	pont=fopen("prog.txt", "a");
	printf("Cadastrando....\n");
	for(i=0;i<3;i++)
	{
		printf("Codigo: "); scanf("%d", &d[i].cod);
		printf("Idade: "); scanf("%d", &d[i].idade);
		printf("Nome: "); fflush(stdin);gets(d[i].nome);
	}
	fprintf(pont, "Codigo\tIdade\tNome\n");
	for(i=0;i<3;i++)
	{
	fprintf(pont, "%d\t%d\t%s\n", d[i].cod, d[i].idade, d[i].nome);
	}
	
	
	getch();
	fclose(pont);	
}
