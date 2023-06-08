# Maven

---

> - Processo de build(pacotes: war, ear....) em uma aplicação java
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

## Estrutura de diretorios padrão MAVEN
> src/main/java: este diretório contém o código-fonte principal do projeto Java.
> src/main/resources: este diretório contém recursos adicionais que serão incluídos no pacote >final do projeto, como arquivos de configuração, arquivos de propriedades e arquivos de manifesto.
>src/test/java: este diretório contém os testes unitários do projeto Java.
>src/test/resources: este diretório contém recursos adicionais necessários para executar os testes, como arquivos de dados de teste e arquivos de configuração de teste.
>target: este diretório é criado pelo Maven e contém o resultado da compilação, incluindo os arquivos .class, bem como o pacote final do projeto, como um arquivo .jar ou .war.

---

## Config pom.xml
 
  <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.example</groupId>
  <artifactId>myproject</artifactId>
  <version>1.0-SNAPSHOT</version>
  <name>My Project</name>`
  <description>This is a sample project for Maven</description>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
    </plugins>
  </build>

</project>


O modelo de dados do Maven com a versão 4.0.0.
O grupo de identificação (groupId) do projeto como "com.example".
O nome do artefato (artifactId) do projeto como "myproject".
A versão do projeto como "1.0-SNAPSHOT".
O nome do projeto como "My Project".
A descrição do projeto como "This is a sample project for Maven".
A dependência do JUnit com a versão 4.12.
A configuração do plugin do compilador do Maven para usar o JDK 1.8.

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
