//precisamos incluir o arquivo .h relativo a classe Conta
//Para que este arquivo Conta.cpp possa "Enxergar" as declara??es da classe Conta.
#include "Conta.h"
#include <iostream>
#include <string>

//Aqui o operador escopo:: est? indicando que a fun??o/M?todo sacar pertence a classe Conta e que este c?digo a seguir vai implementar a fun??o Sacar.
bool Conta::Sacar(double Valor)
{
	//Se o valor do Saldo no Objeto for menor que o valor a ser sacado, ele n?o poder? sacar
	if (Saldo < Valor)
	{
		std::cout << "\Saldo Insuficiente!\n";
		std::cout << "Seu Saldo Atual: R$" << ConsultarSaldo() << "\n";
		return false;
	}
	else
	{
	//Sen?o ele poder? sacar
	//Temos que diminuir o saldo
		Saldo = Saldo - Valor;
		std::cout << "Seu Saldo Atual: R$" << ConsultarSaldo() << "\n";
		return true;
	}
	
}

void Conta::Depositar(double Valor)
{
	Saldo += Valor; //o mesmo que Saldo = Saldo + Valor;
	std::cout << "\nDeposito de R$ " << Valor << " Efetuado com Sucesso!\n";
}

//A fun??o recebe como argumentos para seus seus par?mtros um Objeto do tipo Casa e um valor double.

//Aqui o par?metro Destino ir? receber este objeto
void Conta::Transferir(Conta &Destino, double Valor)
{
	if (Saldo < Valor)
	{
		std::cout << "\nSaldo Insuficiente\n";

	}
	else
	{
		//Aqui Destino est? com o objeto passado para a fun??o
		//Logo vai chamar o m?todo Depositar desta fun??o
		Destino.Depositar(Valor);
		//Depois de depositar voc? deve retirar este valor depositado do saldo
		Saldo -= Valor;
		std::cout << "\n*****Dados*****\n";
		std::cout << "Titular: " << Destino.GetTitular() << "\n";
		std::cout << "Banco: " << Destino.GetBanco() << "\n";
		std::cout << "Agencia: " << Destino.GetAgencia() << "\n";
		std::cout << "Conta: " << Destino.GetNumConta() << "\n";
		std::cout << "Transfer?ncia Realizada com Sucesso!\n";
		std::cout << "Seu Saldo Atual: R$" << ConsultarSaldo() << "\n";
		
	}
}

double Conta::ConsultarSaldo()
{
	return Saldo;
}

std::string Conta::GetBanco()
{
	return Banco;
}

int Conta::GetAgencia()
{
	return Agencia;
}

int Conta::GetNumConta()
{
	return NumConta;
}

std::string Conta::GetTitular()
{
	return Titular;
}

void Conta::SetBanco(std::string Banco)
{
	//Como o compilador vai saber se Banc? ? vari?vel local ou o atributo da classe Conta?
	//se this ? um ponteiro para chegar no apontado pelo ponteiro temos
	//*this , mas como this ? um ponteiro para um objeto ele precisa usar a nota??o ponto. para acessar atributos e executar fun??es do objeto

	//Agora o compilador sabe que Banco ? a vari?vel local que recebeu o argumento string
	//e que deve ser colocada no atributo Banco do objeto apontado por this
	//(*this).Banco = Banco;
	//Contudo no geral usa-se a nota??o flecha
	this->Banco = Banco;
}

void Conta::SetAgencia(int Agencia)
{
	this->Agencia = Agencia;
}

void Conta::SetNumConta(int NumConta)
{
	this->NumConta = NumConta;
}

void Conta::SetTitular(std::string Titular)
{
	this->Titular = Titular;
}
