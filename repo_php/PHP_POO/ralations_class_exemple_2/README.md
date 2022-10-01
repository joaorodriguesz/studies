# Relacionamento entre classes

---

> Os objetos tem relações entre eles: um professor ministra uma disciplina para alunos numa sala, um cliente faz uma reserva de alguns lugares para uma data, etc. Essas relações são representadas também no diagrama de classe. Geralmente as classes não estão sós e se relacionam entre si. O relacionamento e a comunicação entre as classes definem responsabilidades , temos 3 tipos : Associações : Agregação e composição, Generalização (herança), Dependências
>
> 

---

## Associação 

> ![](https://github.com/JoaoPauloMRodrigues/PHP-/blob/main/PHP_POO/imagens/assosiacao.PNG?raw=true)
>
> ---
>
> > Uma classe como : 'carro' possui 4 pneus, e pneu tem suas propriedades separadas do carro, então cria-se uma classe chamada Pneu, e como o carro possui 4 pneus criamos 4 instancias da classe pneu em carro, associamos a classe do tipo carro a classe do tipo pneu. Porque não há herança ? Porque estamos usando as instancias de pneu como atributos da classe carro.  

---

## Composição

> ![](https://github.com/JoaoPauloMRodrigues/PHP-/blob/main/PHP_POO/imagens/composicao.PNG?raw=true)
>
> -----
>
> > A composição é um relacionamento de contenção. Um objeto (container) CONTÉM outros objetos (elementos). Esses elementos que estão contidos dentro de outro objeto dependem dele para existir. Eles são criados e destruídos de acordo com o seu container. Um exemplo de container poderia ser uma nota fiscal, e seus elementos seriam seus itens. Não faz sentido existir itens de nota fiscal, sem que haja uma nota fiscal onde tais itens estejam contidos. Eles só existem se houver uma nota fiscal da qual eles façam parte. Se a nota fiscal é destruída, todos os seus itens também são, o que não acontece com a agregação, onde, se uma reunião é destruída, seus participantes continuam existindo, pois podem participar de outras reuniões
> >
> > Um exemplo de composição é a relação entre Livro e Autor são duas classes distintas, onde cada objeto da classe Livro possui um objeto da classe Autor. Neste caso existirá uma relação de composição, pois a classe Autor faz parte da classe Livro.
> >
> > Uma forma de verificar se uma determinada classe A tem uma relação de composição com uma classe B. É fazer perguntar-se: "A classe A está contida na classe B?". Caso a resposta seja positiva existe uma relação de composição entre as duas classes. Abaixo é possível visualizar alguns exemplos: • Um Livro tem Autor? - SIM – Logo, se usa a composição. • Um Automóvel tem um Carro Antigo ? - NÃO – Logo, não se usa a composição. • Um Automóvel tem Porta ? - SIM – Logo, pode se usar a composição.

---

## Agregação 

> ![](https://github.com/JoaoPauloMRodrigues/PHP-/blob/main/PHP_POO/imagens/agregacao.PNG?raw=true)
>
> ---
>
> > Tipo de associação (é parte de, todo/parte) onde o objeto parte é um atributo do todo; a existência do objeto-parte faz sentido, mesmo não existindo o objeto-todo. Por exemplo Carro e rodas: as rodas existem mesmo sem o carro. A agregação, na UML, é representada por uma linha com um losango sem preenchimento do lado da classe dona do relacionamento.
> >
> > 

---

## Especialização ou Generalização (Herança)

> Também conhecida como herança, representa as dependências e hierarquias.

---

## Dependência

> São relacionamentos de utilização no qual uma mudança na especificação de um elemento pode alterar a especificação do elemento dependente. A dependência entre classes indica que os objetos de uma classe usam serviços dos objetos de outra classe.
>