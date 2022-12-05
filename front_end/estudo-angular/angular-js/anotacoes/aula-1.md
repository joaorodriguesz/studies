# AngularJs - MVC

----

- **M => Model:**  *A responsabilidade dos models é representar o negócio.*
- **V => View:** *O que o cliente vê*.
- **C => Controller:** *Responsável pelo que a view consome.*
- **Angular => $scope**: *É um intermediario entre o controller e view* .

![](C:\Users\joao\Desktop\sudeni2\repositorios_git\public\estudos\front_end\estudo-angular\angular-js\anotacoes\imgs\$scope.jpeg)

-----

## Hello world Angular

> - **ng-app="*modulename*":**  *Informa ao AngularJS que este é o elemento raiz do aplicativo AngularJS.*
> -  **angular.module("modulename",[]) :**  *Cria o modulo a ser utilizado, como primeiro parametro o nome do modulo e segundo outros modulos que podem ser utilizados junto com este.*
> -   **angular.module("modulename").controller("controllername", ($scope) => { } :** *Localiza o modulo é cria um controller nele e injeta o $scope.*
> - **ng-controller="controllername":** *Para criar a view encima do controller.*
>
> ```html
> <!DOCTYPE html>
> <html lang="en" ng-app="helloworld">
> <head>
>   <meta charset="UTF-8">
>   <meta http-equiv="X-UA-Compatible" content="IE=edge">
>   <meta name="viewport" content="width=device-width, initial-scale=1.0">
>   <title>Hello world</title>
>   <script src="../../../node_modules/angular/angular.js"></script>
>   <script>
>     angular.module("helloworld",[]);
>     angular.module("helloworld").controller("helloworldController", ($scope) => {
>       $scope.message = "helloworld";
>     });
>   </script>
> </head>
> <body>
>   <div ng-controller="helloworldController">
>     {{ message }}
>   </div>
> </body>
> </html>
> ```
>
> 

