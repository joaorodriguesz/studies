#include<stdio.h>

main (){
	
	int num;
	int min;
	int max;
	int array[20];
	
	printf(" Digite os numeros : ");
	scanf("%d",&num);
	
	for (int i = 0; i < num;i++){
		
		printf("digite os %d numeros  :  ",i+1);
		scanf("%d",&array[i]);
		
	}
	
	min = array[0];
	max = array[0];
	
 for (int i = 0; i < num; i++)
	{
		if (array[i] > max)
			max = array[i];
		else if (array[i] < min)
			min = array[i];
	}
	printf("menor numero : %d",min);
	printf("\nmaior numero : %d",max);
			 
	}
	

	
	

