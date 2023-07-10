# JDBC (Java DataBase Conectivity)

---

> JDBC define uma camada de abstração entre a sua aplicação e o driver do banco de dados
Essa camada possui, na sua grande maioria, interfaces que o driver implementa

----

## JDBC & Driver (java.sql)

> App Java <--> JDBC <--> Driver SQL <--> DB

---

## Conexão

> ```java
> // Configuração da conexão com o banco de dados
> String url = "jdbc:mysql://localhost:3306/meubanco";
> String usuario = "root";
> String senha = "minhasenha";
> Connection conexao = DriverManager.getConnection(url, usuario, senha);
> 
> // Verificação de sucesso da conexão
> if (conexao != null) {
>     System.out.println("Conexão estabelecida com sucesso!");
> } else {
>     System.out.println("Não foi possível estabelecer a conexão.");
> }
> 
> // Fechamento da conexão
> conexao.close();
> ```
>
> 

---

## Statement

> Um statement é uma instrução executável que informa ao compilador o que executar, no nosso caso uma instrução SQL.
>
> ```java
> Statement statement = conexao.createStatement();
> String consulta = "SELECT nome, idade FROM clientes";
> ResultSet resultado = statement.executeQuery(consulta);
> ```
>
> 

---

## PreparedStatement
> é um Statemnet, porém a agora quem irá tratar os parametors é o prório JDBC, evitando assim um SQL injection. Ele também mantém a consulta compilada no banco de dados, para o usuário que necessitar realizar a mesma consulta, diversas vezes, com parâmetros diferentes.
>
> ```java
> // Criação do PreparedStatement para a inserção de dados
> String insercao = "INSERT INTO clientes (nome, idade) VALUES (?, ?)";
> PreparedStatement preparedStatement = conexao.prepareStatement(insercao);
> 
> // Definição dos valores dos parâmetros do PreparedStatement
> String nome = "João";
> int idade = 30;
> preparedStatement.setString(1, nome);
> preparedStatement.setInt(2, idade);
> 
> // Execução da inserção dos dados
> int linhasAfetadas = preparedStatement.executeUpdate();
> ```

----

## Controle de transação

> Assumindo o controle das transacoes
>
> ```java
> connection.setAutoComit(false);
> ```
>
> ---
>
> Podendo assim explicitar o commit e o rollback das transacoes
>
> ```java
> connection.commit()
> connection.rollback();
> ```

---

## PoolConection

>  *é uma técnica de gerenciamento de conexões de banco de dados, em que um pool (ou grupo) de conexões de banco de dados é criado e mantido, e as conexões são reutilizadas por diferentes solicitações de banco de dados.*
>
>  **DataSource**
>
>  *`DataSource` é uma interface Java que fornece uma maneira de obter conexões com um banco de dados. É uma maneira padrão de obter e gerenciar conexões de banco de dados em aplicativos Java. A interface `DataSource` faz parte do pacote `javax.sql`.*
>
>  *A interface `DataSource` tem três métodos principais:*
>
>  - *`getConnection()`: retorna uma conexão com o banco de dados.*
>  - *`getConnection(String username, String password)`: retorna uma conexão com o banco de dados usando as credenciais de usuário e senha especificadas.*
>  - *`setLoginTimeout(int seconds)`: define o tempo máximo de espera em segundos para obter uma conexão do pool.*
>
>  *As implementações de `DataSource` geralmente são fornecidas por drivers de banco de dados específicos. Por exemplo, o driver do MySQL fornece a classe `com.mysql.jdbc.jdbc2.optional.MysqlDataSource` como uma implementação de `DataSource` para o MySQL. Além disso, existem frameworks como o C3P0 e o HikariCP que fornecem implementações de `DataSource` que incluem recursos adicionais, como pool de conexões e balanceamento de carga.*
>
>  ----
>
>  *O objetivo do pool de conexões é reduzir o tempo de conexão ao banco de dados e evitar a criação e destruição excessivas de conexões, o que pode ser caro em termos de desempenho e recursos.*
>
>  exemplo simples de ConnectionFactory com pool de conexões em Java utilizando a biblioteca c3p0:
>
>  ```java
>  public class ConnectionFactory {
>  
>  private static ConnectionFactory instance = new ConnectionFactory();
>  private ComboPooledDataSource dataSource;
>  
>  private ConnectionFactory() {
>   try {
>     // Criar e configurar o pool de conexões
>     dataSource = new ComboPooledDataSource();
>     dataSource.setDriverClass("com.mysql.jdbc.Driver");
>     dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mydatabase");
>     dataSource.setUser("myusername");
>     dataSource.setPassword("mypassword");
>     dataSource.setMinPoolSize(5);
>     dataSource.setMaxPoolSize(10);
>     dataSource.setAcquireIncrement(1);
>     dataSource.setMaxStatements(100);
>   } catch (Exception e) {
>     throw new RuntimeException("Erro ao configurar o pool de conexões", e);
>   }
>  }
>  
>  public static ConnectionFactory getInstance() {
>   return instance;
>  }
>  
>  public Connection getConnection() {
>   try {
>     // Obter uma conexão do pool de conexões
>     return dataSource.getConnection();
>   } catch (SQLException e) {
>     throw new RuntimeException("Erro ao obter uma conexão do pool", e);
>   }
>  }
>  ```
>
>  

---

## DAO

>  *DAO (Data Access Object) é um padrão que fornece uma abstração de camada de acesso a dados, separando a lógica de negócios da implementação de acesso a dados. Em outras palavras, o DAO fornece uma interface para acessar dados, independentemente de como esses dados são armazenados. O DAO geralmente contém métodos para criar, recuperar, atualizar e excluir objetos de dados.*
>
> **Modelo**
>
> ```java
> public class User {
>     private Long id;
>     private String name;
>     private String email;
> 
>     // construtor, getters e setters omitidos para brevidade
> }
> 
> ```
>
> **Interface DAO**
>
> ```java
> public interface UserDao {
>     void save(User user);
>     void update(User user);
>     void delete(User user);
>     User getById(Long id);
>     List<User> getAll();
> }
> 
> ```
>
> **DAO**
>
> ```java
> public class UserDaoImpl implements UserDao {
>     // Aqui teríamos as dependências para acesso aos dados, como EntityManager, JdbcTemplate, etc.
> 
>     @Override
>     public void save(User user) {
>         // Implementação para salvar o usuário no banco de dados
>     }
> 
>     @Override
>     public void update(User user) {
>         // Implementação para atualizar o usuário no banco de dados
>     }
> 
>     @Override
>     public void delete(User user) {
>         // Implementação para excluir o usuário do banco de dados
>     }
> 
>     @Override
>     public User getById(Long id) {
>         // Implementação para obter um usuário pelo seu ID no banco de dados
>         return null;
>     }
> 
>     @Override
>     public List<User> getAll() {
>         // Implementação para obter todos os usuários do banco de dados
>         return null;
>     }
> }
> 
> ```
>

----

