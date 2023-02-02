# AngularJs-  Aumentando a Performance

----

> Execesso de interação com o a DOM e principalmente pelo desperdício de empo processando coisas desnecessárias, por cona da forma como o cliclo de notificação do framework também conhecido como digest cycle, funcionas.

----

## ng-model-options

```html
<input ng-model-options="{updateOn: 'default blur', debounce:{default: 500, blur:0}}" />
```

----

## Track by

> Sempre defina o track by quando utilizar ng-repat e ng-options, pois ele não renderizara os itens repetidos apenas os novos.

```html
<div ng-repat="item in tens track by item.id"></div>
```

----

## Filtros