# Notas

----

## *Árvore DOM*

​	O Modelo de Objeto de Documento (**DOM**) é uma interface de programação para documentos HTML, XML e SVG . Ele fornece uma representação estruturada do documento como uma **árvore**. O **DOM** define métodos que permitem acesso à **árvore**, para que eles possam alterar a estrutura, estilo e conteúdo do documento.

> -   ***Window***
>
> - ## 	   ↓
>
> - ***Document***
>
> - ##         ↓
>
> -   ***HTML***
>
> - ##         ↓
>
> - ***Elementos HTML e seus filhos***

----

## *Data Attributes*

> O **atributo data-** permite ao autor armazenar informações extras em elementos HTML sem a necessidade de uso de um elemento não semântico ou de poluir os nomes de classes, como fazíamos na HTML anterior com o uso de **atributos** personalizados.



----

## *Template String*

> **Template Strings** são **strings** que permitem expressões embutidas. Você pode utilizar **string** multi-linhas e interpolação de **string** com elas. Basicamente é uma nova forma de criar **strings** e tornar o seu código um pouco mais legível.

```js
return `<h1>
	   ${varivelTitulo}
    	</h1>`;
```

---

## ***I I F E*** 

> **IIFE** (Immediately Invoked Function Expression) é uma função em [JavaScript](https://developer.mozilla.org/pt-BR/docs/Glossary/JavaScript) que é executada assim que definida.
>
> É um Design Pattern também conhecido como [Self-Executing Anonymous Function](https://developer.mozilla.org/pt-BR/docs/Glossary/Self-Executing_Anonymous_Function) e contém duas partes principais. A primeira é a função anônima cujo escopo léxico é encapsulado entre parênteses. Isso previne o acesso externo às variáveis declaradas na IIFE, bem como evita que estas variáveis locais poluam o escopo global.
>
> A segunda parte corresponde à criação da expressão `()`, por meio da qual o interpretador JavaScript avaliará e executará a função.

```js

(() => {     

    const exemple = () => {
        //cod.....
    }

    const exemple = (ex) => {
     	//cod....
    }
    
})()
```

