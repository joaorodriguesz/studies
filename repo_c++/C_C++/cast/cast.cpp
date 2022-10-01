#include<iostream>

//Quando um valor é convertudo de um tipo de dado para outro ocore um cast
//Neste caso é cast pos vc informou no código para qual tipo o compilador deve converter.
//Conversão explícita ou CAST

main(){
	
	float divisao (int num1, int num2){
		//Faz uma divisao inteira pois num1 e num2 são inteiros
		//mas podemos fazer um cast
		
		return (float)num1 / (float)num2;
		
		//agora estamos indicando que o inteiro deve ser um float
	}
	
//Porém se o compilador fizer esta conversão de forma automática chamamos isso de 
//conversão implícita de dados ou coerção

	int a =10;
	float c;
	c = a;
}

//Mas a conversão sempre se da do maior para o menor pq se não há perdas de dados
