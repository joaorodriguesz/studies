#include <iostream>
#include <stdlib.h>
#include <string>
#define TAM 10

using namespace std;

void dump (int vetor[TAM], int tamanho);
void fila_construtor(int *frente, int *tras);
void fila_enfileirar(int fila[TAM], int valor, int *tras);
int fila_tamanho(int tras, int frente);
void fila_desinfileirar (int fila[TAM], int *frente, int tras);\
bool fila_vazia (int frente, int tras);

int main (){
    int fila[TAM] = {0,0,0,0,0,0,0,0,0,0};
    int frente;
    int tras;
    int valor;
    fila_construtor(&frente, &tras);
    fila_enfileirar(fila, 5, &tras);
    fila_desinfileirar(fila,&frente,tras);
    fila_enfileirar(fila, 5, &tras);
    fila_desinfileirar(fila,&frente,tras);
    dump(fila, fila_tamanho(tras,frente));
    bool fila_cheia (int tras);


    return 0;
}
//desinfileira a fila
void fila_desinfileirar (int fila[TAM], int *frente, int tras) {
    if(fila_vazia(*frente,tras)){
        cout << "a fila esta vazia";
    } else {
        cout << "\nvalor retirado " << fila[*frente] << "\n";
        fila[*frente] = 0;
        *frente = *frente +1;
    }
}
//pega o tamanhho da fila
int fila_tamanho(int tras, int frente){
    return (tras - frente) + 1;
}

//verifica se a fila ta vazia
bool fila_vazia (int frente, int tras) {
    if(frente > tras){
        return true;
    } else {
        return false;
    }
}
//verifica se a fila esta cheia
bool fila_cheia (int tras){
    if(tras == TAM - 1){
        return true;
    } else {
        return false;
    }
}
//mostra a fila
void dump (int vetor[TAM],int tamanho){
	for(int i=0;i<TAM;i++){
		cout << "[" << i << "] => ";
		cout<< vetor[i] << " ";
	}
}

void fila_construtor(int *frente, int *tras){
    *frente = 0;
    *tras = -1;
}

void fila_enfileirar(int fila[TAM], int valor, int *tras){
    if(fila_cheia(*tras)){
        cout << "fila cheia";
    } else {
        *tras = *tras + 1;
        fila[*tras] = valor;
    }

}

