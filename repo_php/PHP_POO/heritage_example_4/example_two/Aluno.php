<?php
    //hernça para diferença
    //herda mas há uma diferença em relação a mãe
    require_once "Pessoa.php";

    class Aluno extends Pessoa {
        private $matricula;
        private $curso;

        //se tivesse final n poderia sobrepor
        public function pagarMensalidade(){
            echo "$this->nome Pagou";
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