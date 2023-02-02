# AngularJs - Single-Page Application

---

> Single-Page Application é uma aplicação de realiza suas transições dentro de uma mesma página, carregando seus componentes de forma dinâmica utilizando ajax.

---

## ngRoute

> Módulo do framework que fornece serviços para realizar o  roteamento de páginas.

---

## $routeProvider

> Podemos configurar o serviço de roteamento por meio de $routeProvider, configurando a cada rota específica e também uma rota padrão, caso nenhuma seja encontrada.
>
> - when(path, route)
> - otherwise(path)
>
> ### route object
>
> > Objeto de configuração de cada rota, permite configurar diversos aspectos do roteamento.

---

## ngView

> Diretiva utilizada para renderizar o template da rota acessada.

----

## $location

> Para redirecionar para os paths

---

```js
app.config(function ($routeProvider){
	$routeProvider.when("/contatos/:id", {
		templateUrl: "",
		controller: "",
		resolve: {
            resaolvido: teste();
			//carrega o que é necessario para acessar a rota
            //ent só injetar resolvido no   $scope
		}
	})
})

//também é possivel passar parametros nas rotas e pegar atravez de $routeParams
```

