<?php
    require_once "Animal.php";
    class Reptil extends Animal{

        private $corEsquema;

        function locomover(){
            echo "<br>rastejando";
        }
        function alimentar(){
            echo "<br>vegetais";
        }
        function emitirSom(){
            echo "<br>som de reptil";
        }

        public function getCorEsquema(){
            return $this->corEsquema;
        }

        public function setCorEsquema($corEsquema){
            $this->corEsquema = $corEsquema;
        }
}