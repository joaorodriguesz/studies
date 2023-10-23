# Spring-notes

---

## Beans

> ​	Em Spring Framework, "beans" são objetos gerenciados pelo contêiner Spring. Eles são instâncias de classes Java configuradas no contexto do Spring. O contêiner Spring realiza a inversão de controle (IoC), gerenciando a criação e injeção de dependências dos beans. Isso simplifica o desenvolvimento, permitindo configuração externa e facilitando a manutenção. Beans podem ser definidos em arquivos de configuração XML, usando anotações ou JavaConfig.

---

## Anotacoes estereótipos

> Em Spring Framework, as anotações estereótipo são utilizadas para definir o papel ou o propósito de uma classe em uma aplicação. As anotações estereótipo mais comuns em Spring são:
>
> 1. **`@Component`:**
>
>     - **Propósito:** Marca a classe como um componente gerenciado pelo Spring.
>
>     - **Uso Típico:** É uma anotação genérica usada quando nenhuma outra anotação estereótipo mais específica se aplica.
>
>     - Exemplo:
>
>       ```java
>       @Component
>       public class MinhaClasse {
>           // código da classe
>       }
>       ```
>
> 2. **`@Service`:**
>
>     - **Propósito:** Marca a classe como um serviço na camada de negócios.
>
>     - **Uso Típico:** Utilizado para encapsular lógica de negócios.
>
>     - **Funcionalidade Adicional:** Pode ser utilizado para identificar transações (usando `@Transactional`).
>
>     - Exemplo:
>
>       ```java
>       @Service
>       public class MeuServico {
>           // código do serviço
>       }
>       ```
>
> 3. **`@Repository`:**
>
>     - **Propósito:** Marca a classe como um repositório, normalmente usado para interagir com um banco de dados ou outra fonte de dados.
>
>     - **Uso Típico:** Utilizado para acesso a dados.
>
>     - **Funcionalidade Adicional:** Permite exceções de dados específicas serem convertidas automaticamente em exceções do Spring (usando `@Repository`).
>
>     - Exemplo:
>
>       ```java
>       @Repository
>       public class MeuRepositorio {
>           // código do repositório
>       }
>       ```
>
> 4. **`@Controller`:**
>
>     - **Propósito:** Marca a classe como um controlador na camada de apresentação.
>
>     - **Uso Típico:** Utilizado em aplicações web com Spring MVC.
>
>     - **Funcionalidade Adicional:** Mapeia métodos para URLs e pode lidar com solicitações e respostas HTTP.
>
>     - Exemplo:
>
>       ```java
>       @Controller
>       public class MeuControlador {
>           // código do controlador
>       }
>       ```
>
> 5. **`@RestController`:**
>
>     - **Propósito:** Marca a classe como um controlador para serviços web RESTful.
>
>     - **Uso Típico:** Utilizado quando se deseja retornar dados diretamente no corpo da resposta HTTP.
>
>     - **Funcionalidade Adicional:** Combina as anotações `@Controller` e `@ResponseBody`.
>
>     - Exemplo:
>
>       ```java
>       @RestController
>       public class MeuControladorRest {
>           // código do controlador REST
>       }
>       ```
>
> 1. Essas anotações estereótipo ajudam o contêiner Spring a identificar as classes e a aplicar funcionalidades específicas a elas. Por exemplo, classes anotadas com `@Service` ou `@Repository` podem se beneficiar da transação automática gerenciada pelo Spring. Classes anotadas com `@Controller` podem ser reconhecidas como controladores para o Spring MVC.
>
>
> É importante notar que essas anotações são usadas principalmente para fins de configuração e identificação de componentes pelo contêiner Spring.

----

## Spring notes core

> 1. **`@Auto`:**
>    - **Propósito:** Marca a classe como um controlador na camada de apresentação.
>    - **Uso Típico:** Utilizado em aplicações web com Spring MVC.
>    - **Funcionalidade Adicional:** Mapeia métodos para URLs e pode lidar com solicitações e respostas HTTP.
