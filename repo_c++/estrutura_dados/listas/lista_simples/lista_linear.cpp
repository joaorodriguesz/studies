#include <iostream>
#define TAM 10
using namespace std;


struct lista{
   int ult;     
   int valor[TAM];     
};

void iniciaLista(lista *indicie){
    indicie->ult = -1;
}

void insereFinal(lista *indicie, int valorIns){
    indicie->ult++;
    indicie->valor[ indicie->ult ] = valorIns;
}

int main(){
	lista list;
  	int valor;
	int posicao;
  	posicao = 0;
    iniciaLista(&list);
    while ((valor != 0)&& (posicao < TAM)){
    	cout << "Informe o valor a ser inserido: ";
        cin >> valor;   
    	insereFinal(&list,valor);
    	posicao++;
	}
    return 0;    
}
