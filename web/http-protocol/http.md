# Http

---

> O HTTP (https://tools.ietf.org/html/rfc2616) é um protocolo que define as regras de comunicação entre cliente e servidor na internet. Vamos focar nos próximos vídeos e entender melhor esse protocolo tão importante. 
>
> Cliente (Navegador) <-- HTPP -->  Servidor

----

## Intermediarios

> Até a requisição chegar ao servidor a requisição passará por varios intermediarios.
> Cliente (Navegador)<- *MODEM* -> <- *ROTEADOR* -> <- *HTPP* -> <- *PROVEDOR* -> Servidor
> O Protocolo HTTP trafega em texto puro podem assim qualquer um que interceptar a mensagem conseguir ver os dados.


----

## HTTPS (HTTP + SSL/TLS)
> *Hypertext Transfer Protocol + Secure Sockets Layer/Transport Layer Security*
> Pelo fato do HTTP trafegar em texto puro foi ciado a implementação do HHTPS.

---

## Certificado Digital
>Para que a pagina torne-se segura ela precisa uma identidade confirmado (Certificado Digital) que possui uma chave pública que vai criptografar os dados do navegador, e somente no servidor com a chave privada ele ira conseguir acessar a mensagem.
>
>Certificado(Chave Publica) --> Servidor(Chave Privada)  
>  
>  Na aba do console do navegador possui uma opção chamada Security aonde é possivel visualizar qual certificado a pagina está usando.


---

## DNS (Domain Name System)
>HTTP:// <-(Protocolo) www.domain <-(Dominio) .com <-(SubDominio) :80 <-(Especifica porta do SV)
>*nslookup google.com* -> para ver detalhes do dominio
>
>DNS pega o dominio do site verifica e devolve o endereço ip para o navegador fazer a requisição.


---

## Recursos
>https://www.dominio.com.br::443/recurso/recurso.php
> URL são endereços WEB
> URL começa com o protocolo (http://) seguido pelo dominio (www.google.com.br)
> URL Após o dominio é especificado o caminho para um recurso (course/introducao-js)


--- 

## Requisição/Resposta
> HTTP não guarda estado. Cade requisição é unica. (STATELESS)
>
> Quando é feito o login e mandando uma unica vez os dados para o servidor e o servidor devolve  > uma chave para ser autenticada nas proximas vezes.
> 
> Session -> manter o usuario logado sem precisar mandar sempre os dados de login
> 
> A sessão é aramazenada em um *cookie* que é um obj de chave e valor
> 
> HTTP segue o o modelo requisição-resposta
> A requisição precisa  ter todas as informacoes
> HTTP é STATELESS (Não mantem as informações entre as requisições)
> AS plataformas de desenvolvimento usam as session para guardar informações entre requisições 

---

## Status Code
> As resiquições HTTP devolvem status para mostrar o estadado da requisição.

---

## Parametros HTTP
> GET -> Receber
> POST -> submeter
> PUT -> Atualizar
> DELETE -> Remover

---

## REST (Representational State Transfer)
> Padrão arquitetural para conunicação entre aplicações.
> 
> URI: http://dominio.com/api/recurso
> URI + METHOD
> URI - GET
> URI - POST
> URI - PUT
> URI - DELETE

---

##HTTP2
> Atua sobre o HTTP
> 
> HEADERS STATEFUL 
> Headers binários e comprimidos (HPACK)
> GZIP padrão na respostas
> Headers são mandados apenas o mudou
>
> SERVER PUSH
> O servidor mandar mais que a requisição pede, como tudo que é necessario para carregar a pagina
> 
> Multiplexing (Requisição e respostas paralelas).
>