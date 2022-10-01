<?php
    require_once "Mamifero.php";
    require_once "Lobo.php";
    require_once "Cachorro.php";

    $m = new Lobo();
    $m -> emitirSom();

    $c = new Cachorro();

    echo '<pre>';
    print_r($c);
    echo '</pre>';

    echo '<pre>';
    print_r($m);
    echo '</pre>';
   

   //php n suporta polimorfismo de sobrecarga 
   // ent quand ose deparar com algo assim
   // criar funções com assianturas diferentes.