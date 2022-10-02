# Resumão Variáveis Estáticas, globais, Constantes

---



## **Variáveis Estáticas**

Uma **variável estática** pode ser uma variável global ou local. Ambas são criados precedendo a declaração da variável com a palavra-chave **static** .

Uma **variável estática local** é uma variável que pode manter seu valor de uma chamada de função para outra e existirá até que o programa termine.

Quando uma variável estática local é criada, deve ser atribuído um valor inicial. Se não for, o valor padrão será 0.

Uma **variável estática global** é aquela que só pode ser acessada no arquivo onde foi criada. Diz-se que essa variável tem **escopo de arquivo** .

---

## **Variáveis globais e externas**

Uma **variável global** é uma variável definida fora de todas as funções e disponível para todas as funções.

Essas variáveis não são afetadas por escopos e estão sempre disponíveis, o que significa que existe uma variável global até que o programa termine.

**É possível criar uma variável global em um arquivo e acessá-la de outro arquivo**. Para fazer isso, a variável deve ser declarada em ambos os arquivos, mas a palavra-chave **extern** deve preceder a "segunda" declaração.

Se for esta o seu objetivo de criar uma variável global em arquivo e poder acessar ela em outro arquivo use **extern**

```
extern int Variavel;
```

---

**Variáveis Locais**

Uma **variável local** é aquela que ocorre dentro de um escopo específico. Eles existem apenas na função em que são criados.

Às vezes, são chamadas de ***variáveis automáticas\*** porque são criadas automaticamente quando a função inicia a execução e desaparecem automaticamente quando a execução da função termina.

---

**"Variáveis" Constantes**

Em C, a diretiva do pré-processador #define foi usada para criar uma variável com um valor constante. Isso ainda funciona em C ++, mas podem surgir problemas.

Quando #define é usado, o pré-processador irá percorrer o código e substituir cada instância da variável #define pelo valor apropriado. Pois bem, como a variável #define existe apenas no arquivo onde foi criada, é possível ter a mesma definição em outro arquivo com um valor completamente diferente. Isso pode levar a consequências desastrosas.

Para superar esse problema, o conceito de uma constante nomeada que é exatamente como uma variável foi introduzido no C ++.

Para criar uma variável constante em C ++, preceda a declaração da variável com a palavra-chave **const** . Isso diz ao compilador que "foi criada uma variável que tem um valor que não pode ser alterado"

Ao criar uma variável constante, ela DEVE receber um valor.