#include<iostream>
#include <new>
#include<string>
#include<stdlib.h>
#define TAM 11

using namespace std;

int buscaBinaria (int vetor[TAM], int valorProcurado, int *posicaoEncontrada);

int main (){
	int vetor[TAM] = {10,20,30,40,50,60,70,80,90,100,110};
	int valorProcurado;
	int posicao;
	int i;
	int posicaoEncontrada;
	
	for(i = 0;i < TAM; i++){
		cout << vetor[i] << "\n";
	}
	
	cout << "Qual numero deseja encontrar ?"; 
	cin  >> valorProcurado;
	
	//cout << buscaBinaria(vetor,valorProcurado, &posicaoEncontrada);
	
	if(buscaBinaria(vetor,valorProcurado, &posicaoEncontrada)){
		cout << "o valor foi encontado na posicao " << posicaoEncontrada; 
	} else {
		cout << "o valor nao foi encontado "; 
	}
	
	return 0;
	
}

int buscaBinaria (int vetor[TAM], int valorProcurado, int *posicaoEncontrada){
	
	int esquerda = 0;
	int direita  = TAM - 1;
	int meio;
	
	while(esquerda <= direita) {
		
		meio = ((esquerda + direita) / 2);
	
		if(valorProcurado == vetor[meio]) {
			*posicaoEncontrada = meio;
			return 1;
		}
		
		if(vetor[meio] < valorProcurado){
			esquerda = (meio + 1);
			
		} else {
			direita = (meio - 1 );
		}
		
	}
	
	return 0;
	
	
}
