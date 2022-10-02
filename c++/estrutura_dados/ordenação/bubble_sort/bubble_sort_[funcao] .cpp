#include <iostream>
#include <stdlib.h>
#include <string>
#define TAM 10

using namespace std;
void dump (int vetor[TAM]);

void bubble_sort(int vetor[TAM]){
	
	int x;
	int y;  
	int aux;
	
	//valor da esquerda sendo analisado
	for(x=0; x < TAM; x++){
		
		//valor da direita sendo analisado
		for(y =+ x; y < TAM; y++){

			//confere a troca
			if(vetor[x] > vetor[y]){
				swap(vetor[x],vetor[y]);
			}
		}
	}
}

int main (){
	int vetor[TAM] = {10,9,8,7,6,5,4,3,2,1}; 
	bubble_sort(vetor);
	dump(vetor);
}

void dump (int vetor[TAM]){
	for(int i=0;i<TAM;i++){
		cout << "\n" << "[" << i << "] => ";
		cout<< vetor[i] << " ";
	}
}
