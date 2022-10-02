<?php

    class ContaBanco{

        public $numConta;
        protected $tipo;
        private $dono;
        private $saldo;
        private $status;

        public function abrirConta($tipo){
            $this -> setTipo($tipo);
            $this -> setStatus(true);

            if($tipo == "CC"){

                $this -> setsaldo(50);
            } else if ($tipo == "CP"){

                $this -> setSaldo(150);
            }
 
        }
         
        public function fecharConta(){
            if($this -> getSaldo() > 0){
                echo "ERRO CONTA AINDA CONTEM SALDO";

            }else if ($this -> getSaldo() < 0){
                echo "ERRO CONTA ESTA EM DEBIDO";
            } else {
                $this -> setStatus(false);
                echo "FECHADA";
            }
        }
        public function depositar($valor){

            if($this -> getStatus()){

                $this -> setSaldo($this -> getSaldo() + $valor);
            } else {
                echo "CONTA FECHADA";
            }
        }
        public function sacar($valor){
            if($this -> getStatus()){

                if($this -> getSaldo() >= $valor){

                    $this -> setSaldo($this -> getSaldo() - $valor);
                    echo "<p>SAQUE AUTORIZADO DE R$ {$valor}<p>";
                } else {
                    echo "SALDO INSUFICIENTE";
                }
            } else {
                echo "CONTA FECHADA";
            }
        }
        public function mensalidade(){

            if($this -> getTipo() == "CC"){
                    $valor = 20;
                    echo "<p>MENSALIDADE R$ {$valor}</p>";
            } else if($this -> getTipo() == "CP"){
                    $valor = 20;
                    echo "<p>MENSALIDADE R$ {$valor}</p>";

            }
            if($this -> getStatus()){
               $this -> setSaldo($this -> getSaldo() -$valor); 
            } else {
                echo "ERRO";     
            }
        }    



        public function __construct(){
            $this -> setSaldo(0);
            $this -> setStatus(false);
            echo "CONTA CRIADA";
        }

        //********** NUMERO CONTA */
        public function getNumConta(){
            $this -> numConta;
        }
        public function setNumConta($numConta){
            $this -> numConta = $numConta;
        }
        //********** TIPO */

        public function getTipo(){
            return $this -> tipo;
        }
        public function setTipo($tipo){
            $this -> tipo = $tipo;
        }
        //********** DONO */
        
        public function getDono(){
            return $this -> dono;
        }
        public function setDono($dono){
            $this -> dono = $dono;
        }
        
        //********** SALDO */

        public function getSaldo(){
            return $this -> saldo;
        }
        public function setSaldo($saldo){
            $this -> saldo = $saldo;
        }

        //********** STATUS */

        public function getStatus(){
            return $this -> status;
        }
        public function setStatus($status){
            $this -> status = $status;
        }

        //***********************/


        





    }



?>
