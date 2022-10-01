<?php

    require_once 'Caneta.php';

    $c1 = new Caneta;
    $c1 -> cor = "Azul";
    $c1 -> ponta = 0.5;
    $c1 -> tampada = false;
    $c1 -> tampada();

    $c1 ->rabiscar();

    echo '<pre>';
    print_r($c1);
    echo '</pre>';

    //---------------OBJ 2-----------------

    $c2 = new Caneta;
    $c2 -> cor = "verde";
    $c2 -> carga = 50;
    $c2 -> tampada();
    
    echo '<pre>';
    print_r($c2);
    echo '</pre>';


?>