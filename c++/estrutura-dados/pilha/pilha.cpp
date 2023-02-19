#include <iostream>
#include <stdlib.h>
#include <string>
#define TAM 10

using namespace std;

void dump (int vetor[TAM]);
void pilha_push(int pilha[TAM], int valor,int *topo);
void pilha_pop(int pilha[TAM], int *topo);
bool pilha_vazia(int topo);
bool pilha_cheia(int topo);
void pilha_construtor(int pilha[TAM], int *topo);
int pilha_tamanho (int topo);
int pilha_get (int pilha[TAM], int *topo);


int main (){
	int pilha[TAM];
	int topo;
	
	pilha_construtor(pilha, &topo);
	
	dump(pilha);
	cout <<"\n";
	pilha_push(pilha,10,&topo);
	pilha_push(pilha,5,&topo);
	dump(pilha);
	pilha_pop(pilha,&topo);
	dump(pilha);
	cout << "\n ultimo valor da pilha : " << pilha_get (pilha,&topo);
	cout << "\n tamanho da pilha : " << pilha_tamanho(topo);
}
//exibe a pilha
void dump (int vetor[TAM]){
	for(int i=0;i<TAM;i++){
		cout << "[" << i << "] => ";
		cout<< vetor[i] << " ";
	}
}

//Caso a pilha esteja vazia
bool pilha_vazia(int topo){
	if(topo == -1){
		return true;
	} else {
		return false;
	}
}

//confere se a pilha está cheia
bool pilha_cheia(int topo){
	if(topo == TAM -1){
		return true;
	} else {
		return false;
	}
}

//retorna tamanho
int pilha_tamanho (int topo){
	return topo + 1;
}

//inicia a pilha zerada
void pilha_construtor(int pilha[TAM], int *topo){
	*topo = -1;
	for(int i=0;i<TAM;i++){
		pilha[i] = 0;
	}
}

// retorna o ultimo valor da pilha
int pilha_get (int pilha[TAM], int *topo){
	if(pilha_vazia(*topo)){
		cout << "vazia";
	} else {
		return pilha[*topo];
	}
}

//adiciona itens a pilha
void pilha_push(int pilha[TAM], int valor,int *topo){
	if(pilha_cheia (*topo)){
		cout << "Pilha cheia";
	} else {
		*topo = *topo + 1;
		pilha[*topo] = valor;
	}
	
}

//desempilha a pilha
void pilha_pop(int pilha[TAM], int *topo){
	if(pilha_vazia(*topo)){
		cout << "Pilha vazia";
	} else {
		cout << "\n\n"<< "valor retirado :" << pilha[*topo] << "\n\n";
		pilha[*topo] = 0;
		*topo = *topo -1;
		
	}
}


