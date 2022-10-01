#include <iostream>

//Função void, não retorna nada (Não precisa de um "return;" para retornar algo), apenas faz uma ação;
//E pode receber parametros;

void mensagem(char letra){
	std::cout << "void function, helllo!!!\n";	
}

int main(){
	mensagem();
	//return; -> sai da função, no ponto do return;
	//se não após executar a função ele retorna automaticamente
}
