<?php
    require_once "Animal.php";

    class Peixe extends Animal{
        private $corEscama;
        
        public function locomover(){
            echo "<br>nadando";
        }
        public function alimentar(){
            echo "<br>comendo substancias";
        }
        public function emitirSom(){
            echo "<br>som de peixe";
        }
        public function soltarBolhas (){
            echo "<br>soltar bolhas";
        }

        public function getCorEscama(){
            return $this->corEscama;
        }

        public function setCorEscama($corEscama){
            $this->corEscama = $corEscama;
        }
}