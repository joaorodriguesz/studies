# Struct - estrutura

> Uma estrutura ou struct é um grupo de elementos de dados agrupados sob um **nome**. Esses elementos de dados, conhecidos como membros, podem ter diferentes tipos e **diferentes tamanhos**.

---

## Declaração

> - Declara um tipo struct chamada produto, define 4 atributos, cada atributo neste caso tem um tipo de dado diferente. Esta declaração cria um novo tipo de dado de nome Produto, este tipo pode ser utilizado para criar objetos desse tipo. Ex: Teclado Mouse. Só vai ser salvo na memória assim que for instanciado um objeto. 
> - Também pode ser adicionado métodos como uma classe.
> - diferente da classe, a struct por default coloca todos os atributos como públicos.
>
> ```c++
> #include <iostream>
> struct Produto {
>  int Codigo;
>  std:: string Nome;
>  double Preco;
>  float peso
> }
> 
> //---------- 
> //Deste jeito os objs citados são estanciados automaticamente
> //Porém a cada obj novo terá que ser adicionado o nome ali.
> struct {
>  int Codigo;
>  std:: string Nome;
>  double Preco;
>  float peso
> } Teclado, Mouse
>     
> int main (){
>    Teclado.Codigo;
> }    
>     
> //------------    
> 
> int main (){
>  Produto Teclado; // <- Objeto instanciado 
>  Produto Mouse; // <- Objeto instanciado 
>  system("PAUSE");
>  return 0;
> }
> ```
>
> 

---

## Classes X Struct 

> Apesar de serem quase iguais nós usamos estruturas quando queremos uma coleção de membros de dados que devem estar acessíveis em qualquer lugar no código. Por outro lado, usamos classes quando estamos modelando uma forma e conceito mais complexo.
>
> > *explicação sobre orientação a objeto:* *https://github.com/JoaoPauloMRodrigues/Studies/tree/main/languagens/PHP_OO*