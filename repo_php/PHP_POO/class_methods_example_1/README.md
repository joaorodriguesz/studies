## **Classes:**

> Uma **classe** é um gabarito para a definição de objetos. Além da especificação de atributos, a definição de uma **classe** descreve também qual o comportamento de objetos da **classe**, ou seja, que funcionalidades podem ser aplicadas a objetos da **classe**. Essas funcionalidades são descritas através de métodos.

---

## Modificadores de  visibilidade 

>  Nível de acesso a componentes internos de uma classe:

- **+ public** = *A classe atual e todas as outras classes, podem ter acesso.* 
- **- private** = *Somente a classe atual.*
- **# protected** = *A classe atual e todas suas subclasses*

----

## Anatomia  Classe

```php
/// <Classe> nome da classe sempre inicia com letra Maiunscula.		
class Classe  {
// Visibilidade $Atributos;
    public $atributo;
    private $atributo;
    protected $atributo;
// Visibilidade Método <Nome do Método> (paraMetro) {}
    public function NomeMetodo ($param){
    }
    protected function NomeMetodo ($param){
    }
    private function NomeMetodo ($param){
    }
}
         
      

```

----

## Métodos 

> Métodos também podem ter níveis de acesso. Para proteger que qualquer um possa alterar os atributos, existem métodos **assessores** (*Getters*) e **modificadores** (*Setters*), que servem para mexer indiretamente em um atributo Há também um método chamado construtor, que serve para "settar" os valores que iram vir por default no abjeto se houver. 

```php
class Classe  {
    
    private $atributo1;
    private $atributo2;
        
    public function NomeMetodo ($param){
    }
    protected function NomeMetodo ($param){
    }
    private function NomeMetodo ($param){
    }
    public function __construct /*ou apenas o (nome da classe)*/ ($atr1){
        $this ->  = setAtributo1($atr1);
    }
    
    // ##Getters e Setters
    
    // Se for um Getter, irá adicionar um get atras do nome do 
    // atributo que ele pertence EX:
    
    public function getAtributo1(){
        $this -> atributo1;
    }
    
    // Um geter serve para pegar o valor desse atributo.
//-----------------------------------------------------------------
    
    // Se for um Setter, irá adicionar um set atras do nome do 
    // atributo que ele pertence EX:
    
    public function setAtributo1($atributo1){
        $this -> atributo1 = $atributo1;
    }

    // Um Setter serve para adicionar o valor nesse atributo, por isso ele pega como paremetro
    // o proprio atributo.
}
```

-----

## Métodos estáticos / Atributos estáticos

> Os **métodos estáticos** são **métodos** que não dependem de um objeto. Tais **métodos** são chamados sem que haja uma instância da classe que declara o **método**. Como o **método estático** não possui ligação com um objeto, então o **método** não pode usar variáveis de instância, que são variáveis de um objeto.
