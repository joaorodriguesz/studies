#include <iostream>

int main()
{
	setlocale(LC_ALL, "portuguese");
	int Numero{ 4090 };
	int *ptr;
	int *ptr2;
	ptr = &Numero;
	ptr2 = ptr;
	std::cout << "\nEndereço contido dentro de ptr: " << ptr << "\n";
	std::cout << "\nEndereço contido dentro de ptr2: " << ptr2 << "\n";
	std::cout << "\nEndereço de ptr na memória RAM: " << &ptr << "\n";
		//pois você deseja que seja buscado o endereço de memória RAM que ptr2 esta alocado e carregado
	std::cout << "\nEndereço de ptr2 na memória RAM: " << &ptr2 << "\n";
	std::cout << "\nValor de Numero agora: " << Numero << "\n";
		*ptr2 = *ptr + 10;
	std::cout << "\nValor de Numero agora: " << Numero << "\n";
	system("PAUSE");
	return 0;
}
