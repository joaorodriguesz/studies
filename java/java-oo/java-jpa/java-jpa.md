# Java-JPA

---

## Motivacao para o desenvolvimento do JPA

> Alto o acoplamento de código JDBC, e verbosidade da sua escrita.

---

## ORM

> ORM (Object-Relational Mapping) em Java é uma técnica que permite mapear objetos Java para tabelas em um banco de dados relacional, facilitando a persistência e recuperação de dados. Em vez de escrever consultas SQL manualmente, o ORM Java cuida da tradução entre os objetos Java e o esquema do banco de dados.

---

## JPA

> A especificação JPA define um conjunto de anotações e APIs que permitem aos desenvolvedores mapear objetos Java para tabelas em um banco de dados relacional de forma transparente. Ela oferece uma abordagem baseada em metadados, onde as informações de mapeamento podem ser definidas usando anotações nas classes de entidade ou por meio de arquivos de mapeamento XML.
>
> Que possui varias implementacoes como o Hibernet.

----

## Hibernet

> Hibernate é um framework ORM (Object-Relational Mapping) popular e amplamente utilizado em Java. Ele fornece uma implementação da especificação JPA (Java Persistence API) e oferece recursos avançados para mapeamento objeto-relacional, gerenciamento de transações e persistência de dados em aplicativos Java.

---

## Persistence.xml

> **META-INF > persistence.xml**
>
> ```xml
> <?xml version="1.0" encoding="UTF-8"?>
> <persistence version="2.2"
>     xmlns="http://xmlns.jcp.org/xml/ns/persistence"
>     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
>     xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd"
> >
>     <persistence-unit name="banco-test" transaction-type="RESOURCE_LOCAL || JTA">
>         
> 		    <properties>
>                 <property name="javax.persistence.jdbc.driver" value="classe do driver do DB"/>
>                 <property name="javax.persistence.jdbc.url" value="URL de conexao DB"/>
>                 <property name="javax.persistence.jdbc.user" value="user"/>
> 				<property name="javax.persistence.jdbc.password" value="password"/>
>                 <property name="hibernate.dialect" value="dialeto do DB"/>
>             </properties>
>         
> 	</persistence-unit>
>     
> </persistence>
> ```
>
> 
