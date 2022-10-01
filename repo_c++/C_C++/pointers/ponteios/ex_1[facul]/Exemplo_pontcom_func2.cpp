#include<stdio.h>
int func(int x, int y, int *sub);

main()
{
	int a, b, soma, sub;
	printf("Informe o valor de a: ");
	scanf("%d", &a);//10
	printf("Informe o valor de b: ");
	scanf("%d", &b);//5
	soma=func(a, b, &sub);
	printf("soma: %d\nSubtracao: %d\n", soma, sub);
}
int func(int x, int y, int *sub)
{
	*sub=x-y;
	return x+y;
}
