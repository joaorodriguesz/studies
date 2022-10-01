# Buscas

---

## Pesquisa Sequencial 

> (*Funciona em qualquer lista* ) 
>
> Analisa valor por valor em ordem, exemplo  : buscando pelo valor 30
>
> > | *valor*     | *[ 10 ]* | *20*         | *30*         | *40*   |
> > | ----------- | -------- | ------------ | ------------ | ------ |
> > | ***Valor*** | **10**   | ***[ 20 ]*** | **30**       | **40** |
> > | ***Valor*** | **10**   | **20**       | ***[ 30 ]*** | **40** |

----

## Pesquisa Binária

> (*Só funciona com listas já ordenadas*)
>
> Começa analisando o centro, se o valor buscado for maior avança para metade da frente, se for menor recua para o centro da metade de trás. Exemplo : Buscando pelo valor 100
>
> > | *valor*     | 10     | 20     | 30     | 40     | 50     | *[ 60 ]* | 70     | 80     | 90            | 100          |
> > | ----------- | ------ | ------ | ------ | ------ | ------ | -------- | ------ | ------ | ------------- | ------------ |
> > | ***Valor*** | **10** | **20** | **30** | **40** | **50** | **60**   | **70** | **80** | *** [ 90 ]*** | **100**      |
> > | ***Valor*** | **10** | **20** | **30** | **40** | **50** | **60**   | **70** | **80** | **90**        | *** [100]*** |