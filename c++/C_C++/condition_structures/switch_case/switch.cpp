#include <iostream>

int main()
{
	int num1,num2;
	char operacao;

	std::cout << "digite um numero :";
	std::cin >> num1;
	std::cout << "\ndigite um numero : ";
	std::cin >> num2;
	std::cout << " \nqual operacao deja efetuar ?\n \n+ Adicao \n- Subtracao \n* Multiplicacao \n/ Divisao ";
	std::cout << "\nDigite a opcao desejada : ";
	std::cin >> operacao;

	switch (operacao)
	{
	case '+':
		std::cout << "\nsoma de num1+num2 = " << num1 + num2; 
		break;
	case '-':
		std::cout << "\nsubtracao de num1 - num2 = " << num1 - num2; 
		break;
	case '*':
		std::cout << "\nmultiplicacao de " << num1 <<"*" << num2 << "=" << num1 * num2; 
		break;
	case '/':
		std::cout << "\ndivisao de num1 / num2 = " << num1 / num2; 
		break;
	default: 
		std::cout << "\noperador invalido!";
	break;
	}
	std::cout << "\n";
	system("PAUSE");

}
