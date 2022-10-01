#include <iostream>
#include <stdlib.h>
#include <string>
#define TAM 10

using namespace std;
void dump (int vetor[TAM]);

void insertion_sort(int vetor[TAM]){

    int atual;
    int j;
    int i;

    //o valor da posição 0 ja esta ordenado pq n há ngm mneor que ele a esquerda
    //por isso começamos em 1


    for(i=1;i<TAM;i++){
        //a cada loop do for a variavel atual armazena a posição I atual do vetor
        atual = vetor[i];
        //elemento anterior sendo analisado
        j = i - 1;
        //analisando membros anteriores
        while((j >= 0) && (atual < vetor[j])){
            //posiciona os elementos uma posição para frente
            vetor[j+1] = vetor[j];
            //faz o j andar para atras
            j--;
        }
        //agora que temos espaço colocamos o atual na posicao correta
        vetor[j+1] = atual;
    }



}

int main () {
    int vetor[TAM] = {10,9,8,7,6,5,4,3,2,1};
    insertion_sort(vetor);
    dump(vetor);

}

void dump (int vetor[TAM]){
	for(int i=0;i<TAM;i++){
		cout << "[" << i << "] => ";
		cout<< vetor[i] << " ";
	}
}
