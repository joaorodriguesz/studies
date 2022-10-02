<?php

    require_once "Ave.php";
    require_once "Mamifero.php";
    require_once "Reptil.php";
    require_once "Peixe.php";

    $m = new Mamifero ();
    $a = new Ave ();
    $r = new Reptil();

    // Polimorfismo de sobreposição, mesma assinatura porém fazem coisas diferentes
    $m -> locomover();
    $a -> locomover();
    $r -> locomover();

    //##############################

    require_once 'Canguro.php';

    $g = new Canguro();
    $g -> locomover();
    echo '<pre>';
    print_r($g);
    echo '</pre>';

