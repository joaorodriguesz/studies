# AngularJs - Diretivas

----

## Diretivas

> *Diretivas são extensões da linguagem HTML que permitem a implementação de novos comportamentos, de forma declarativa*.

---

## Algumas diretivas

> - **ng-app="modulename"**: *Modulo principal da aplicação.*
> - **ng-controller="controllername":** *Defini o controller de aonde a diretiva for colocada e desse vinculo nasce a  view e o $scope.*
> - **ng-bind="variavel" ou {{ variavel }}:** *Defini valor texto de uma tag HTML com o valor da variavel no $scope.*
> - **ng-repeat="element in elementsArray":** *Repete a tag aonde ele foi colocado para todos os elementos passados por parametro.*
> - **ng-repeat="(key, valor) in elementsObj":** *Percorrer em objetos.*
> - **ng-model="variavel":** *Vincula uma propriedade ao $scope (define), realiza o two way data binding*
> - **ng-click="function()":** *Escuta um evento e despara uma funcao. Existem outras diretivas como estas de evento etc...*

---

## Anotações importantes

> - Evitar ao máximo ler o $scope estando dentro de controller. Apenas escrever.
> -  Tentar ao máximo ao criar uma entidade definir uma abstração. Se adicionado **ng-model="obj.attr"** o angular criaum objeto e suas propriedas no controller.
> - angular.copy(obj) ele copia um obj para uma referencia.
