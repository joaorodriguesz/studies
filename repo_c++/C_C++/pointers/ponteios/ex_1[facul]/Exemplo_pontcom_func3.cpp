#include<stdio.h>
void func(int *x, int *y);

main()
{
	int a, b, soma, sub;
	printf("Informe o valor de a: ");
	scanf("%d", &a);//10
	printf("Informe o valor de b: ");
	scanf("%d", &b);//5
	func(&a, &b);
	printf("soma: %d\nSubtracao: %d\n", a, b);
}
void func(int *x, int *y)
{
	int aux=*x;
	*x=aux + *y;
	*y=aux - *y;
}
