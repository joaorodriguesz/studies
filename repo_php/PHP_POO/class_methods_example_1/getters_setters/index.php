<?php

    require_once "ContaBanco.php";

    $p1 = new ContaBanco();
    $p1 -> abrirConta("CC");
    $p1 -> setDono("PESOSA1");
    $p1 -> setNumConta(1111);
    $p1 -> depositar(400);
    $p1 -> sacar(3);
    $p1 -> mensalidade();

    echo '<pre>';
    print_r($p1);
    echo '</pre>';

    $p2 = new ContaBanco();
    $p2 -> abrirConta("CP");
    $p2 -> setDono("PESOSA2");
    $p2 -> setNumConta(2222);
    $p2 -> depositar(500);
    $p2 -> sacar(630);
    $p2 -> mensalidade();
    $p2 -> fecharConta();


    echo '<pre>';
    print_r($p2);
    echo '</pre>';

?>