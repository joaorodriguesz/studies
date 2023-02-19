#include<iostream>


int main()
{
	//Operador ternario
	int maiornumero,numero1=3,numero2=1;
	//retorna um valor para variavel
	//caso o numero 1 for maior q o numero 2 (verdadeiro) maiornumero recebe numero1
	// caso não for (verdadeiro) numero2 sera armazenado em numero2
	maiornumero = (numero1 > numero2) ? numero1/*(true)*/ : numero2;/*(false)*/
	std::cout << maiornumero << std::endl;


	//se numero1 for maior que zero ele printara menor q zero   (verdadeiro)
	//se numero1 não for maior q zero ele printara menor q zero   (falso)
	numero1 > 0 ? std::cout << "maior que zero" : std::cout << "menor q zero";

}
