# AngularJs - Filtros

---

## Filtros

> Transformam o resultado de uma expressão, realizando operações como a formatação de data, a conversão de moeda e ordenação de array.

---

### Pipe (*expressão |  filtro*)

> ```html
> <tr>
>     <td>
>         { peassoa.nome | uppercase }
>     </td>
> </tr>
> ```

#### Pipe (*expressão |  filtro*)

Também pode ser usado dentro de loops para poder filtrar da lista

> ```html
> Busca em toda lista de objetos pela palavra 'Pedro'
> <tr ng-repeat="contato in contatos | filter:'Pedro' "> 
>     //....
> </tr>
> ```
>
> ```html
> Busda apenas pelo valor do atributo nome nos Objetos.
> <tr ng-repeat="nome in nomes | filter:{ nome: 'Pedro' } ">
>     //....
> </tr>
> ```
>
> 

----

### OrderBy (Ordena um array com base em um critério)

> ```html
> Ordena pelo atributo nome da lista de objeto.
> <tr ng-repeat="nome in nomes | filter:'Pedro' | orderBy: 'nome' ">
>     //.....
> </tr>
> ```
>
> ```html
> Ordena ASC
> <tr ng-repeat="nome in nomes | filter:'Pedro' | orderBy: '+nome' ">
>     //.....
> </tr>
> 
> Ordena DESC
> <tr ng-repeat="nome in nomes | filter:'Pedro' | orderBy: '-nome' ">
>     //.....
> </tr>
> 
> Adicionando o terceiro parametro que é o reverse. Ordena DESC
> <tr ng-repeat="nome in nomes | filter:'Pedro' | orderBy: 'nome': true ">
>     //.....
> </tr>
> ```
>
> *Funciona com qualquer expressão*

---

### Currency (*Converte numero para moeda*)

> ```html
> <h1>{{ valor | currency }}</h1>
> ```

---

### Number (*Converte numero*)

> ```html
> <h1>{{ 100 | number }}</h1> => 100
> <h1>{{ 100 | number:2 }}</h1> => 100.00
> ```

----

### LimitTo (*Limita o tamanho de um array ou de uma string*)

> ```html
> Ordena pelo atributo nome da lista de objeto e tras 2 itens apenas.
> <tr ng-repeat="nome in nomes | filter:'Pedro' | orderBy: 'nome' | limitTo: 2">
>     //.....
> </tr>
> ```
>
> ```html
> <h1>{{ joao | limitTo: 2}}</h1> => jo
> ```

----

### $filter controller

> ```js
> {nome: $filter('uppercase')('Pedro') }
> ```
>
> ```
> {nome: uppercaseFilter('uppercase')('Pedro') }
> ```
>
> 