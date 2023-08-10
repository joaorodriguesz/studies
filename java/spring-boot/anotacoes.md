# API SPRING BOOT #1

-----

## Objetivo

> - Desenvolimento de uma API REST
> - CRUD
> - Validacoes
> - Paginacao e ordenacao

----

## Tecnologias

> - Spring Boot 3
> - Java 17
> - Lombok
> - MySQL / Flyway
> - JPA / HIBERNATE
> - Maven

---

## Inicializar configuracao do spring 

> https://start.spring.io/

----

## Anotacoes

> ![](./imgs/diretorios.png)
>
> ```txt
> >controller
> 	>End poits e metodos
> >medico
> 	>Entidade
> 	>Dtos
> 	>Repository (Metodos de manipulacao de BD)
> >db/migrations
> 	>Versionamento de bancp de dados (Arquivos SQL)
> ```
>
> 

----

## Responses

> | Código | Significado en Inglés   | Significado em Português |
> | ------ | ----------------------- | ------------------------ |
> | 1xx    | Informational Responses | Respostas Informativas   |
> | 100    | Continue                | Continuar                |
> | 101    | Switching Protocols     | Mudança de Protocolo     |
> | 2xx    | Successful Responses    | Respostas Bem-Sucedidas  |
> | 200    | OK                      | OK                       |
> | 201    | Created                 | Criado                   |
> | 204    | No Content              | Sem Conteúdo             |
> | 3xx    | Redirections            | Redirecionamentos        |
> | 300    | Multiple Choices        | Múltipla Escolha         |
> | 301    | Moved Permanently       | Movido Permanentemente   |
> | 304    | Not Modified            | Não Modificado           |
> | 4xx    | Client Errors           | Erros do Cliente         |
> | 400    | Bad Request             | Solicitação Inválida     |
> | 401    | Unauthorized            | Não Autorizado           |
> | 403    | Forbidden               | Proibido                 |
> | 404    | Not Found               | Não Encontrado           |
> | 405    | Method Not Allowed      | Método Não Permitido     |
> | 5xx    | Server Errors           | Erros do Servidor        |
> | 500    | Internal Server Error   | Erro Interno do Servidor |
> | 501    | Not Implemented         | Não Implementado         |
> | 503    | Service Unavailable     | Serviço Indisponível     |

---

## Spring Security

> Em essência, o módulo Spring Security é uma ferramenta essencial para proteger aplicativos Java, ajudando a manter a integridade dos dados, a confidencialidade das informações e a garantir que apenas os usuários autorizados possam acessar os recursos do aplicativo.
>
> - Autenticacao
> - Autorizacao
> - Protecao contra ataques (CSRF, clickjacking, etc.)

---

## JWT

> JWT (JSON Web Token) é um formato padrão para representar informações de forma segura entre duas partes, geralmente usado para autenticação e troca de informações entre um cliente e um servidor. Ele é frequentemente utilizado em aplicações web e APIs para transmitir informações sobre o usuário autenticado de maneira compacta e segura.
>
> O JWT é composto por três partes:
>
> 1. **Header**: Contém informações sobre o tipo de token (que é JWT) e o algoritmo de criptografia utilizado para assinar o token.
> 2. **Payload**: É onde os dados do token são armazenados. Esses dados são normalmente informações sobre o usuário ou outras entidades, como permissões, roles, ou quaisquer outros dados relevantes para a aplicação.
> 3. **Signature**: É uma assinatura digital que garante que o token não foi alterado durante a sua transmissão. A assinatura é criada usando a chave secreta do servidor, o que permite que o servidor verifique a integridade do token quando o receber.

---

![](./imgs/jwt.png)

---

![](./imgs/jwt2.png)
