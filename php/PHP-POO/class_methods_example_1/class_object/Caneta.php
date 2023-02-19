<?php
   class Caneta
   {
      public $modelo;
      public $cor;
      public $ponta;
      public $carga;
      public $tampada;

      function rabiscar(){

         if ($this->tampada) {
            echo 'Não posso escrever!!!';
         }else{
            echo 'escrevendo....';
         }
      }

      public function tampada(){

         $this->tampada = true;
      }
      
      public function destampada(){
         
         $this->tampada = false;
      }


   }


?>