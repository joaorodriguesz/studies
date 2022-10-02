#include<iostream>
using namespace std;

void recBubble(int arr[], int n){
   if (n == 1){
   	return;
   }
      
   for (int i=0; i<n-1; i++) {//para cada passagem 
      if (arr[i] > arr[i+1]){ //se o elemento atual for maior que o próximo
           swap(arr[i], arr[i+1]); //trocam de posição
	  //O maior elemento é fixo,recorre para o array restante
           recBubble(arr, n-1);
    	}
   }
}
int main() {
   int data[]={4,3,1,0};
   /*sempre divindo os bytes para saber qual posição que o array está
   no momento*/
   int n = sizeof(data)/sizeof(data[0]);
   cout << "\n tamanho da data " << sizeof(data) << "/" << sizeof(data[0]) << " = " << n <<  " posicoes no array\n";
   cout << "Sequencia Ordenada : ";
   recBubble(data, n);
   //exibe o resultado
   for(int i = 0; i <n; i++){
      cout << "["<< i  << "]=> " << data[i] << " ";
   }
}
