<?php
    require_once 'class_pessoa.php';

    class Aluno extends Pessoa {
        private $matricula;
        private $curso;

        //chama o construtor da classe base
        function functionName($nome){
            parent::__construct ($nome);
        }
        
        public function cacelarMatricula(){
            echo "Matricula Cancelada";
        }

        public function getMatricula(){
            return $this->matricula;
        }

        public function setMatricula($matricula){
            $this->matricula = $matricula;
        }

        public function getCurso(){
            return $this->curso;
        }

        public function setCurso($curso){
            $this->curso = $curso;
        }
}