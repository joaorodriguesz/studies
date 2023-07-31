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
> 1. **Compile**: O escopo `compile` é o padrão e indica que a dependência é necessária em tempo de compilação e em tempo de execução. Ela estará disponível durante o desenvolvimento e também será incluída no pacote final do projeto (como um arquivo JAR). Exemplo:
>
> ```xml
> xmlCopy code<dependencies>
>     <dependency>
>         <groupId>org.apache.commons</groupId>
>         <artifactId>commons-lang3</artifactId>
>         <version>3.12.0</version>
>         <scope>compile</scope>
>     </dependency>
> </dependencies>
> ```
>
> 1. **Provided**: O escopo `provided` indica que a dependência é necessária para compilar e testar o código, mas será fornecida em tempo de execução pelo ambiente em que o projeto será implantado. Um exemplo comum é quando você está desenvolvendo um aplicativo web e precisa do Servlet API para compilar e testar o código, mas o servidor de aplicativos em que você implantará o projeto já fornecerá essa dependência. Exemplo:
>
> ```xml
> xmlCopy code<dependencies>
>     <dependency>
>         <groupId>javax.servlet</groupId>
>         <artifactId>javax.servlet-api</artifactId>
>         <version>4.0.1</version>
>         <scope>provided</scope>
>     </dependency>
> </dependencies>
> ```
>
> 1. **Runtime**: O escopo `runtime` indica que a dependência é necessária em tempo de execução, mas não é necessária durante a compilação. Essas dependências não serão incluídas no pacote final do projeto. Um exemplo comum são os drivers de banco de dados, que são necessários apenas durante a execução do projeto. Exemplo:
>
> ```xml
> xmlCopy code<dependencies>
>     <dependency>
>         <groupId>mysql</groupId>
>         <artifactId>mysql-connector-java</artifactId>
>         <version>8.0.26</version>
>         <scope>runtime</scope>
>     </dependency>
> </dependencies>
> ```
>
> 1. **Test**: O escopo `test` indica que a dependência é necessária apenas durante a execução dos testes unitários. Essas dependências não serão incluídas no pacote final do projeto. Exemplo:
>
> ```xml
> xmlCopy code<dependencies>
>     <dependency>
>         <groupId>junit</groupId>
>         <artifactId>junit</artifactId>
>         <version>4.12</version>
>         <scope>test</scope>
>     </dependency>
> </dependencies>
> ```
>
> Esses são exemplos comuns de uso dos diferentes escopos de dependência no Maven. É importante escolher o escopo adequado para cada dependência, garantindo que elas estejam disponíveis nos momentos certos e não causem conflitos ou excesso de tamanho nos pacotes finais do projeto.
>
> - compile: *Utilizar dependencia apenas em tempo de compilação.*
> - provided: *Precisa usar para escrever o codigo, mas na hora de gerar o build não, pois um sv pode fornecer ela depois.*
> - runtime: *Apenas em tempo de execução.*
> - test: *Apenas durante os testes.*

---

##   Repositorios

> A pasta `.m2` é um diretório oculto que é criado no diretório do usuário quando o Maven é executado pela primeira vez. Essa pasta é conhecida como "repositório local do Maven" e contém todos os artefatos baixados do repositório Maven remoto.
>
> Dentro da pasta `.m2`, você encontrará subdiretórios organizados de acordo com a estrutura de diretórios do Maven, incluindo `repository` e `wrapper`.
>
> - `repository`: É o diretório principal onde todas as dependências (JARs, WARs, AARs, etc.) e seus metadados são armazenados. Cada dependência é armazenada em um diretório separado, com base no groupId, artifactId e versão da dependência. Esses arquivos são baixados automaticamente pelo Maven do repositório Maven remoto e são reutilizados em projetos futuros para evitar a necessidade de baixá-los novamente.
> - `wrapper`: Este diretório contém arquivos relacionados ao Maven Wrapper, que é uma maneira de encapsular o Maven junto com um projeto, permitindo que o Maven seja executado sem a necessidade de uma instalação global do Maven no sistema. O Maven Wrapper fornece um script de inicialização e um arquivo de configuração para baixar e configurar automaticamente a versão correta do Maven para o projeto.

---

## Estrutura de diretorios padrão MAVEN
> src/main/java: este diretório contém o código-fonte principal do projeto Java.
> src/main/resources: este diretório contém recursos adicionais que serão incluídos no pacote >final do projeto, como arquivos de configuração, arquivos de propriedades e arquivos de manifesto.
> src/test/java: este diretório contém os testes unitários do projeto Java.
> src/test/resources: este diretório contém recursos adicionais necessários para executar os testes, como arquivos de dados de teste e arquivos de configuração de teste.
> target: este diretório é criado pelo Maven e contém o resultado da compilação, incluindo os arquivos .class, bem como o pacote final do projeto, como um arquivo .jar ou .war.
>
> ```
> meu-projeto
> ├── src
> │   ├── main
> │   │   ├── java
> │   │   │   └── com
> │   │   │       └── example
> │   │   │           └── MeuProjeto.java
> │   │   └── resources
> │   │       └── application.properties
> │   └── test
> │       ├── java
> │       │   └── com
> │       │       └── example
> │       │           └── MeuProjetoTest.java
> │       └── resources
> │           └── test.properties
> └── pom.xml
> 
> ```
>
> 

---

## Config pom.xml

  

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    
    <groupId>com.example</groupId>
    <artifactId>meu-projeto</artifactId>
    <version>1.0.0</version>
    <name>Meu Projeto</name>
    <description>Um exemplo de projeto Maven</description>
    
    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
    
    <dependencies>
        <!-- Dependências do seu projeto -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    
    <build>
        <plugins>
            <!-- Plugins do Maven -->
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

```

- O modelo de dados do Maven com a versão 4.0.0.
- O grupo de identificação (groupId) do projeto como "com.example".
- O nome do artefato (artifactId) do projeto como "meu-projeto".
- A versão do projeto como "1.0-SNAPSHOT".
- O nome do projeto como "Meu Projeto".
- A descrição do projeto como "Um exemplo de projeto Maven".
- Versão do java
- A dependência do JUnit com a versão 4.12.
- A configuração do plugin do compilador do Maven para usar o JDK 1.8.

---

## Build

> Os builds  e gerar os artefatos (***Um arquivo ou diretório produzido por um build**. No contexto da publicação de bibliotecas, um artefato geralmente é um arquivo JAR ou AAR.*) que podem ser configurados para executar outras tarefas juntos como rodar testes unitarios.
>
> 1. **JAR (Java ARchive)**: Um arquivo JAR é um formato de arquivo que combina vários arquivos Java em um único arquivo. Ele geralmente contém classes Java compiladas, arquivos de recursos (como imagens e arquivos de propriedades) e metadados (como o manifesto). Os arquivos JAR são usados principalmente para distribuir bibliotecas e aplicativos Java autônomos.
> 2. **EAR (Enterprise ARchive)**: Um arquivo EAR é usado em desenvolvimento de aplicativos corporativos Java. Ele é um arquivo que contém todos os componentes de um aplicativo corporativo Java, incluindo arquivos JAR, arquivos WAR, arquivos de configuração e outros recursos. Os arquivos EAR são usados comumente em servidores de aplicativos Java EE (Enterprise Edition) para implantar aplicativos empresariais complexos.
> 3. **WAR (Web ARchive)**: Um arquivo WAR é usado para empacotar e implantar aplicativos da web em servidores de aplicativos Java. Ele contém todos os arquivos necessários para executar um aplicativo da web, incluindo classes Java, arquivos JSP (JavaServer Pages), arquivos HTML, arquivos CSS, arquivos JavaScript e outros recursos da web. Os arquivos WAR podem ser implantados em servidores da web Java, como Apache Tomcat ou Jetty.
> 4. **AAR (Android ARchive)**: Um arquivo AAR é um formato usado para empacotar e distribuir bibliotecas para desenvolvimento de aplicativos Android. Ele contém código Java, recursos (como layouts de interface do usuário, imagens e arquivos de configuração) e metadados específicos do Android. Os arquivos AAR são usados para compartilhar e reutilizar bibliotecas Android em vários projetos.
>
> comandos goal(Meta).
>
> O comando `mvn clean` é usado para limpar o diretório de compilação do projeto. Ele remove os arquivos gerados durante a compilação anterior, como os arquivos de classes compiladas, os arquivos JAR, os arquivos WAR, entre outros. Isso garante que você esteja iniciando uma compilação a partir de um estado limpo e evita conflitos com arquivos de compilações anteriores. O comando `clean` é frequentemente executado antes de compilar ou empacotar um projeto.
>
> O comando `mvn compile` é usado para compilar o código-fonte do projeto. Ele compila todos os arquivos Java do projeto e gera os arquivos de classe correspondentes. Esse comando também resolve e baixa automaticamente as dependências necessárias do projeto (definidas no arquivo `pom.xml`) do repositório Maven remoto.
>
> ```bash
> mvn clean
> mvn compile
> ```
>
> 

----

## Goal

> Goal (meta) no Maven é uma tarefa específica executada por um plugin durante o processo de construção e gerenciamento de projetos. Cada plugin do Maven possui um conjunto de goals que podem ser configurados no arquivo `pom.xml` do projeto. Os goals representam unidades de trabalho executadas em momentos específicos do ciclo de vida do projeto. Eles podem ser personalizados com diferentes configurações para ajustar o comportamento do plugin de acordo com as necessidades do projeto. Os goals são invocados na linha de comando do Maven, especificando o nome do plugin e o nome do goal desejado. Eles permitem estender as funcionalidades do Maven e automatizar diversas tarefas relacionadas à compilação, testes, empacotamento, implantação e muito mais.

-----

## Artefato

> Um artefato Java é um arquivo resultante da compilação de código-fonte Java, como um arquivo JAR, WAR ou EAR. Ele contém os arquivos binários e recursos necessários para executar ou implantar um aplicativo Java. Esses artefatos facilitam a distribuição e compartilhamento de projetos Java com outras equipes, ambientes de produção ou clientes.

---

## Plugin

> Um plugin Maven é um componente de software que estende ou modifica o comportamento padrão do Maven durante o processo de construção e gerenciamento de projetos. Os plugins são acionados por meio de configurações no arquivo `pom.xml` e fornecem funcionalidades adicionais, como compilação, testes, empacotamento, implantação, análise estática de código, geração de documentação, entre outros.

----

## Proxy

> Proxy para poder baixar as dependencias do maven de outras redes
> para configurar e necessario criar um arquivo *settings.xml* dentro da pasta *.m2* do maven, ou adicionar ao **pom.xml*

----

## Modules

> Antes do java-9 os modulos era configurados no maven, o modulo filho herda as dependencias do modulo pai.
>
> Os módulos são definidos no arquivo `pom.xml` do projeto pai usando a tag `<modules>`. Cada módulo é listado como um elemento `<module>` dentro dessa tag. Por exemplo:
>
> ```xml
> xmlCopy code<modules>
>     <module>subprojeto1</module>
>     <module>subprojeto2</module>
>     <module>subprojeto3</module>
> </modules>
> ```
>
> Cada módulo tem seu próprio diretório separado no sistema de arquivos e contém seu próprio arquivo `pom.xml` individual. Os módulos podem ser projetos Maven completos por si só, com sua própria estrutura de diretórios, configurações, dependências e goals.
