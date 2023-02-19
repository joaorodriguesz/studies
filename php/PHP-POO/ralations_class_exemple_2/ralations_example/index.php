<?php
    require_once "Lutador.php";
    require_once "Luta.php";

    $l = array();
    $l[0] = new lutador('Pedrinho',"EUA",45,1.34,70,11,1,5);
    $l[1] = new lutador('jorgao',"BR",67,1.37,70,41,3,2);
    $l[2] = new lutador('william',"ZA",98,1.80,20,41,3,2);
    $l[3] = new lutador('diegao',"AL",76,1.90,50,81,3,2);
    $l[4] = new lutador('marcao',"AF",34,1.60,40,41,3,2);
    $l[5] = new lutador('jack',"BR",23,1.87,78,97,3,2);

    $luta1 = new Luta();
    $luta1 -> marcarLuta($l[0],$l[4]);
    $luta1 -> lutar();
    $l[0] -> status();

    echo '<pre>';
    print_r($luta1);
    echo '</pre>';
