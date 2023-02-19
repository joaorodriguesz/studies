## AngularJs - Requisições

-----

## $http

> O Serviço $http do Angular permite realização de requisições utilizando XMLHttpRequest ou via JSONP
>
> - **get(url, config)**
> - **post(url, data, config)**
> - **put(url, data, config)**
> - **delete(url, config)**
> - **head(url, config)**
> - **jsonp(url, config)**
>
> ---
>
> ```js
> $http.get('url') => retorna uma promise
> 
> $http.get('url').success(function (params...){}).error(function (params...){})
> 
> ```

---

**SOAP (Same-Origin Policy)**

> Política de restriçao de segurança que impede que o na egador acesse recursos alheios a sua origem, considerendo protocolo, host e porta.

### JSONP (JSON with padding)

> Estratégia utilizada para burlar o mecanismo de proteção dos navegadores em relação ao acesso de recursos externos.

### CORS (Corss-Origin Resource Sharing)

> Permissão para acessar recursos externois por meio de cabeçalhos HTTP adicionais.