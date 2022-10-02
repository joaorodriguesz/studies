# Name Space - PHP

-----

## Delcarar name space

> ```php
> <?php
>     namespace Exemplo;
> 
> 	class Exemplo {
>         
>     }
> 	class Exemplo2 {
>         
>     }
> 
> //Dentro de outra pasta
> 
> 	namespace Exemplo\Exemplo3
>     
>     class Exemplo3 {
>         
>     }
> 
> //Se em uma classe com namespace definido precisarmos acessar classes de outro namespace, precisamos adicionar o use ou informar o seu nome completo (namespace + nome da classe).
> 
> 
> //Index
> use namespace\nome_da_clase //para o fonte todo
> $ex = new \namespace\class();
> 
> //Index
> use namespace\nome_da_clase as apelido //para o fonte todo
> $ex = new \namespace\apelido();
> 
> //Boa pratica sempre seguindo nome das pastas como caminho
> // Ex : source\branches\leaves
> ```
>
> > ### Como se fossem pacotes:
> >
> > 1.  Dentro do namespace ***Exemplo*** temos a classe ***Exemplo*** e ***Exemplo2***.
> > 2. Dentro do namespacce ***Exemplo\Exemplo3*** temos ***Exemplo3***.
> > 3. https://www.php-fig.org/psr/psr-4/
> > 4. https://pt.stackoverflow.com/questions/151487/namespaces-e-use-quando-usar-e-para-que-servem
> > 5. https://pt.stackoverflow.com/questions/78007/%c3%89-necess%c3%a1rio-barra-no-come%c3%a7o-de-fun%c3%a7%c3%b5es-nativas-quando-usamos-namespace
>
> ```php
> <?php
> //Outro detalhe interessante é que, se precisamos "importar" (com use) mais de uma classe do mesmo //namespace, podemos fazer na mesma linha, envolvendo os nomes das classes em chaves. Por exemplo
>     
> //\<NamespaceName>(\<SubNamespaceNames>)*\<ClassName>
> namespace Exemplo\Banco\Conta;
> 
> use Exemplo\Banco\{CPF, Endereco};
> use \SplFileInfo;
> 
> class Conta
> {
>     public function umMetodoQualquer()
>     {
>         // ...
>         $cpf = new CPF();
>         // ...
>         $cpf = new Endereco();
>         // ...
>         $fileInfo = new SplFileInfo();
>         // ...
>         $fileObject = new \SplFileObject();
>         // ...
>     }
> }
> ```
>
> 

----

## AutoLoad

> ```php
> <?php
> //autoload.php
> spl_autoload_register(function (string $nomeCompletoDaClasse){
>     $caminhoArquivo = str_replace('Alura\\Banco', 'src', $nomeCompletoDaClasse);
>     $caminhoArquivo = str_replace('\\', DIRECTORY_SEPARATOR, $caminhoArquivo);
>     $caminhoArquivo .= '.php';
> 
>     if(file_exists($caminhoArquivo)) {
>         require_once $caminhoArquivo;
>     }
> });
> 
> 
> ```
>
> ```php
> <?php
> 
> require_once 'autoload.php';
> 
> use Alura\Banco\Modelo\Conta\Titular;
> use Alura\Banco\Modelo\Endereco;
> use Alura\Banco\Modelo\CPF;
> use Alura\Banco\Modelo\Conta\Conta;
> ```
>
> > Carrega todos os ***use*** e transforma-os em ***require_once***.