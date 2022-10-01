# Procedures

---

## Criar uma procedure

> ```mysql
> USE `data_base`;
> DROP procedure IF EXISTS `procedure`;
> CREATE DEFINER=`root`@`localhost` PROCEDURE `procedure`()
> BEGIN
>   DECLARE variavel varchar(30) DEFAULT 'text';
>   SELECT variavel; #-> printa
>   
>   #- se quisse armazenar na variavel o retorno de um select
>   SELECT * INTO variavel FROM tabela;
>   #----
>   
>   SET variavel = 'teste'; #-> seta valor
>   SELECT varivael; #-> printa
> END
> 
> ```

---

### Chamando a procedure

> ```mysql
> call 'nome da procedure';
> ```

----

## Passando parâmetros

> ```mysql
> CREATE DEFINER=`root`@`localhost` PROCEDURE `incluir`(
> cod varchar(50)
> ,nm varchar(50)
> , sabor varchar(50)
> , taman varchar(50)
> , emba varchar(50)
> , preco DECIMAL(6,2))
> BEGIN
>   INSERT INTO tabela_de_produtos(
>   CODIGO_DO_PRODUTO
>   ,NOME_DO_PRODUTO
>   ,SABOR
>   ,TAMANHO
>   ,EMBALAGEM
>   ,PRECO_DE_LISTA)                               
>   VALUES (cod, nm , sabor, taman, emba, preco);	
> END
> ```

