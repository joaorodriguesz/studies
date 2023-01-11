# AngularJs - Módulos

---

## Módulo

> Um módulo é uma coleção de componentes, ou seja, um conjunto de controllers, directives, filters, services, entre outros tipos de componente utilizados pela aplicação.

---

## $templateCache

> Na primeira vez que um template é carregado, ele é armazenado em cache, e acessível por meio do serviço $templateCache.
>
> ```js
> $templateCache.put("nomeDoTemplate", 'codigoHtml')
> ```
>
> 

----

## Run

>  Bloco de inicialização de um modulo
>
> ```js
> angular.module("moduleNmae").run(function(){
> 	console.log()
> })
> ```

---