#include<iostream>
#include<iomanip> /*(maior precisão para numneros maiores)*/


int main()
{
	/*VARIAVEL INT*/
	int numero;
	numero = 5;
	std::cout << "valor numero :" << numero << std::endl;
	std::cout << "tamanho da variaverl numero :" << sizeof(numero)
		<< " bytes" << "\n";


	//VARIAVEL FLOAT< E (DOUBLE= para digitos maiores)
	float numero2;
	numero2 = -5, 5555;
	double numero3;
	numero3 = 55555.55555;

	std::cout << "valor numero f :" << numero2 << std::endl;
	std::cout << "tamanho da variaverl numero f :" << sizeof(numero2)
		<< " bytes" << "\n";


	std::cout << "valor numero d :" << std::setprecision(12) << numero3 << std::endl;
	/*(setprecision(numero)) todos os numero antes de dps do ponto*/

	std::cout << "tamanho da variaverl numero d :" << sizeof(numero3)
		<< " bytes" << "\n";



	/*VARIAVEL CHAR*/ 	/*VARIAVEL BOOL (false or tru)( 0 or 1*/
	char  palavra;
	bool boleano;
	palavra = 'a';

	std::cout << "valor da letra  :" << palavra << std::endl;
	std::cout << "tamanho da variaverl numero  :" << (void*)&palavra << "\n";
	/*para ver tamanho da alocação da memoria */
	 
	boleano = (palavra == 'b');
	std::cout << "boleano e igual a : "<< boleano << std::endl;

	system("PAUSE");







}