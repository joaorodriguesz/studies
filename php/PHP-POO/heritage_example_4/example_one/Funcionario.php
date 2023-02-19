<?php

    require_once 'Pessoa.php';
    class Funcionario extends Pessoa {
        private $setor;
        private $trabalhando;
        public function mudarTrab(){
            $this->trabalhando =! $this->trabalhando ;
        }

        public function getSetor(){
            return $this->setor;
        }

        public function setSetor($setor){
            $this->setor = $setor;
        }

        public function getTrabalhando(){
            return $this->trabalhando;
        }

        public function setTrabalhando($trabalhando){
            $this->trabalhando = $trabalhando;
        }
}