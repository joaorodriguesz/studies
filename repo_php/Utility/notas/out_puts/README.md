# NOTAS

----

## Lixo na memória 

> O php possui um coletor de lixo (em inglês: **garbage collector**, ou o acrônimo **GC**) é um processo usado para a automação do gerenciamento de memória. Com ele é possível recuperar uma área de memória inutilizada por um programa, **o que** pode evitar problemas de vazamento de memória, resultando no esgotamento da memória livre para alocação.

----

## Diferença de comandos de saída

> ```php
> //###################
> //#      ECHO       #
> //###################  
> /*Permite utilizar mais de uma string
> tipo void, sem retorno*/
> $echo = echo 'Hello world!!!','Hello world!!!';
> 
> //###################
> //#      PRINT      #
> //###################  
> /*Permite utilizar apenas uma string
> tipo int, retorna um inteiro*/
> $print = print 'Hello world!!!';
> 
> //###################
> //#   PRINT_R       #
> //###################  
> //Permite ver dados de uma varivavel de uma forma mais simples de ler.
> $a = 'ABC';
> print_r($a);
> $b = [1,2,3]
> print_r($b);
> 
> echo '<pre>';
> print_r($b);
> echo '<pre>'
>     
> //###################
> //#   VAR_DUMP      #
> //###################    
> /*Tem um resutado semelhante ao print_r, mas para além dos valores apresenta
> também a informação sobre o tipo de valores.*/
> $a = 'ABC';
> var_dump($a);
> $v = [1,2,3];
> var_dump($v);
> 
> //###################
> //#   VAR_EXPORT    #
> //###################  
> /*Apresenta informação sobre uma variável num estilo que pode
>  serusado como código PHP.
> */ 
> $a = 'ABC';
> var_export($a);
> $v = [1,2,3]
> var_export($v);
> 
> 
> ```
>
> 
