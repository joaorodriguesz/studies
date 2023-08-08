# Alfabeto, Palavra, Linguagem e Gramática

----

## Linguagem

> - O Uso da palavra articulada ou escrita como meio de expressão e comunicacão entre pessoas.
> - Não é suficiente preciso para dificir modelos matematicos.

## Para definir linguagem formal

> - Precisamos de um alfabeto.
> - E uma cadeia de caracteres , ou palavras.

-----

## Alfabeto

> - Simbolos e caracteres {a, b, c}, conjunto vazio.
> - Não alfabetos: N (Conjunto dos naturais), {a, aab, bbb, ...}, pois são infinitos.
> - Notacao: Σ

---

## Palavra

> - Cadeia de caracteres
> - Sentenca
> - Sequencia fimita de simbolos e justapostos ou caractere
> - Notacao: w,x,y,z

-----

## Linguagem Formal

> - DEFINICAO: é um subconjunto Σ*
> - Conjunto de palavras formam uma linguagem formal, que segue regras chamadas gramatica 
> - Notacao: L

----

## Gramática

> - gramatica de Chomsky, grámatica irrestritaou apenas gramática
>
>    **G = (V, T, P, S)**
>
> - V conjunto finitos de simbolos, váriaveis ou não terminais
> - T conjunto finmito de simbolos, terminais
> - P Producoes, regra de producao
> - S Elemento diferente de V, variavel inicial
>
> ---
>
> Exemplo
>
> ```txt
> V = {N, D}
> T = {0,1,2,3,4,5,6,7,8,9}
> P = {
>     N -> D (regra 1)
>     N -> DN (regra 2)
>     D -> 0|1|3|4|5|6|7|9 (regra 3)
> }
> S = {N}
> 
> derivando numero 243
> 
> N (regra 2)
> DN (regra 3)
> 2N (regra 2)
> 2DN (regra 3)
> 24N (regra 1)
> 24D (regra 3)
> -------------
> 243
> 
> ```
>
> 
