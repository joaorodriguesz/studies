<?php
    require_once "Animal.php";
    
    class Mamifero extends Animal {
        private $corPelo;

        function locomover(){
            echo "<br>correndo";
        }
        function alimentar(){
            echo "<br>mamando";
        }
        function emitirSom(){
            echo "<br>som de mamifero";
        }

        public function getCorPelo(){
            return $this->corPelo;
        }

        public function setCorPelo($corPelo){
            $this->corPelo = $corPelo;
        }
}