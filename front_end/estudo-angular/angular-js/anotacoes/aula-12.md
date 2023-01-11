# AngularJs - Diretivas 3

----

## Require para diretiva pai

> ```js
> angular.module("moduleName").directive("diretivaPai", function (){
> 	return {
> 		controller: function($svope, $element, $attrs){
> 			function teste(){}
> 		}
> 	}
> });
> 
> angular.module("moduleName").directive("diretivaFilho", function (){
> 	return {
> 		require: "^diretivaPai"
>         link: function (scope, element, attrs, ctrl){
>             ctrl.teste();
>         }
> 	}
> });
> ```
>
> 
