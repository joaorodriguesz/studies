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

> ### Beans
>
> > 1. **`@Autowired`:**
> >    - **Propósito:** É usado para injetar automaticamente dependências em beans gerenciados pelo Spring, simplificando o gerenciamento de dependências.
> >    - **Uso Típico:** É comumente usado em classes Spring, como controladores e serviços, para injetar outras classes ou componentes, eliminando a necessidade de criar instâncias manualmente..
> >    - **Funcionalidade Adicional:** Oferece diferentes modos de injeção, suporta anotações como `@Qualifier` para controle preciso e pode ser usado em construtores, métodos "setter" e campos para injeção de dependências. Reduz a necessidade de configuração manual de dependências no Spring.
> > 2. **`@Qualifier`:**
> >    - **Propósito:** O `@Qualifier("ClassName")` é usado para especificar qual bean deve ser injetado quando há várias implementações de uma mesma interface ou classe.
> >    - **Uso Típico:** É útil quando você tem várias implementações de uma interface e deseja indicar explicitamente qual delas deve ser injetada em um determinado contexto.
> >    - **Funcionalidade Adicional:** Ajuda a resolver ambiguidades na injeção de dependências, permitindo a seleção precisa de um bean pelo nome ou valor qualificador específico. Pode ser combinado com o `@Autowired` para controlar a escolha do bean a ser injetado
> > 3. **`@Value`:**
> >    - **Propósito:** O `@Value` é usado para injetar valores de propriedades diretamente em campos de uma classe Spring gerenciada.
> >    - **Uso Típico:** É frequentemente usado para injetar configurações, valores de propriedades ou constantes em componentes Spring, como serviços, controladores e beans.
> >    - **Funcionalidade Adicional:** Permite que você injete valores diretamente de um arquivo de propriedades ou arquivo de configuração no campo de uma classe gerenciada pelo Spring. Esses valores podem ser usados em tempo de execução, tornando a configuração mais flexível e adaptável. O `@Value` é especialmente útil para injetar valores que podem variar entre ambientes, como URLs de banco de dados, senhas ou configurações específicas do ambiente.
>
> ---
>
> ### Context
>
> > 1. **`@Configuration`:**
> >    - **Propósito:** A anotação `@Configuration` é usada para marcar uma classe como uma classe de configuração no Spring, indicando que ela contém métodos para definir beans e configurações.
> >    - **Uso Típico:** É amplamente utilizado em configurações de aplicativos Spring para definir beans, configurar componentes e fornecer configurações do Spring.
> >    - **Funcionalidade Adicional:** Ao marcar uma classe com `@Configuration`, você pode definir beans gerenciados pelo Spring usando métodos anotados com `@Bean`. Essa anotação é útil para centralizar a configuração do aplicativo e permite que o Spring crie e gerencie beans com base nessas configurações. Além disso, a anotação `@Configuration` é frequentemente usada em conjunto com outras anotações, como `@ComponentScan`, para automatizar a configuração do Spring e descobrir automaticamente componentes e beans em um aplicativo.
> > 2. **`@ComponentScan`:**
> >    - **Propósito:** A anotação `@ComponentScan` é usada para configurar a varredura de componentes no Spring, permitindo que o Spring encontre automaticamente classes anotadas com `@Component` e outras anotações relacionadas.
> >    - **Uso Típico:** É comumente usado para automatizar a descoberta de componentes Spring em um aplicativo, como controladores, serviços, repositórios e outros beans gerenciados pelo Spring.
> >    - **Funcionalidade Adicional:** A anotação `@ComponentScan` permite definir um pacote base a ser usado como ponto de partida para a varredura de componentes. Ela é útil para tornar a configuração do Spring mais simples e evitar a necessidade de listar manualmente todas as classes que devem ser gerenciadas pelo Spring. Combinada com outras anotações, como `@Configuration`, ela pode ajudar a criar um sistema de configuração flexível e automatizado para aplicativos Spring.
> > 3. **`@Bean`:**
> >    - **Propósito:** A anotação `@Bean` é usada para definir métodos que produzem beans gerenciados pelo Spring. Esses métodos são chamados de "métodos de configuração" e são usados para configurar e criar instâncias de beans.
> >    - **Uso Típico:** É amplamente utilizado em classes anotadas com `@Configuration` para definir beans personalizados e configurar componentes específicos do aplicativo.
> >    - **Funcionalidade Adicional:** A anotação `@Bean` permite que você defina beans gerenciados pelo Spring de forma programática. Você pode personalizar a configuração de beans, injetando dependências ou realizando qualquer lógica necessária no método de criação do bean. Essa anotação é flexível e útil quando você precisa configurar beans que não podem ser definidos por meio de anotações de componente, como `@Service` ou `@Component`.
> > 4. **`@Lazy`:**
> >    - **Propósito:** A anotação `@Lazy` é usada para controlar o momento em que um bean é inicializado no Spring, permitindo a inicialização tardia, atrasando-a até que seja realmente necessário. Isso é útil para otimizar o desempenho, especialmente quando a inicialização de um bean é custosa em termos de recursos.
> >    - **Uso Típico:** É comumente usado em componentes Spring, como serviços ou beans, quando a inicialização deles pode ser adiada para economizar recursos durante o carregamento do contexto de aplicação.
> >    - **Funcionalidade Adicional:** Ao marcar um bean com `@Lazy`, você evita a inicialização no momento em que o contexto da aplicação é carregado. O bean só é criado e inicializado quando é efetivamente solicitado por outros componentes que dependem dele. Isso ajuda a melhorar o desempenho da inicialização da aplicação, especialmente em cenários em que a criação do bean é custosa e não é necessária até que seja solicitada.
> > 5. **`@Primary`:**
> >    - **Propósito:** A anotação `@Primary` é usada para indicar que um bean é a escolha preferencial quando há várias implementações de uma mesma interface ou classe e o Spring precisa tomar uma decisão sobre qual bean injetar por padrão.
> >    - **Uso Típico:** É comumente usado quando você tem várias implementações de um mesmo tipo (por exemplo, várias implementações de uma interface) e deseja especificar qual delas deve ser escolhida por padrão quando uma dependência desse tipo é injetada.
> >    - **Funcionalidade Adicional:** Ao marcar um bean com `@Primary`, você sinaliza ao Spring que esse bean deve ser a escolha preferencial quando houver ambiguidade na resolução de dependências. Isso é útil para indicar explicitamente qual implementação deve ser usada por padrão, facilitando a configuração quando há várias opções disponíveis. O `@Primary` pode ser usado em conjunto com outras anotações, como `@Autowired`, para garantir a escolha do bean preferencial
> > 6. **`@Scope`:**
> >    - **Propósito:** A anotação `@Scope` é usada para definir o escopo de um bean no Spring, ou seja, determinar a vida útil desse bean e quando ele deve ser criado ou destruído.
> >    - **Uso Típico:** É comumente usado para controlar a vida útil de um bean, indicando se ele deve ser um bean de escopo singleton (o padrão) ou de outro escopo, como protótipo, sessão, solicitação, entre outros.
> >    - **Funcionalidade Adicional:** A anotação `@Scope` permite que você defina o escopo de um bean de forma personalizada, afetando como ele será gerenciado pelo container Spring. Você pode escolher entre vários escopos predefinidos ou criar seus próprios escopos personalizados, dependendo das necessidades do seu aplicativo. Isso é particularmente útil para controlar a criação e destruição de beans de acordo com o ciclo de vida da aplicação, melhorando o desempenho e a eficiência do uso de recursos.
> > 7. **`@PropertySource`:**
> >    - **Propósito:** A anotação `@PropertySource` é usada para especificar a localização de arquivos de propriedades externos que contêm configurações para um aplicativo Spring.
> >    - **Uso Típico:** É comumente usado para carregar propriedades de configuração de um arquivo externo, como um arquivo `.properties`, para injetar valores de configuração em beans gerenciados pelo Spring.
> >    - **Funcionalidade Adicional:** A anotação `@PropertySource` permite que você importe propriedades de configuração de arquivos externos no ambiente de configuração do Spring. Isso é útil para manter as configurações do aplicativo fora do código-fonte e facilitar a personalização da configuração para diferentes ambientes (desenvolvimento, teste, produção, etc.). Além disso, os valores das propriedades podem ser injetados em beans usando a anotação `@Value` ou resolvidos programaticamente. Essa anotação é uma parte essencial do mecanismo de gerenciamento de configuração do Spring.
> > 8. **`@PropertySources`:**
> >    - **Propósito:** A anotação `@PropertySources` é usada para especificar várias localizações de arquivos de propriedades externos que contêm configurações para um aplicativo Spring.
> >    - **Uso Típico:** É comumente usado para carregar múltiplos arquivos de propriedades externos, como arquivos `.properties`, a partir de diferentes fontes, combinando várias configurações em um ambiente Spring.
> >    - **Funcionalidade Adicional:** A anotação `@PropertySources` permite que você importe propriedades de configuração de vários arquivos externos em seu ambiente de configuração do Spring. Isso é útil para gerenciar diferentes conjuntos de propriedades de configuração para diferentes partes de um aplicativo. Pode ser útil para manter a configuração fora do código-fonte e facilitar a personalização da configuração para diferentes ambientes ou módulos do aplicativo. Com esta anotação, você pode combinar configurações de várias fontes e usar as propriedades configuradas nos beans gerenciados pelo Spring. A anotação `@PropertySources` é particularmente útil em cenários complexos de configuração de aplicativos.
> > 9. **`@Profile`:**
> >    - **Propósito:** A anotação `@Profile` é usada para definir perfis de aplicativos no Spring, permitindo a ativação condicional de componentes com base em perfis específicos.
> >    - **Uso Típico:** É comumente usado para criar configurações específicas para diferentes ambientes, como desenvolvimento, teste e produção, e para ativar ou desativar componentes com base nos perfis ativos.
> >    - **Funcionalidade Adicional:** A anotação `@Profile` permite que você crie configurações específicas de perfil e ative ou desative componentes de acordo com o perfil de aplicativo atual. Isso é útil para isolar configurações de ambiente e separar a configuração de desenvolvimento da configuração de produção. Você pode especificar perfis ativos usando a propriedade `spring.profiles.active` em seu aplicativo ou configurando o ambiente em tempo de execução. Isso facilita a criação de configurações específicas de perfil e a flexibilidade para alternar entre diferentes perfis de aplicativos sem modificar o código. O uso de perfis é uma parte importante da estratégia de gerenciamento de configuração do Spring.
>
> ----
>
> ### Boot
>
> > 1. **`@SpringBootApplication`:**
> >    - **Propósito:** A anotação `@SpringBootApplication` é usada para marcar uma classe principal em um aplicativo Spring Boot. Essa anotação combina várias outras anotações comumente usadas e é usada como ponto de entrada para iniciar um aplicativo Spring Boot.
> >    - **Uso Típico:** É amplamente usado em classes que contêm o método `main` para iniciar um aplicativo Spring Boot. Esta anotação é comumente usada em aplicações Spring Boot para configurar automaticamente o aplicativo e definir a configuração padrão.
> >    - **Funcionalidade Adicional:** A anotação `@SpringBootApplication` combina várias anotações, incluindo `@Configuration`, `@EnableAutoConfiguration`, e `@ComponentScan`, para automatizar a configuração de um aplicativo Spring Boot. Ela fornece um ponto de entrada conveniente para iniciar o aplicativo e iniciar o servidor embutido. Além disso, essa anotação pode aceitar argumentos que especificam a classe de configuração primária ou os perfis ativos. O uso da anotação `@SpringBootApplication` simplifica a inicialização de aplicativos Spring Boot e fornece configuração automática, permitindo que você comece a construir aplicativos rapidamente.
> > 2. **`@EnableAutoConfiguration`:**
> >    - **Propósito:** A anotação `@EnableAutoConfiguration` é usada para ativar a configuração automática no Spring Boot. Ela permite que o Spring Boot configure automaticamente componentes e bibliotecas com base nas dependências e no ambiente de execução do aplicativo.
> >    - **Uso Típico:** É amplamente usado em classes de configuração do Spring Boot para habilitar a configuração automática. Geralmente, é usado em conjunto com a anotação `@SpringBootApplication` para simplificar o processo de inicialização de aplicativos Spring Boot.
> >    - **Funcionalidade Adicional:** A anotação `@EnableAutoConfiguration` é parte integrante da filosofia de "opinião sobre configuração" do Spring Boot. Ela analisa as dependências do aplicativo e configura automaticamente o ambiente de acordo com as bibliotecas presentes. Isso reduz a necessidade de configuração manual e permite que o Spring Boot funcione com configurações sensíveis ao ambiente, tornando-o uma estrutura eficiente e fácil de usar para o desenvolvimento de aplicativos. Com a configuração automática, você pode se concentrar mais na lógica do aplicativo em vez de gastar tempo configurando detalhes de infraestrutura.
> > 3. **`@ConfigurationProperties`:**
> >    - **Propósito:** A anotação `@ConfigurationProperties` é usada para mapear propriedades de configuração em um objeto Java, permitindo que você configure facilmente propriedades de aplicativos Spring a partir de arquivos de propriedades ou de outras fontes.
> >    - **Uso Típico:** É amplamente usado em classes que representam objetos de configuração, onde as propriedades são mapeadas de arquivos de configuração externos. Essa anotação é comumente usada em aplicativos Spring para simplificar a injeção de propriedades de configuração.
> >    - **Funcionalidade Adicional:** A anotação `@ConfigurationProperties` permite que você mapeie valores de propriedades de configuração para um objeto Java. Isso é particularmente útil quando você deseja centralizar e organizar as configurações de aplicativos em um único local. Com essa anotação, você pode criar classes de configuração personalizadas e injetar essas configurações em outros componentes do Spring de forma simples. Além disso, a validação das configurações é suportada, garantindo que os valores configurados estejam corretos e cumpram os requisitos do aplicativo. O uso de `@ConfigurationProperties` torna a configuração de aplicativos mais legível, gerenciável e flexível.
>
> ----
>
> ### Web
>
> > 1. **`@RestController`:**
> >    - **Propósito:** A anotação `@RestController` é usada em classes no Spring para indicar que elas são controladores de API REST. Essa anotação combina a funcionalidade de `@Controller` e `@ResponseBody`, permitindo que você construa APIs RESTful de maneira simples e direta.
> >    - **Uso Típico:** É comumente usada em classes que precisam lidar com requisições HTTP e retornar dados no formato JSON ou XML. Os métodos dessas classes respondem a requisições da API REST com representações de recursos, geralmente usando os verbos HTTP, como GET, POST, PUT, DELETE, entre outros.
> >    - **Funcionalidade Adicional:** A anotação `@RestController` simplifica a criação de controladores de API REST no Spring. Ela combina automaticamente a anotação `@Controller`, que define uma classe como um controlador Spring, com a anotação `@ResponseBody`, que indica que os métodos do controlador devem retornar diretamente dados que serão serializados em JSON ou XML. Isso permite que você crie APIs RESTful de maneira simples, sem a necessidade de anotar cada método com `@ResponseBody`. Além disso, o `@RestController` também facilita o tratamento de exceções específicas da API, como respostas HTTP com códigos de erro adequados. Em resumo, essa anotação é fundamental para a construção de APIs REST no ecossistema Spring.
> > 2. **`@RequestMapping`:**
> >    - **Propósito:** A anotação `@RequestMapping` é usada para mapear solicitações HTTP para métodos de controlador em um aplicativo Spring. Ela define a associação entre um URI (Uniform Resource Identifier) e um método específico, permitindo o tratamento de solicitações HTTP.
> >    - **Uso Típico:** É amplamente usado em classes de controlador para especificar quais métodos devem ser invocados para lidar com solicitações HTTP específicas, como GET, POST, PUT, DELETE, etc.
> >    - **Funcionalidade Adicional:** A anotação `@RequestMapping` fornece flexibilidade para mapear métodos de controlador para diferentes URIs e métodos HTTP. Você pode especificar caminhos de URI, métodos HTTP aceitáveis, parâmetros, cabeçalhos e outros critérios de correspondência. Além disso, você pode definir templates de URI usando variáveis e expressões regulares, tornando a roteamento de solicitações altamente configurável. O uso dessa anotação é fundamental para criar aplicativos web dinâmicos com o Spring MVC, permitindo o tratamento eficaz de solicitações HTTP.
> > 3. **`@GetMapping`:**
> >    - **Propósito:** A anotação `@GetMapping` é usada para mapear solicitações HTTP do tipo GET para métodos de controlador em um aplicativo Spring. Ela especifica que o método deve ser invocado somente quando uma solicitação GET é recebida.
> >    - **Uso Típico:** É amplamente usado em classes de controlador para lidar com operações de leitura ou recuperação de recursos, retornando informações para o cliente.
> >    - **Funcionalidade Adicional:** A anotação `@GetMapping` é usada para criar endpoints de API RESTful que respondem a solicitações de leitura. Ela permite que você defina caminhos de URI, parâmetros, cabeçalhos e outros critérios de correspondência, da mesma forma que `@RequestMapping`.
> > 4. **`@PostMapping`:**
> >    - **Propósito:** A anotação `@PostMapping` é usada para mapear solicitações HTTP do tipo POST para métodos de controlador em um aplicativo Spring. Ela especifica que o método deve ser invocado somente quando uma solicitação POST é recebida.
> >    - **Uso Típico:** É amplamente usado em classes de controlador para lidar com operações que modificam dados no servidor, como criação, atualização ou exclusão de recursos.
> >    - **Funcionalidade Adicional:** A anotação `@PostMapping` é usada para criar endpoints de API RESTful que respondem a solicitações de criação ou modificação de recursos. Assim como `@GetMapping`, ela permite a definição de caminhos de URI e outros critérios de correspondência.
> > 5. **`@PutMapping`:**
> >    - **Propósito:** A anotação `@PutMapping` é usada para mapear solicitações HTTP do tipo PUT para métodos de controlador em um aplicativo Spring. Ela especifica que o método deve ser invocado somente quando uma solicitação PUT é recebida.
> >    - **Uso Típico:** É amplamente usado em classes de controlador para lidar com operações de atualização de recursos existentes no servidor.
> >    - **Funcionalidade Adicional:** A anotação `@PutMapping` é usada para criar endpoints de API RESTful que respondem a solicitações de atualização de recursos. Ela permite que você defina caminhos de URI e outros critérios de correspondência, da mesma forma que `@GetMapping` e `@PostMapping`.
> > 6. **`@DeleteMapping`:**
> >    - **Propósito:** A anotação `@DeleteMapping` é usada para mapear solicitações HTTP do tipo DELETE para métodos de controlador em um aplicativo Spring. Ela especifica que o método deve ser invocado somente quando uma solicitação DELETE é recebida.
> >    - **Uso Típico:** É amplamente usado em classes de controlador para lidar com operações de exclusão de recursos no servidor.
> >    - **Funcionalidade Adicional:** A anotação `@DeleteMapping` é usada para criar endpoints de API RESTful que respondem a solicitações de exclusão de recursos. Ela permite a definição de caminhos de URI e outros critérios de correspondência, da mesma forma que as outras anotações de mapeamento.
> > 7. **`@RequestBody`:**
> >    - **Propósito:** A anotação `@RequestBody` é usada em um método de controlador Spring para indicar que o corpo da solicitação HTTP deve ser convertido em um objeto Java.
> >    - **Uso Típico:** É amplamente usado em métodos de controlador que esperam receber dados no corpo da solicitação, como JSON ou XML, e desejam converter esses dados em objetos Java.
> >    - **Funcionalidade Adicional:** A anotação `@RequestBody` permite que o Spring converta automaticamente o corpo da solicitação em um objeto Java correspondente. Isso é útil para processar dados enviados pelo cliente em solicitações POST ou PUT. Além disso, você pode usar outras anotações, como `@PathVariable` ou `@RequestParam`, para acessar parâmetros da solicitação além do corpo. O `@RequestBody` é fundamental para o desenvolvimento de APIs RESTful, onde os dados são frequentemente transmitidos no corpo da solicitação.
> > 8. **`@PathVariable`:**
> >    - **Propósito:** A anotação `@PathVariable` é usada em métodos de controlador Spring para mapear partes de um URI (Uniform Resource Identifier) à variáveis do método.
> >    - **Uso Típico:** É amplamente usado em métodos de controlador para extrair valores de variáveis da URL em uma solicitação HTTP, permitindo que você acesse parâmetros de caminho dinâmicos.
> >    - **Funcionalidade Adicional:** A anotação `@PathVariable` permite que você capture partes variáveis de uma URL e as use como parâmetros em um método de controlador. Isso é útil para rotear solicitações com URIs dinâmicas, como em uma API REST, onde os valores na URL podem variar. Essa anotação ajuda a tornar seu código do controlador flexível e capaz de lidar com diferentes cenários de URL. Além disso, você pode especificar valores padrão, expressões regulares e outras opções para o `@PathVariable` para maior controle sobre o mapeamento de URI para parâmetros do método.
> > 9. **`@RequestParam`:**
> >    - **Propósito:** A anotação `@RequestParam` é usada em métodos de controlador Spring para mapear parâmetros da solicitação HTTP a parâmetros do método.
> >    - **Uso Típico:** É amplamente usado em métodos de controlador para acessar e extrair parâmetros passados na URL ou no corpo de uma solicitação HTTP.
> >    - **Funcionalidade Adicional:** A anotação `@RequestParam` permite que você acesse parâmetros da solicitação HTTP, como consultas na URL ou dados de formulário em uma solicitação POST. Isso é útil para obter informações fornecidas pelo cliente, como valores de consulta, campos de formulário ou cabeçalhos. Você pode especificar valores padrão, parâmetros obrigatórios, valores permitidos e outras opções para o `@RequestParam` para controlar o comportamento da extração de parâmetros. Essa anotação é fundamental para a manipulação de dados de solicitação em métodos de controlador Spring.
> > 10. **`@CrossOrigin`:**
> >     - **Propósito:** A anotação `@CrossOrigin` é usada para configurar e permitir solicitações de origens cruzadas (CORS) em controladores Spring. Ela permite que você especifique quais origens podem acessar recursos do seu servidor.
> >     - **Uso Típico:** É amplamente usado em controladores Spring que servem APIs RESTful para permitir que aplicativos web em domínios diferentes acessem recursos no servidor.
> >     - **Funcionalidade Adicional:** A anotação `@CrossOrigin` permite configurar regras de política de segurança para permitir ou bloquear solicitações de diferentes origens. Você pode especificar origens permitidas, métodos HTTP permitidos, cabeçalhos permitidos e outros parâmetros de configuração. Isso é útil para lidar com questões de segurança relacionadas a solicitações de origens cruzadas, que são comuns ao desenvolver aplicativos web modernos. O uso de `@CrossOrigin` ajuda a controlar e autorizar o acesso a recursos do servidor a partir de diferentes domínios.

