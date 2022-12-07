# AngularJs - Diretivas parte 2

----

## Diretivas

> *Diretivas são extensões da linguagem HTML que permitem a implementação de novos comportamentos, de forma declarativa*.

----

## Algumas diretivas

> - **ng-disabled="condicao"**: *Se a condicao for verdadeira ele ira disabilitar o campo em questao.*
> - **ng-options="obj.descricao for obj in objArray":** *Renderizar opcoes de um select.* => retorna o objeto selecionado como value.
> - **ng-options="obj.value as obj.desc for obj objArray":** *Renderizar opcoes de um select.* => retorna apenas o value setado.
> - **ng-options="obj.descricao group by obj.agrupador for obj in objArray":** *Renderizar opcoes de um select agrupado.* => retorna o objeto selecionado como value.
> - **ng-class="variavelStyle":** Aplica o valor da variável como classe.
> - **ng-class"[class1, class2]"**: Aplica como classe todos os valores do array.
> - **ng-class="{classe1: condicaoTrue, classe2: condicaoTrue}":** Aplica a classe se condição for verdadeira.
> - **ng-class="{ 'classe1 classe2', condicaoTrue }":** Aplica uma ou mais classe com uma condicao só.
> - *As mesmas opcoes do ng-class podem ser usadas com o ng-style*.
> - **ng-include=" 'caminho/pagina.html ' '' ":** Incluir o conteúdo de outra pagina. 

