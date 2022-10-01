#include<iostream>
#include<new>
#include<string>
#include<stdlib.h>

using namespace std;

struct estrutura {
    int valorNumerico;\
    struct estrutura *prox;
};

int main (){
   //Cria o inicio da lista

    estrutura *ponteiroEncadeada;

    //Cria um novo valor

    estrutura *novoPrimeiroValor = new estrutura;
    novoPrimeiroValor->valorNumerico = 1;
    novoPrimeiroValor->prox = NULL;

    //faz o potneiro da encadeada apontar para o primeiro valor

    ponteiroEncadeada = novoPrimeiroValor;

    //cria um segundo valor

    estrutura *novoSegundoValor = new estrutura;
    novoSegundoValor->valorNumerico = 2;
    novoSegundoValor->prox = NULL;

    //Junta os valores com encadeamento

    ponteiroEncadeada->prox = novoSegundoValor;

    //imprimi lista encadeda

    while(ponteiroEncadeada != NULL){
        cout << ponteiroEncadeada->valorNumerico << endl;
        //Pula para a prox estrturua
        ponteiroEncadeada = ponteiroEncadeada->prox;
    }

    return 0;
}
