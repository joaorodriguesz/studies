## 												**Anatomia de uma função**

```c++
<tipo de retorno (int,float,void ....)> nome_da_função (<declaração de parâmetros se tiver>) {
​	<bloco de codigo>
}
```

### -Se não for inicializado um tipo de retorno ele pegara por padrão **`int`**

----------------------------------------------------------------------------------------------------------------------------------------------------------------

```c++
#include <iostream>
//funções podem ser declaras acima da função main
int num(int num){
	return num + 2;
}
         
int main(){
    int var = 1;
    int result = 0;
    
	result = num(var);
    //e chamadas dentro da função
	std::cout << result;
    return 0;
}

//porém..............
```

```c++
#include <iostream>
//normalmente será declarado assim com a função abaixo
//Mas a sua inicialização encima chamada de <Protótipos de função>
//Poís o programa compila de cima para baixo <TOP -> DOWN> e função declarada em baixo
// não existira para o main chamar. 

//Por isso inicializamos um protótipo de função acima do main
/* --> */int num (int num);
int main(){
    int var = 1;
    int result = 0;
    
	result = num(var);
	std::cout << result;
    return 0;
}

int num(int num){
	return num + 2;
}

// mais exemplos e melhor explicação nesse arquivo: <function prototypes.cpp>
```



-------------------------------------------------------

**Exemplo de com cod completo :**

```c++
#include <iostream>
/*Crie uma função que indique se um número é par ou impar.
Receba número do usuário e exiba na tela o número recebido e se ele é par ou impar.
*/
//Protótipó da função
bool isPar(int num);

int main()
{
	int Numero;
	std::cout << "\nDigite um numero inteiro: ";
	std::cin >> Numero;
	//se o retorno da função for true significa que  a condição do if será verdadeira e entra no texto PAR
	//porém não é necessário esta comparação == true
	//aqui após executar a função será
	//if (true) ou if(false) e funciona da mesma forma
	//Profissionalmente só se utiliza assim
	if (isPar(Numero))
	{
		std::cout << "\nNumero: " << Numero << " PAR\n";
	}
	//Senão for PAR já sabemos que é IMPAR
	//podemos otimizar isso.
	// if também não precisa pois else já sabemos que é par
	else 
	{
		std::cout << "\nNumero: " << Numero << " IMPAR\n";
	}
	system("PAUSE");
	return 0;
}

bool isPar(int num)
{
	//se o resto da divisão de um numero for zero
	//numero é par logo retorne true(verdadeiro)
	//se não retorne false idicando que ele é false
	if (num % 2 == 0)
		return true;
	//Observe que return faz a saida imediata da função
	//Logo se for par o código abaixo jamais será executado. Assim o else é desnecessario
	return false;
}
```

