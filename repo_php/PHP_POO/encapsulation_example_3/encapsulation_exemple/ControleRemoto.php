<?php
    require_once "interface.php";

    class ControleRemoto implements Controlador{

        private $volume;
        private $ligado;
        private $tocando;
        
        public function __construct(){
            
            $this -> volume = 50;
            $this -> ligado = false;
            $this -> tocando = false;
        }

        //##########GETTERS

        private function getVolume(){
            return $this -> volume;
        }

        private function getLigado(){
            return $this -> ligado;
            
        }

        private function getTocando(){
            return $this -> tocando;
            
        }

        //##########SETTERS

        private function setVolume($volume){
            $this -> volume = $volume;
        }

        private function setLigado($ligado){
            $this -> ligado = $ligado;
            
        }
        private function setTocando($tocando){
            $this -> tocando = $tocando;
            
        }

        //CONTROLADOR 
        public function ligar(){
            $this -> setLigado(true);
        }
        public function desligar(){
            $this -> setligado(false);
        }
        public function abrirMenu(){
            echo "<br>LIGADO: ". ($this ->getLigado() ? "SIM" : "NÃO");
            echo "<br>TOCANDO: ". ($this ->getTocando() ? "SIM" : "NÃO");
            echo "<br> VOLUME:" . $this -> getVolume();
            for($i=0; $i <= $this -> getVolume(); $i += 10 ){
                echo "|";
            }

            echo "<br>";
        }
        
        public function fecharMenu(){
            echo "FECHAR";
        }

        public function  maisVolume(){
            if($this->getLigado()){
                $this->setVolume($this -> getVolume() + 5);
            } else {
                echo "ERRO";
            }
        }
        public function menosVolume(){

            if($this->getLigado()){

                $this->setVolume( $this -> getVolume() - 5);
            } else {
                echo "ERRO";
            }
        }
        public function ligarMudo(){
            if($this->getLigado() && $this-> getVolume() > 0){
                $this->setVolume(0);
            }
        }
        public function desligarMudo(){
            if($this->getLigado() && $this-> getVolume() == 0){
                $this->setVolume(50);
            }   

        }
        public function play(){
            if($this->getLigado() && !($this-> getTocando())){
                $this->setTocando(true);
            }

        }
        public function pause(){
            if($this->getLigado() && ($this-> getTocando())){
                $this->setTocando(false);
            }
        }

    }
?>