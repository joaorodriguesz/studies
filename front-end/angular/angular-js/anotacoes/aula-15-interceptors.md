# AngularJs - Interceptors

---

> Um interceptor é um tipo de serviço que permite a interceptação das requisições e respsotas do serviço $http.

----

## Interceptor é um serviço

> ```js
> app.factory("nomeDoInterceptor", function($q){
>     return {
>         request: function (cofnig)  {
>             return config;
>         },
>         requestError: function (rejection)  {
>             return $q.rejection(rejection);
>         },
>         response: function (response)  {
>             return response;
>         }
>         responseError: function (rejection)  {
>             return $q.rejection(rejection);
>         }
>     }
> })
> ```
>
>  

----

## Configurando o interceptor

> O seriço $http possuio um array de interceptors que podem ser configurados na inicialização da aplicação.

----

## Timestamp Interceptor

>  Adiciona uma marcação contendo um timestamp em todas as requisições.