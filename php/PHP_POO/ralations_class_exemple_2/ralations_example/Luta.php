<?php
    require_once "Lutador.php";
    
    class Luta {
        private $desafiado;    
        private $desafiante;    
        private $rounds;    
        private $aprovada;    

        public function marcarLuta($l1, $l2){
            if($l1->getCategoria() == $l2->getCategoria() && ($l1 != $l2)){
                $this-> aprovada = true;
                $this->desafiando = $l1;
                $this->desafiante =  $l2;
            } else {
                $this-> aprovada = false;
                $this->desafiado = null;
                $this->desafiante = null;
            }
        }
        public function lutar(){
            if($this->aprovada){
                $this-> desafiando -> apresentar();
                $this-> desafiante -> apresentar();
                $vencedor = rand(0,2);
                switch ($vencedor) {
                    case 0:
                        echo "<p>Empate!</p>";
                        $this->desafiado -> empatarLuta();
                        $this->desafiante -> empatarLuta();    
                        break;
                    case 1:
                        echo "<p>".$this->desafiando->getNome()."</p>";
                        $this->desafiando->ganharLuta();
                        $this->desafiante->perderLuta();
                        break;
                    case 2:
                        echo "<p>".$this->desafiante->ganharLuta()."</p>";
                        $this->desafiando->ganharLuta();
                        $this->desafiante->perderLuta();
                        break;    
                }
            } else {
                echo "<p>ERRO</p>";
            }  
        }

        public function getDesafiado(){
            return $this->desafiando;
        }

        public function setDesafiado($desafiando){
            $this->desafinado = $desafiando;
        }

        public function getDesafiante(){
            return $this->desafiante;
        }

        public function setDesafiante($desafiante){
            $this->desafiante = $desafiante;
        }

        public function getRounds(){
            return $this->rounds;
        }

        public function setRounds($rounds){
            $this->rounds = $rounds;
        }

        public function getAprovada(){
            return $this->aprovada;
        }

        public function setAprovada($aprovada){
            $this->aprovada = $aprovada;
        }
    } 