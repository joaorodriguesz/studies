# ADM - MySQL, Segurança e otimização do banco

---

## DBA (*Database administrator*) 

> - Avaliar e instalar o ambiente MYSQL;
> - Configurar o acesso a base de dados;
> - Manter o banco de dados com performance;
> - Manter os dados através de processos de Backup;
> - Auxiliar a área de desenvolvimento na manutenção dos dados;
> - Monitorar a instalação do MYSQL;
> - Configuração do ambiente;
> - Administrar os usuários de acesso.

----

## Connections.xml

> Replicar conexões MySQL, apenas copiando o arquivo Connections.xml,geralmente no caminho : (***AppData\Roaming\MySQL\Workbench***)

---

## Tuning de Hardware (**performatizar** o ambiente )

> - Existem 4 maneiras de configurar o ambiente do MYSQL para fazer tuning;
> - Esquema e índices, mysqld Tuning e Tuning de sistema operacional;
> - Ênfase ao Tuning usando o mysqld e tuning de Hardware.
>
> ---
>
> ### Hardware
>
> - Preferência a sistema operacional de 64 bit;
> - Ver relação entre RAM e base de dados;
> - Ver tipo de leitura de disco;
> - Usar controladora de disco RAID. 
>
> ---
>
> ### Variáveis de ambiente
>
> - O comando SHOW STATUS mostra situação atual das variáveis de ambiente
>
> - Temos dois tipo: GLOBAL e SESSION
>
> - Ficar armazenadas nos arquivos my.ini (Windows) ou my.cnf (Linux)
>
> - Possui duas diretivas:[mysqld] - para globais e [cliente] - para sessions
>

---

## Mecanismo de armazenamento 

> - 20 grandes mecanismos de armazenamentos são disponíveis.
> - Mecanismos de armazenamento permite que haja uma separação entre a armazenagem  e o código principal do banco de dados.
> - Os mais usados são MyISAM, InnoDB e MEMORY.
>
> ---
>
> ### MyISAM

> - Não é transacional e não implementa mecanismos de bloqueio;
> - Rápido para leitura;
> - Problemático para muitas gravações de vários usuários
>

> **Características MyISAM** 
>
> > - Não transacional;
> > - Nenhuma chave estrangeira suporta indicies FULLTEXT para correspondência de texto;
> > - Nenhum cache de dados Cache de índice - pode ser especificado pelo nome;
> > - Implementa os índices HASH e BTREE;
> > - Bloqueio no nível da tabela;
> > - Atividade de leitura muito rápida, adequada para DataWarehouses;
> > - Dados compactados.
>
> ---
>
> ### InnoDB
>
> - O mecanismo de armazenamento transacional  mais usado é o mecanismo de armazenamento InnoDB.
> - O InnoDB trouxe suporte para chaves estrangeiras para o mysqld.
>
> **Características InnoDB** 
>
> > - Suporte transacional completo;
> > - Bloqueio de nível de linha suporte de chave estrangeira;
> > - Indexação usando indicies BTREE;
> > - Cache de buffer configurável de ambos os indicies e dados;
> > - Backup online sem bloqueio.
>
> ----
>
> ### Memory
>
> - Nenhum suporte de chave estrangeira;
> - Muito rápido ler e escrever atividade devido a ser inteiramente na memoria;
> - Bloqueio no nível da tabela.

---

## Backup

> ### BACKUP -  Lógico
>
> > - mysqldump - para criação de Backups Lógicos;
> >
> > Sintaxe : mysqldump [options]
> >
> > - Usuário, senha, servidor
> > - --all-databases é a opção que diz que BACKUP será completo.
> > - .> <nome da saída> redireciona a saída do backup.
> > - Para incluir Stored Procedures e eventos do banco de dados usamos --routines e --events.
> >
> > **EX - todo o banco :**
> >
> > ![](C:\Users\joao\Desktop\sudeni2\repositorios_git\public\estudos\data_base\MySQL\DBA_segurança_otimização\ex_mysqldump\ex_mysqldump.PNG)
> >
> > **EX - Apenas uma tabela especifica :**
> >
> > ![](C:\Users\joao\Desktop\sudeni2\repositorios_git\public\estudos\data_base\MySQL\DBA_segurança_otimização\ex_mysqldump\ex_mysqldump_only_table.PNG)
> >
> > **EX - Todos menos um :**
> >
> > ![](C:\Users\joao\Desktop\sudeni2\repositorios_git\public\estudos\data_base\MySQL\DBA_segurança_otimização\ex_mysqldump\ex_mysqldump_ignore.PNG)
> >
> > ### EX - Executando todo o script de uma vez  (linha de comando) : 
> >
> > ![](C:\Users\joao\Desktop\sudeni2\repositorios_git\public\estudos\data_base\MySQL\DBA_segurança_otimização\ex_mysqldump\exe_script.PNG)
>
> ---
>
> ### BACKUP  -  Físico
>
> > - Para realizar um backup do banco como está atualmente é necessário para-ló temporariamente para poder realiza-ló.
> >
> > - para isso temos o comando:
> >
> > ```mysql
> > #Trancar o banco :
> > LOCK INSTANCE FOR BACKUP;
> > #Para reverter :
> > UNLOCK INSTANCE;
> > ```
> >
> > Comando para ver aonde os arquivos (tabelas,registros) estão sendo salvos no disco :
> >
> > ```mysql
> > SHOW VARIABLES WHERE Variable_Name LIKE '%dir% ';
> > 
> > # ex : C:\ProgramData\MySQL\MySQL Server 8.0\Data\
> > # data e my.ini    <- mais importantes 
> > ```

----

## Algoritmos Hash e Btree

> - HASH e B-TREE são diferentes algoritmos de busca de lista ordenada.
>
>   > ### Árvore Binária
>   >
>   > ![arvore](https://blog.cod3r.com.br/wp-content/uploads/2020/11/ArvoreBinaria-584x450.png)
>   >
>   > 
>   >
>   > **Exemplo de como funciona**
>   >
>   > >  Se quiser achar o numero **12**, ele vai começar no **24**, **(24 < 12 ) = false**, então sabemos que está do lado esquerdo porque os maiores estão do lado direito, ai segue para o **(10 < 12) = true** então sabemos que ele está a direita, até encontrar o **12**.
>
>   ---
>
>   ### B-TREE
>
>   > - o B é chamado de "Balance Tree" porque o índice sempre tenta balancear os lados da árvore.
>   >
>   >   > ![b_tree](https://raw.githubusercontent.com/JoaoPauloMRodrigues/Studies/main/dataBase/MySQL/DBA_seguran%C3%A7a_otimiza%C3%A7%C3%A3o/repo_img/b_tree.jpeg)
>   >   >
>   >   > > **Ela tenta distribuir ao máximo os nós na ávore**
>   >   >
>   >   > ---
>   >   >
>   >   > Seus valores são balanceados. OS mesmos dados que temos na esquerda teremos na direita.
>   >   >
>   >   > ![b_tree](https://upload.wikimedia.org/wikipedia/commons/6/65/B-tree.svg)
>   >   >
>   >   > Ex : Oque está a esquerda do **7** está localizado no grupo da esquerda, entre **7** e **16** está no grupo do meio.
>   >   >
>   >   > **Eficiência** : **4 bilhões de nós** em no máximo **32 níveis**, portanto em apenas **32 consultas** chegamos ao que queremos
>   >   >
>   >   > ----
>
>   ## HASH 
>
>   > É um algoritmo que mapeia dados grandes de tamanhos variáveis em um tamanho fixo.
>   >
>   > > *ASJAJSAOJSJAHG.....................................................................010010010010010*
>   > >
>   > > *ASJAJSAO...................................................................................012001220010010*
>   > >
>   > > *ASJAJSAO.LFKGJAYDJFNFHAJJAHJSHAJSANHDLAJ............012001220110010*
>   >
>   > Como num livro, antes de achar um capítulo, olhamos o índice para buscar a página.
>   >
>   > > ![HASH](https://s2.glbimg.com/2O94mvUvk6mFkTDAWexC1np4J7A=/0x0:1000x689/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2021/B/8/bqBC2rQLygYGUpM3FEQQ/2012-07-09-exemplo-de-aplicacao-de-busca-por-hash-em-uma-tabela-de-nomes-e-telefones.png)
>   

----

## Criando usuário 

> ```mysql
> #Cria usuario
> CREATE USE '<nome>'@'<servidor>' IDENTIFIED BY '<SENHA>';
> 
> #Definir que ele pode acessar de qualquer lugar
> #Ou limitar a uma maquita só colocando o IP
> CREATE USE '<nome>'@'%' IDENTIFIED BY '<SENHA>';
> 
> #Dar privilegios 
> #definindo ele como DBA com todos os privilegios
> GRANT ALL PRIVILEGES ON *.* TO '<nome>'@'<servidor>' WITH GRANT OPTION
> 
> #definindo privilegios especificos
> GRANT SELECT,INSERT,DELETE ON *.* TO '<nome>'@'<servidor>'
> 
> #Apagando usuario
> DROP USER '<nome>'@'<servidor>'
> ```
>
> *Obs : também é possível criar pelo workBench.*
>
> ----
>
> **Limitando schemas (dataBases)**
>
> > ```mysql
> > GRANT SELECT,INSERT,DELETE ON <nome do schema>.* TO '<nome>'@'<servidor>'
> > 
> > #limitando tabelas
> > GRANT SELECT,INSERT ON <nome da tabela> TO '<nome>'@'<servidor>'
> > 
> > ```
>
> **Limpando limitações**
>
> > ```mysql
> > #para ver os usu
> > SELECT * FROM mysql.user 
> > 
> > #para ver as permissoes
> > SHOW GRANTS FOR '<nome>'@'<servidor>'
> > 
> > #limpando as permissoes
> > REMOVE ALL PRIVILEGES, GRANT OPTION FROM '<nome>'@'<servidor>'
> > 
> > ```
>
> ----
>
> > 
>
> ----
>
> > ![](C:\Users\joao\Desktop\sudeni2\repositorios_git\public\estudos\data_base\MySQL\DBA_segurança_otimização\repo_img\ip_coringa.jpeg)
>
> 1. *qualquer **IP** de **192.168.1.0** á **192.168.1.255** pode acessar;*
> 2. *pode ir do **192.168.1.100** á **192.168.1.255;***
> 3. *pode ir qualquer letra no lugar do **__***.

----

## **Nota**

> Conectar no MySQL por linha de comando :
>
> > ![](C:\Users\joao\Desktop\sudeni2\repositorios_git\public\estudos\data_base\MySQL\DBA_segurança_otimização\ex_mysqldump\conexao_mysql.jpeg)
>
> - MySQL Slap :  simula consultas concorrentes no mysql. (*https://dev.mysql.com/doc/refman/8.0/en/mysqlslap.html*)

