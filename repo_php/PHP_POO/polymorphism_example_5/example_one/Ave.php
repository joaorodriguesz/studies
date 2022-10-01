<?php
    require_once "Animal.php";

    class Ave extends Animal {

        private $corPena;

        public function locomover (){
            echo "<br>Voando";
        }
        public function alimentar(){
            echo "<br>comendo frutas";
        }
        public function emitirSom(){
            echo "<br>som de ave";
        }
        public function fazerNinho (){
            echo "<br>fazendo ninho";
        }    
    }