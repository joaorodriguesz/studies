# Maven

---

> - Processo de build em uma aplicação java
> - Gerenciamento de dependências em uma aplicação java

----

## Build + Dependências em Java 

> **Apache Ant e apache IVY** *(Antigamente)*
>
> Apache juntou tudo e criou o **Apache Maven** *(hoje)*

----

## Acesso

> Acesso via terminal ou integração com a IDE

---

## Dependencies

> ### Scope
>
> - compile: *Utilizar dependencia apenas em tempo de compilação.*
> - provided: *Precisa usar para escrever o codigo, mas na hora de gerar o build não, pois um sv pode fornecer ela depois.*
> - runtime: *Apenas em tempo de execução.*
> - test: *Apenas durante os testes.*

---

##   Repositorios

> Maven baixa tudo do repositorio central do maven e cacheia dentro da pasta m2, mas também pode ser configurado para outros.

---

## Build

> Os builds  e gerar os artefatos (***Um arquivo ou diretório produzido por um build**. No contexto da publicação de bibliotecas, um artefato geralmente é um arquivo JAR ou AAR.*) que podem ser configurados para executar outras tarefas juntos como rodar testes unitarios.
>
> 
>
> comandos goal.
>
> ```bash
> mvn clean
> mvn compile
> ```
>
> 

----

## Plugin

> Adicionar recursos a mais para o build da aplicação.
> cada um tem sua propria configuração

----

## Proxy

> Proxy para poder baixar as dependencias do maven de outras redes
> para configurar e necessario criar um arquivo *settings.xml* dentro da pasta *.m2* do maven, ou adicionar ao **pom.xml*

----

## Modules

> Antes do java-9 os modulos era configurados no maven
> o modulo filho herda as dependencias do modulo pai

