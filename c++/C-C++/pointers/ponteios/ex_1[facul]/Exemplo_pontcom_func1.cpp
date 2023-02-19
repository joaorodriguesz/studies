#include<stdio.h>
void func(int x, int y, int *so, int *sub);

main()
{
	int a, b, soma, sub;
	printf("Informe o valor de a: ");
	scanf("%d", &a);//10
	printf("Informe o valor de b: ");
	scanf("%d", &b);//5
	func(a, b, &soma, &sub);
	//so -> soma e sub -> sub 
	printf("soma: %d\nSubtracao: %d\n", soma, sub);
}
void func(int x, int y, int *so, int *sub)
{
	*so=x + y;
	*sub=x-y;
}
