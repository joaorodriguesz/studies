#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int funcao ()
{
	int nivel=0;
	int rdm=0;	
	int dificuldade=0;
	int contador=1;
	int escolha = 0;

	
	srand(time(NULL));
	rdm=rand()%100;
	
	
	printf("escolha o nivel de dificuldade;");
	printf("\n1=Facil \n2=Medio \n3=Dificil ");
	printf("\nDigite : ");
	scanf("%d",&nivel);
	
	switch(nivel)
	{
	
	case 1: dificuldade=20;
	break;
	case 2: dificuldade=15;
	break;
	case 3: dificuldade=5;
	break;

	default: 
			printf("\noperador invalido!");
		break;
		
		}
		
	system("cls");
	
	
	 while(contador<=dificuldade)
	{	
		printf("\nFaca sua escolha : ");
		scanf("%d",&escolha);
			
		if(escolha<0)
		{
			printf("Voce nao pode chutar numeros negativos!!!");
			
		}
		
		if(escolha<rdm)
		{
			printf("Esta quase seu numero e menor que o numero aleatorio!!!");
			
		}	
				
		if(escolha>rdm)
		{
			printf("Esta quase seu numero e maior que o numero aleatorio!!!");
			
		}
					
		if(escolha==rdm)
		{
			printf("Parabens vc e um vidente!!!!\n\n");
			escolha = dificuldade;
			break;
		}
				if(contador==dificuldade)
				{
				printf("\n\n--------------------------");
				printf("\n\n[VOCE PERDEU!!!]\n\n");
				printf("--------------------------\n\n");
				}
		contador++;		
	}
	

	system("PAUSE");
	return 0;
	}



int main()
{
	int replay = 0;
	int iniciar=2;
	printf("-----------------\n");
	printf("Bem vindo ao jogo");
	printf("\n-----------------\n\n");
	system("PAUSE");
	system("cls");
	
	printf("\nDeseja iniciar o jogo ?\n1 - Sim\n2 - Nao\n");
	scanf("%d",&iniciar);
	
	if (iniciar==1);
	{
		system("cls");
		funcao();

	}
	if(iniciar!=1)
	{
		system("cls");
		printf("\n\n-----------------");
		printf(" \n\njogo fechado !");
		printf("\n\n-----------------\n\n");
		exit(0);
		return 0;
	}
	
	system("cls");
	printf("\nDeseja jogar novamente?\n1 - Sim\n2 - Nao\n");
	scanf("%d", &replay);
	if(replay == 1)
	{
		system("cls");
		funcao();
		
	}
	if(replay!=1) 
	{
		system("cls");
		printf("\n\n-----------------");
		printf(" \n\njogo fechado !");
		printf("\n\n-----------------\n\n");
	}
	}


//Kenshi, JP, Possamai ------ jun/2021


