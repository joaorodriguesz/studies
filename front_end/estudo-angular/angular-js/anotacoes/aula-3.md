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

