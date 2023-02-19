#include<stdio.h>
#include<stdlib.h>

main(){
	
//exemplo media

float notas[5];
float media;
float soma{0.0};
char NomeAluno[30];

printf("\nDigite o nome do Aluno : ");
gets(NomeAluno);
system("cls");
	

for(int i = 0; i<=4;i++){
	
	printf("\nDigite a nota :");
	scanf("%f",&notas[i]);
	soma = soma + notas[1];
	system("cls");
	
}

media=soma/5;

printf("Aluno : %s\n",NomeAluno);


printf("Media : %f",media);
 

}
