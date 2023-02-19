<?php

class Caneta2{

    private $modelo;
    private $cor;
    private $ponta;
    private $tampar;

    public function __construct /*ou apenas Caneta2 (nome da classe)*/ ($m, $c, $p){
        // $this -> cor = "Azul";
        // $this -> tampar();
        $this -> modelo = $m;
        $this -> cor = $c;
        $this-> ponta = $p;
        $this -> tampar();
    }
    public function tampar(){
        $this -> tampar = true;
    }
    public function getModelo(){
        return $this -> modelo;

    }
    public function setModelo($m){
        $this -> modelo = $m;
    }
    public function getPonta(){
        return $this -> ponta;
    }
    public function setPonta($p){
        $this -> ponta = $p;
    }

}

?>