# java-collections
----

![](https://raw.githubusercontent.com/joaorodriguesz/estudos/main/java/java-oo/java-collections/imgs/java-colecoes-diagrama.jpeg)

---

### As colecoes do java pode ser:

- Sorted
- Ordered

----

## List

> ### **ArrayList:** 
>
> *fornece uma implementação de um array dinâmico. Isso significa que o ArrayList é capaz de aumentar e diminuir automaticamente de tamanho à medida que elementos são adicionados ou removidos. e mantem a ordem de insercao*
>
> *Ao contrário de um array comum, um ArrayList não é limitado por um tamanho fixo. Isso significa que um ArrayList pode crescer ou diminuir em tamanho conforme necessário, sem exigir que o programador reserve espaço na memória ou crie um novo array.*
>
> ```java
> ArrayList<String> lista = new ArrayList<String>();
> 
> // Adiciona um elemento ao ArrayList
> lista.add("foo");
> 
> // Remove o primeiro elemento do ArrayList
> lista.remove(0);
> 
> // Acessa o terceiro elemento do ArrayList
> String elemento = lista.get(2);
> 
> // Altera o quarto elemento do ArrayList
> lista.set(3, "bar");
> 
> ```
>
> ----
>
> ### LinkedList
>
> *fornece uma implementação de uma lista duplamente encadeada. Isso significa que um LinkedList é uma coleção de elementos onde cada elemento é representado por um objeto Node que contém referências para o próximo e o anterior elementos na lista.*
>
> *Ao contrário de um ArrayList, um LinkedList é otimizado para inserção e remoção de elementos em qualquer posição da lista, uma vez que não requer realocação de elementos na memória quando um elemento é adicionado ou removido.*
>
> ```java
> ArrayList<String> lista = new ArrayList<String>();
> 
> // Adiciona um elemento ao ArrayList
> lista.add("foo");
> 
> // Remove o primeiro elemento do ArrayList
> lista.remove(0);
> 
> // Acessa o terceiro elemento do ArrayList
> String elemento = lista.get(2);
> 
> // Altera o quarto elemento do ArrayList
> lista.set(3, "bar");
> ```
>
> ----
>
> ### Vector
>
> *fornece uma implementação de um array dinâmico que é sincronizado (thread-safe). Isso significa que a classe Vector é projetada para suportar operações concorrentes e, portanto, é uma opção útil em situações onde há vários threads acessando a mesma lista.*
>
> *Ao contrário de um ArrayList, um Vector é sincronizado, o que significa que apenas um thread pode acessar a lista de cada vez. Isso é útil em situações onde a segurança é uma preocupação e várias threads estão acessando e modificando a mesma lista.*
>
> ```java
> Vector<String> lista = new Vector<String>();
> 
> // Adiciona um elemento ao Vector
> lista.add("foo");
> 
> // Remove o primeiro elemento do Vector
> lista.remove(0);
> 
> // Acessa o terceiro elemento do Vector
> String elemento = lista.get(2);
> 
> // Altera o quarto elemento do Vector
> lista.set(3, "bar");
> 
> ```
>
> *Além disso, a classe Vector também fornece métodos para manipular a capacidade do array subjacente, como ensureCapacity() e trimToSize().*
>
> ---
>
> ### Stack
>
> *é uma coleção de elementos organizados em uma estrutura de dados LIFO (last-in, first-out), ou seja, o último elemento adicionado é o primeiro a ser removido. A classe Stack é uma subclasse de Vector, o que significa que herda todos os métodos e propriedades de um Vector.*
>
> *Para utilizar uma pilha em Java, é necessário criar um objeto Stack e especificar o tipo de dados que será armazenado. Por exemplo, o seguinte código cria uma pilha que armazena objetos String.
>
> ```java
> Stack<String> pilha = new Stack<String>();
> 
> // Adiciona um elemento à pilha
> pilha.push("foo");
> 
> // Remove o elemento no topo da pilha
> String elemento = pilha.pop();
> ```

----

## Queue

> ### PriorityQueue
>
> *é uma coleção de elementos organizados em uma ordem baseada em prioridades. Os elementos na fila são ordenados de acordo com uma ordem natural (definida pela classe dos elementos) ou por uma ordem definida pelo usuário, usando um Comparator. A classe PriorityQueue é baseada em um heap binário e fornece uma implementação eficiente de uma fila de prioridade.*
>
> *Para utilizar uma fila de prioridade em Java, é necessário criar um objeto PriorityQueue e especificar o tipo de dados que será armazenado. Por exemplo, o seguinte código cria uma fila de prioridade que armazena objetos Integer.
>
> ```java
> PriorityQueue<Integer> fila = new PriorityQueue<Integer>();
> 
> // Adiciona elementos à fila de prioridade
> fila.add(10);
> fila.add(5);
> fila.add(15);
> 
> // Remove o elemento com a maior prioridade da fila
> int elemento = fila.poll();
> 
> ```
>
> *Além disso, a classe PriorityQueue em Java fornece outros métodos úteis, como peek() para acessar o elemento com a maior prioridade na fila sem removê-lo, e size() para obter o número de elementos na fila.*
>
> ----

## Deque

> ### arrayDeque 
>
> *implementa uma fila dupla (deque), que é uma coleção de elementos organizados em uma estrutura de dados linear que permite a inserção e remoção de elementos em ambos os extremos da fila. A classe ArrayDeque é implementada usando um array dinâmico e fornece uma implementação eficiente de uma fila dupla.*
>
> *Para utilizar uma fila dupla em Java, é necessário criar um objeto ArrayDeque e especificar o tipo de dados que será armazenado. Por exemplo, o seguinte código cria uma fila dupla que armazena objetos String.*
>
> ```java
> ArrayDeque<String> deque = new ArrayDeque<String>();
> 
> // Adiciona elementos à fila dupla
> deque.addFirst("foo");
> deque.addLast("bar");
> 
> // Remove o primeiro elemento da fila dupla
> String primeiroElemento = deque.removeFirst();
> 
> ```
>
> *Além disso, a classe ArrayDeque em Java fornece métodos para acessar o primeiro e o último elemento na fila dupla sem removê-los (métodos peekFirst() e peekLast()), e para obter o número de elementos na fila dupla (método size()).*

---

## Set

> ### HashSet
>
> *é uma coleção de elementos únicos sem uma ordem específica. A classe HashSet é implementada usando uma tabela hash e fornece uma implementação eficiente de um conjunto.*
>
> *Para utilizar um conjunto em Java, é necessário criar um objeto HashSet e especificar o tipo de dados que será armazenado. Por exemplo, o seguinte código cria um conjunto que armazena objetos String:*
>
> ```java
> HashSet<String> conjunto = new HashSet<String>();
> 
> // Adiciona elementos ao conjunto
> conjunto.add("foo");
> conjunto.add("bar");
> 
> // Remove um elemento do conjunto
> conjunto.remove("bar");
> 
> ```
>
> *Além disso, a classe HashSet em Java fornece outros métodos úteis, como contains() para verificar se um elemento está presente no conjunto, e size() para obter o número de elementos no conjunto.*
>
> ---
>
> ### LiknedHashSet
>
> *mplementa um conjunto com uma ordem de inserção garantida. A classe LinkedHashSet é implementada usando uma tabela hash e uma lista duplamente ligada, e fornece uma implementação eficiente de um conjunto com uma ordem de inserção garantida.*
>
> *Para utilizar um conjunto LinkedHashSet em Java, é necessário criar um objeto LinkedHashSet e especificar o tipo de dados que será armazenado. Por exemplo, o seguinte código cria um conjunto LinkedHashSet que armazena objetos String:*
>
> ```java
> LinkedHashSet<String> conjunto = new LinkedHashSet<String>();
> 
> // Adiciona elementos ao conjunto
> conjunto.add("foo");
> conjunto.add("bar");
> 
> // Remove um elemento do conjunto
> conjunto.remove("bar");
> 
> ```
>
> *Além disso, a classe LinkedHashSet em Java fornece outros métodos úteis, como contains() para verificar se um elemento está presente no conjunto, e size() para obter o número de elementos no conjunto.*
>
> *A principal diferença entre a classe HashSet e a classe LinkedHashSet é que a classe LinkedHashSet mantém a ordem de inserção dos elementos no conjunto, enquanto a ordem dos elementos em um conjunto HashSet não é garantida. Dessa forma, a classe LinkedHashSet é útil em situações onde é necessário armazenar elementos únicos com uma ordem de inserção específica.*

---

## SortedSet

> ### TreeSet
>
> *implementa um conjunto ordenado, que é uma coleção de elementos únicos ordenados de acordo com a ordem natural dos elementos ou de acordo com um Comparator fornecido pelo usuário. A classe TreeSet é implementada usando uma árvore vermelho-preta e fornece uma implementação eficiente de um conjunto ordenado.*
>
> *Para utilizar um conjunto TreeSet em Java, é necessário criar um objeto TreeSet e especificar o tipo de dados que será armazenado. Por exemplo, o seguinte código cria um conjunto TreeSet que armazena objetos Integer ordenados de forma crescente:*
>
> ```java
> TreeSet<Integer> conjunto = new TreeSet<Integer>();
> 
> // Adiciona elementos ao conjunto
> conjunto.add(3);
> conjunto.add(1);
> conjunto.add(2);
> 
> // Remove um elemento do conjunto
> conjunto.remove(2);
> 
> ```
>
> *Além disso, a classe TreeSet em Java fornece outros métodos úteis, como contains() para verificar se um elemento está presente no conjunto, e size() para obter o número de elementos no conjunto. Além disso, a classe TreeSet fornece métodos para acessar os elementos do conjunto em ordem, como first() para obter o primeiro elemento do conjunto e last() para obter o último elemento do conjunto.*
>
> *A principal diferença entre a classe TreeSet e as classes HashSet e LinkedHashSet é que a classe TreeSet mantém os elementos ordenados, enquanto as classes HashSet e LinkedHashSet não garantem uma ordem específica. Dessa forma, a classe TreeSet é útil em situações onde é necessário armazenar elementos únicos ordenados de acordo com a ordem natural dos elementos ou de acordo com um Comparator fornecido pelo usuário.*

---

## Map

> ### HashTable
>
> *é uma estrutura de dados que associa chaves a valores e permite a recuperação eficiente dos valores associados às chaves. A classe HashTable é implementada usando uma tabela hash e fornece uma implementação eficiente de uma tabela hash.*
>
> *Para utilizar uma tabela HashTable em Java, é necessário criar um objeto HashTable e especificar o tipo de dados que será armazenado como chave e valor. Por exemplo, o seguinte código cria uma tabela HashTable que associa objetos String a objetos Integer:*
>
> ```java
> Hashtable<String, Integer> tabela = new Hashtable<String, Integer>();
> 
> // Adiciona pares de chave-valor à tabela
> tabela.put("foo", 1);
> tabela.put("bar", 2);
> 
> // Remove um par de chave-valor da tabela
> tabela.remove("bar");
> 
> ```
>
> *Além disso, a classe HashTable em Java fornece outros métodos úteis, como get() para recuperar o valor associado a uma determinada chave, containsKey() para verificar se uma chave está presente na tabela, e size() para obter o número de pares de chave-valor na tabela.*
>
> *Uma das principais características da classe HashTable em Java é que ela é thread-safe, o que significa que pode ser usada de forma segura em um ambiente concorrente onde várias threads podem acessá-la simultaneamente. No entanto, isso pode afetar a performance da classe em algumas situações, e por isso outras classes, como HashMap e ConcurrentHashMap, são geralmente preferidas em situações onde a concorrência não é um fator crítico.*
>
> ----
>
> ### LinkedHashMap
>
> *implementa um mapa que mantém a ordem de inserção dos elementos. Isso significa que, diferentemente da classe HashMap, a ordem dos elementos em um LinkedHashMap é determinada pela ordem em que eles foram inseridos no mapa.*
>
> *Para utilizar um LinkedHashMap em Java, é necessário criar um objeto LinkedHashMap e especificar o tipo de dados que será armazenado como chave e valor. Por exemplo, o seguinte código cria um LinkedHashMap que associa objetos String a objetos Integer:*
>
> ```java
> LinkedHashMap<String, Integer> mapa = new LinkedHashMap<String, Integer>();
> 
> // Adiciona pares de chave-valor ao mapa
> mapa.put("foo", 1);
> mapa.put("bar", 2);
> 
> // Remove um par de chave-valor do mapa
> mapa.remove("bar");
> 
> ```
>
> *Além disso, a classe LinkedHashMap em Java fornece outros métodos úteis, como get() para recuperar o valor associado a uma determinada chave, containsKey() para verificar se uma chave está presente no mapa, e size() para obter o número de pares de chave-valor no mapa.*
>
> *A principal diferença entre a classe LinkedHashMap e a classe HashMap é que a classe LinkedHashMap mantém a ordem de inserção dos elementos no mapa, enquanto a classe HashMap não garante uma ordem específica. Isso torna o LinkedHashMap útil em situações em que a ordem dos elementos é importante, como quando se deseja iterar sobre os elementos em ordem de inserção.*
>
> ---
>
> ### HashMap
>
> *implementa um mapa que associa chaves a valores. Um mapa é uma estrutura de dados que permite a recuperação eficiente dos valores associados às chaves. A classe HashMap é implementada usando uma tabela hash e fornece uma implementação eficiente de um mapa hash.*
>
> *Para utilizar um HashMap em Java, é necessário criar um objeto HashMap e especificar o tipo de dados que será armazenado como chave e valor. Por exemplo, o seguinte código cria um HashMap que associa objetos String a objetos Integer:*
>
> ```java
> HashMap<String, Integer> mapa = new HashMap<String, Integer>();
> 
> // Adiciona pares de chave-valor ao mapa
> mapa.put("foo", 1);
> mapa.put("bar", 2);
> 
> // Remove um par de chave-valor do mapa
> mapa.remove("bar");
> ```
>
> *Além disso, a classe HashMap em Java fornece outros métodos úteis, como get() para recuperar o valor associado a uma determinada chave, containsKey() para verificar se uma chave está presente no mapa, e size() para obter o número de pares de chave-valor no mapa.*
>
> *Uma das principais características da classe HashMap em Java é que ela é muito eficiente em termos de tempo de acesso e inserção, tornando-a uma escolha popular para a implementação de mapas hash em Java. No entanto, a ordem dos elementos em um HashMap não é determinada pela ordem de inserção, o que significa que os elementos podem ser iterados em uma ordem arbitrária.*

---

## SortedMap

> ### TreeMap
>
> *mplementa um mapa ordenado que associa chaves a valores. Um mapa é uma estrutura de dados que permite a recuperação eficiente dos valores associados às chaves. A classe TreeMap é implementada usando uma árvore balanceada e fornece uma implementação eficiente de um mapa ordenado.*
>
> *Para utilizar um TreeMap em Java, é necessário criar um objeto TreeMap e especificar o tipo de dados que será armazenado como chave e valor. Por exemplo, o seguinte código cria um TreeMap que associa objetos String a objetos Integer:*
>
> ```java
> TreeMap<String, Integer> mapa = new TreeMap<String, Integer>();
> 
> // Adiciona pares de chave-valor ao mapa
> mapa.put("foo", 1);
> mapa.put("bar", 2);
> 
> // Remove um par de chave-valor do mapa
> mapa.remove("bar");
> 
> ```
>
> *Além disso, a classe TreeMap em Java fornece outros métodos úteis, como get() para recuperar o valor associado a uma determinada chave, containsKey() para verificar se uma chave está presente no mapa, e size() para obter o número de pares de chave-valor no mapa.*
>
> *A principal diferença entre a classe TreeMap e a classe HashMap é que a classe TreeMap mantém os elementos ordenados de acordo com a ordem natural das chaves ou com uma ordem definida pelo usuário. Isso torna o TreeMap útil em situações em que a ordem dos elementos é importante, como quando se deseja iterar sobre os elementos em uma ordem específica.*

