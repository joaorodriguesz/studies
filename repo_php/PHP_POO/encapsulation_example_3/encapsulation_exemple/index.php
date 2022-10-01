<?php
    require_once "ControleRemoto.php";

    $c = new ControleRemoto;
    $c-> ligar();
    $c->abrirMenu();
    $c->play();
    $c->maisVolume();
    $c->maisVolume();
    $c->maisVolume();



    echo '<pre>';
    print_r($c);
    echo '</pre>';

?>