# Design Patterns

---

## Tipos:

- Creational (Criacional)
- Structural (Estrutural)
- Behavioral (Comportamental)
- Others

---

## Factory Method (Virtual Constructor)

> O **Factory Method** é um padrão de projeto de criação que fornece uma interface para criar objetos, permitindo que as subclasses decidam qual classe instanciar. Ele delega a lógica de criação para subclasses, tornando o código mais flexível e aberto a mudanças. Em resumo, o Factory Method cria objetos sem especificar diretamente suas classes concretas, promovendo encapsulamento e reutilização.

### Vantagens

> ##### 1. **Desacoplamento**
>
> - *O Factory Method separa a lógica de criação de objetos da lógica de uso desses objetos. Isso torna o código mais limpo e fácil de manter.*
>
> ##### 2. **Flexibilidade**
>
> - *Permite criar objetos diferentes (de diferentes classes ou tipos) sem alterar o código que os consome.*
> - *Facilita a introdução de novos tipos de objetos, bastando adicionar uma nova classe e modificar a fábrica.*
>
> ##### 3. **Reutilização**
>
> - *A lógica de criação pode ser complexa, e centralizá-la em uma fábrica evita duplicação de código.*
>
> ##### 4. **Abstração**
>
> - *Oculta os detalhes da criação do objeto. O cliente só precisa saber como usar o método da fábrica, sem se preocupar com os detalhes internos.*
>
> ##### 5. **Facilidade de Testes**
>
> - *Como a lógica de criação está isolada, é mais fácil criar objetos "mock" ou diferentes cenários para testes.*
>
> ##### 6. **Manutenção Simplificada**
>
> - *Alterações no processo de criação afetam apenas o código da fábrica, não o código de toda a aplicação.*

### Static Factory Methods (Forma simples)

> ```java
> public class MessageFactory {
>     public static String createMessage(String type) {
>         return type.equals("email") ? "Email message" : "SMS message";
>     }
> }
> 
> public class Main {
>     public static void main(String[] args) {
>         System.out.println(MessageFactory.createMessage("email"));
>     }
> }
> ```
>
> 

### Formato 2

> ```java
> public class FactoryMethod_2 {
> 
>   // Criador Concreto
>   // Produto Abstrato
>   // Produto Concreto  
> 	
> 	@SuppressWarnings("unused")
> 	public static void main(String[] args) {
> 		Categoria2 categoria2 = new Categoria2();
> 		Produto2 produto2 = categoria2.novoProduto();
> 	}
> 
> }
> 
> interface Produto2 {
> }
> 
> class ProdutoDigital2 implements Produto2 {
> }
> 
> class ProdutoFisico2 implements Produto2 {
> }
> 
> class Categoria2 {
>   
> //  private String nome;
> //  private Tipo tipo;
> //  private Integer prioridade;
>   
> 	public Produto2 novoProduto() {
> 	  // ...
> 		return new ProdutoFisico2();
> 	}
> }
> 
> class CategoriaDigital extends Categoria2 {
>   public Produto2 novoProduto() {
>     // ...
>     return new ProdutoDigital2();
>   }
> }
> 
> ```

### Formato 3

> ```java
> public class FactoryMethod_3 {
> 
>   // Produto -> ProdutoFactory
>   // ProcessadorPagamento -> ProcessadorPagamentoFactory 
>   
>   // Criador concreto com parâmetro
>   // Produto Abstrato
>   // Produto concreto
> 
>   @SuppressWarnings("unused")
>   public static void main(String[] args) {
>     Categoria3 categoria3 = new Categoria3();
>     Produto3 produto3 = categoria3.novoProduto(1);
>   }
> 
> }
> 
> interface Produto3 {
> }
> 
> class ProdutoPadrao3 implements Produto3 {
> }
> 
> class ProdutoDigital3 extends ProdutoPadrao3 {
> }
> 
> class ProdutoFisico3 extends ProdutoPadrao3 {
> }
> 
> class Categoria3 {
> //  private String nome;
> //  private Integer prioridade;
>   
>   // ...
>   
>   public Produto3 novoProduto(int tipoProduto) {
>     switch (tipoProduto) {
>     case 1:
>       return new ProdutoPadrao3();
>     case 2:
>       return new ProdutoDigital3();
>     case 3:
>       return new ProdutoFisico3();
>     default:
>       throw new IllegalArgumentException();
>     }
>   }
> }
> ```
>
> 

### Formato 1 (Padrao)

> ```java
> public class FactoryMethod_1 {
> 
> 	// Criador Abstrato
> 	// Produto Abstrato
> 	// Criador Concreto
> 	// Produto Concreto
> 	
> 	@SuppressWarnings("unused")
> 	public static void main(String[] args) {
> 		Categoria categoria = new Digital();
> 		Produto produto = categoria.novoProduto();
> 	}
> 
> }
> 
> interface Produto {
> }
> 
> class ProdutoDigital implements Produto {
> }
> 
> class ProdutoFisico implements Produto {
> }
> 
> interface Categoria {
> 	Produto novoProduto();
> }
> 
> class Digital implements Categoria {
> 	@Override
> 	public Produto novoProduto() {
> 	  // ...
> 		return new ProdutoDigital();
> 	}
> }
> 
> class Fisico implements Categoria {
> 	@Override
> 	public Produto novoProduto() {
>     // ...	  
> 		return new ProdutoFisico();
> 	}
> }
> ```
>
> 
