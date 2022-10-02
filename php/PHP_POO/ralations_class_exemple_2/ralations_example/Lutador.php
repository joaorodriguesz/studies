<?php
    class lutador {
        //Atributos
        private $nome;         
        private $nacionalidade;
        private $idade;
        private $altura;
        private $peso;
        private $categoria;
        private $vitorias;
        private $derrotas;
        private $empates;
        //Metodos
        function apresentar(){
            echo '<p>----------------------------</p>';
            echo '<p>Lutador : '. $this->getNome().'</p>';
            echo '<p>Nacionalidade : '. $this->getNacionalidade().'</p>';
            echo '<p>Idade : '. $this->getIdade().'</p>';
            echo '<p>Peso : '. $this->getPeso().'KG'.'</p>';
            echo '<p>Idade : '. $this->getIdade().'</p>';
            echo '<p>Vitorias : '. $this->getVitorias().'</p>';
            echo '<p>Derrotas : '. $this->getDerrotas().'</p>';
            echo '<p>Empates : '. $this->getEmpates().'</p>';
            echo '<p>----------------------------</p>';
        }
        function status(){
            echo '<p>----------- STATUS -----------</p>';
            echo '<p>Lutador : '. $this->getNome().'</p>';
            echo '<p>Idade : '. $this->getIdade().'</p>';
            echo '<p>Categoria : '. $this->getCategoria().'KG'.'</p>';
            echo '<p>Vitorias : '. $this->getVitorias().'</p>';
            echo '<p>Derrotas : '. $this->getDerrotas().'</p>';
            echo '<p>Empates : '. $this->getEmpates().'</p>';
            echo '<p>----------------------------</p>';
        }
        function ganharLuta(){
            $this->setVitorias($this-> getVitorias()+1);
        }
        function perderLuta(){
            $this->setDerrotas($this-> getDerrotas()+1);
        }
        function empatarLuta(){
            $this->setEmpates($this-> getEmpates()+1);
        }
        //Metodos Especiais
        function __construct($nome,$nacio,$idade,$altur,$peso,$vitoria,$derrotas,$empates){
            $this-> nome          =  $nome; 
            $this-> nacionalidade =  $nacio; 
            $this-> idade         =  $idade;
            $this-> altura        =  $altur;
            $this-> setPeso($peso);
            $this-> vitorias      =  $vitoria; 
            $this-> derrotas      =  $derrotas; 
            $this-> empates       =  $empates; 
        }

        public function getNome(){
            return $this->nome;
        }

        public function setNome($nome){
            $this->nome = $nome;
        }

        public function getNacionalidade(){
            return $this->nacionalidade;
        }

        public function setNacionalidade($nacionalidade){
            $this->nacionalidade = $nacionalidade;
        }

        public function getIdade(){
            return $this->idade;
        }

        public function setIdade($idade){
            $this->idade = $idade;
        }

        public function getAltura(){
            return $this->altura;
        }

        public function setAltura($altura){
            $this->altura = $altura;
        }

        public function getPeso(){
            return $this->peso;
        }

        public function setPeso($peso){
            $this->peso = $peso;
            $this-> setCategoria();
        }

        public function getCategoria(){
            return $this->categoria;
        }

        private function setCategoria(){

            if($this->peso < 52.2){
                $this->categoria = 'Invalido';
            } elseif($this->peso <= 70.3){
                $this->categoria = 'Leve';
            } elseif($this->peso <= 83.9){
                $this->categoria = 'Medio';
            } elseif ($this-> categoria <= 120.2){
                $this->categoria = 'Pesado';
            } else {
                $this->categoria = 'Invalido';
            }
        }

        public function getVitorias(){
            return $this->vitorias;
        }

        public function setVitorias($vitorias){
            $this->vitorias = $vitorias;
        }

        public function getDerrotas(){
            return $this->derrotas;
        }

        public function setDerrotas($derrotas){
            $this->derrotas = $derrotas;
        }

        public function getEmpates(){
            return $this->empates;
        }

        public function setEmpates($empates){
            $this->empates = $empates;
        }
}




?>