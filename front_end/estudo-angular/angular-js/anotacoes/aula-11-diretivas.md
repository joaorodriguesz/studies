# AngularJs - Diretivas 2

----

## Link

> Executada depois do template ter sido compilado, podemos utilizá-lo para interagir com o DOM, tratando eventos ou mesmo para definir o comportamento associado com a lógica da diretiva.



----

## Require

> Estabelece um vínculo com outra diretiva interagindo por meio do controller, que é um dos parâmetros da função link.

---

```js
angular.module("moduleName").directive("diretiveName", function (){
	return {
        require: "ngModel",
		link: function(scope, element, attrs, ctrl){
			element.bind("keyup", function (){
               ctrl.$viewValue;
               ctrl.$setViewValue(ctrl.$viewValue + "!");
               ctrl.$render();
            })
		}
	}
})
```

