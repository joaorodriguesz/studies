



# Introdução à Banco de dados

> *https://github.com/JoaoPauloMRodrigues/Studies/blob/main/data_base/Intro_Banco_de_Dados/introducaobancoDeDados.pdf*

---

# *Notas:*

---

## MySQL 

> O MySQL é um sistema de gerenciamento de banco de dados, que utiliza a linguagem SQL como interface. É atualmente um dos sistemas de gerenciamento de bancos de dados mais populares da Oracle Corporation.

---

## Comandos :

- **DDL :** ***Linguagem de Manipulação de Dados*** 

> *É um conjunto de instruções usada nas consultas e modificações dos dados armazenados nas tabelas do banco de dados.*
>
> **Alguns Exemplos:**
>
> 1. **SELECT**  -> *Recupera linhas do banco de dados e permite a seleção de uma ou várias linhas ou colunas de uma ou várias tabelas.* 
> 2. **INSERT** -> *Instrução utilizada para inserir dados a uma ou mais tabelas no banco de dados.* 
> 3. **UPDATE** -> *Instrução utilizada para atualizar dados de uma ou mais tabelas no banco de dados.*

- **DML :** ***Linguagem de Definição de Dados***

> *É um conjunto de instruções usado para criar e modificar as estruturas dos objetos armazenados no banco de dados.*
>
> **Alguns Exemplos:**
>
> 1. **ALTER** -> *Use as instruções ALTER para modificar a definição de entidades existentes. Use ALTER TABLE para adicionar uma nova coluna a uma tabela ou use ALTER DATABASE                  para definir opções do banco de dados.*
> 2. **CREATE** -> *Use instruções CREATE para definir novas entidades. Use CREATE TABLE para adicionar uma nova tabela em um banco de dados.*
> 3. **DROP** -> *Use instruções DROP para remover entidades existentes. Use DROP TABLE para remover uma tabela de um banco de dados.*

- **DCL :**  ***Linguagem de Controle de Dados***

> *São usados para controle de acesso e gerenciamento de permissões para usuários em no banco de dados. Com eles, pode facilmente permitir ou negar algumas ações para usuários nas tabelas ou registros (segurança de nível de linha).*
>
> **Alguns Exemplos:**
>
> 1. **GRANT** -> *Atribui privilégios de acesso do usuário a objetos do banco de dados.*
> 2. **REVOKE** -> *Remove os privilégios de acesso aos objetos obtidos com o comando GRANT.*
> 3. **DENY** -> *O comando é usado para impedir explicitamente que um usuário receba uma permissão específica.*

- **TLC :** ***Linguagem de Controle de Transações***

> *São usados para gerenciar as mudanças feitas por instruções DML . Ele permite que as declarações a serem agrupadas em transações lógicas.*
>
> **Alguns Exemplos:**
>
> 1. **COMMIT** -> *É usado para salvar permanentemente qualquer transação no banco de dados.*
> 2. **ROLLBACK** -> *Este comando restaura o banco de dados para o último estado commited.*
>

---

## Data base

> ### Schema (*Diagrama*)
>
> *Um esquema de bancos de dados de um sistema de banco de dados é sua estrutura descrita em uma linguagem formal suportada pelo sistema de gerenciamento de banco de dados e refere-se à organização de dados como um diagrama de como um banco de dados é construído.*
>
> > 
> >
> > ### Tabela
> >
> > > | ↓    | ↓    | ↓    | ↓    | ↓    | ↓    |
> > > | :--- | ---- | ---- | ---- | ---- | ---- |
> > > |      |      |      |      |      |      |
> > > | →    | →    | →    | →    | →    | →    |
> > >
> > > - **↓** - **Campos** (*Os campos só podem conter itens do mesmo tipo.*)
> > > - **→** - **Registros** (*Um único item implícito de dados estruturados em uma tabela*.) 

---

## Data types (*atributos*)

*Exemplos:*

- **INT**
- **FLOAT** 
- **DATE**
- **TIME**
- **VARCHAR**

*https://dev.mysql.com/doc/refman/8.0/en/data-types.html*

---

## Primary key

> *A chave primária, ou **primary key**, é o conceito mais básico relacionado à organização em um banco de dados. Toda tabela possuirá uma, e somente uma, chave primária. Essa chave é utilizada como identificador único da tabela, sendo representada por aquele campo (ou campos) que não receberá valores repetidos.*

---

## Foreign Key

> **Chave estrangeira**, ou Foreign Key (FK), ou ainda **chave** externa é a **chave** que permite a referência a registros oriundos de outras tabelas. Ou seja, é o campo ou conjunto de campos que compõem a **chave** primária de uma outra tabela.Uma **chave estrangeira** é a representação de um relacionamento entre tabelas.

---

## View

> A **view** pode ser definida como uma tabela virtual composta por linhas **e** colunas de dados vindos de tabelas relacionadas em uma query (um agrupamento de SELECT's, por exemplo). As linhas **e** colunas da **view são** geradas dinamicamente no momento em que **é** feita uma referência a ela.

---

## Stored procedure

>  É uma coleção de comandos em SQL, que podem ser executadas em um Banco de dados de uma só vez, como em uma função.
>

---

## Trigger

> **Triggers** são eventos que você pode programar para que sejam executados antes (BEFORE) ou depois (AFTER) de fazer uma inserção (INSERT), alteração (UPDATE) ou uma remoção (DELETE) de registros de uma determinada tabela (ON TABLE nome_da_tabela).

---

## Comandos SQL 

- *https://www.w3schools.com/sql/*

---







