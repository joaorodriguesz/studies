# AngularJs - Diretivas

---

```js
angular.module("modulo").directive("diretiva", function(){
		return{
			//propriedades
		}
	})
))
```

----

> - template
> - templateUrl
> - replace
> - restrict
> - scope
> - translude

----

## Template e templateUrl

> Especifica o template ou a url do template que deverá ser incluído dentro do elemento que estiver utilizando a diretiva.

---

## Replace

> Substitui o elemento pelo template da diretiva.

---

## Restrict

> Restringe o modo de utilização da diretiva ao atributo, elemento, classe e comentário, ou ainda uma combinação deles.
>
> Caso não seja definido, o padrão é que a diretiva seja atribuída pelo atributo.
>
> Parametros:
>
> - **A**  - *Diretiva restrita ao atributo do elemento:*
>
>   ```html
>   <div diretiva></div>
>   ```
>
> - **E** - *Diretiva restrita ao elemento:* 
>
>   ```html
>   <diretiva></diretiva>
>   ```
>
> - **C** - *Diretiva restrita a classe do elemento:*
>
>   ```html
>   <div class='diretiva'></div>
>   ```
>
> - **M** - *Diretiva restrtira ao comentário do elemento:*
>
>   ```html
>   <!--directive: directiveName -->
>   <div></div>
>   ```

----

## Scope

> Por padrão, uma diretiva compartilha o mesmo scope de onde é utilizada.
>
> Para aumentar seu potencial de reuso, podemos isolar seu scope, passando os dados necessários por parâmetro.
>
> ---
>
> ### @
>
> >  VIncula o valor do atributo diretamente a uma propriedade do scope da diretiva.
>
> ---
>
> ### =
>
> > Cria um vínculo bi-direcional entre uma propriedade do scope do template a uma propriedade do scope da diretiva.
>

---

## Transclude

> Encapsula elementos dentro de uma diretiva, criando um scope não isolado.
>
> Aonde vai ser carregado o transclude no template da diretiva.
>
> ```html
> <div ng-transclude>
>     /... carrega
> </div>
> ```
>
> 

----

```js
angular.module("modulo").directive("diretiva", function(){
		return{
			template: "<div>Alert<div>",
            replace: true,
            restrict: 'E',
            scope: {
                variavel: '@propriedade', //-> tras o valor do atributo
                propriedade: '@', //-> se os nome do atributo e da variavel forem iguais pode ser usado assim tbm
                variavel: "=propriedade" //-> to way data bind
            },
            transclude: true
		}
    
	})
))
```

```js
angular.module("modulo").directive("diretiva", function(){
		return{
			templateUrl "caminho/template.html"
		}
	})
))
```

