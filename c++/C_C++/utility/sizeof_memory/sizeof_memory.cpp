#include <iostream>
#include <tchar.h> /*utilização de acentos */

int main()
{
	_tsetlocale(LC_ALL, _T("portuguese"));
	/*para poder utilizar acentos */
	
	int vida = 5;
	int score = 1350; /*(ctrl+r ctrl r na varial)= mudar os nomes variaveis*/ 
	std::cout << "------------" << std::endl;
	std::cout << "vidas :" << vida << std::endl;
	std::cout << "scóre :" << score << std::endl;
	/*declaração de variavel*/
	
	std::cout << "endereço de memoria ram : " << &vida << "\n";
	std::cout << "endereço de memoria ram : " << sizeof(score)<< " bytes" << "\n"; /* (sizeof)mostra os bytes da memoria */
	//  (&) mostra endereço memoria 

	std::cout << "----now------" << std::endl;
	score = score + 150;
	vida = vida - 1;
	std::cout << "vida :" << vida << std::endl;
	std::cout << "score :" << score << std::endl;



	system("PAUSE");
	


	



}