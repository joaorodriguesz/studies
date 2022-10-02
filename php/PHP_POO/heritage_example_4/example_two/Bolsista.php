<?php
    require_once "Aluno.php";

    class Bolsista extends Aluno {
        private $bolsa;
        public function renovarBolsa(){
           echo "RENOVADA"; 
        }

        //sobrepondo o metodo ja existente do alubo
        public function pagarMensalidade(){
            echo "pagou com desconto ".$this-> bolsa;
        }

        public function getBolsa(){
            return $this->bolsa;
        }

        public function setBolsa($bolsa){
            $this->bolsa = $bolsa;
        }
}