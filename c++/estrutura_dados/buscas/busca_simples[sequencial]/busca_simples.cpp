#include<iostream>
#include <new>
#include<string>
#include<stdlib.h>
#define TAM 10

using namespace std;

int buscaSimples (int vetor[TAM], int valorProcurado, int *posicaoEncontrada);

int main (){
	int vetor[TAM] = {1,22,34,56,75,85,85,93,23,50};
	int valorProcurado;
	int posicao;
	int i;
	int posicaoEncontrada;
	
	for(i = 0;i < TAM; i++){
		cout << vetor[i] << "\n";
	}
	
	cout << "Qual numero deseja encontrar ?"; 
	cin  >> valorProcurado;
	
	if(buscaSimples(vetor,valorProcurado, &posicaoEncontrada)){
		cout << "o valor foi encontado na posicao " << posicaoEncontrada; 
	} else {
		cout << "o valor nao foi encontado "; 
	}
	
	return 0;
	
}

int buscaSimples (int vetor[TAM], int valorProcurado, int *posicaoEncontrada){
	
	bool valorFoiEcontrado;
	
	for(int i = 0;i < TAM; i++){
		if(vetor[i] == valorProcurado){
			valorFoiEcontrado = true;
			*posicaoEncontrada = i;
		}	
	}
	
	return valorFoiEcontrado;
	
}
