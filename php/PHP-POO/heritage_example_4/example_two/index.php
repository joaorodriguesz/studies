<?php
    require_once "Visitante.php";
    
   $v1 = new Visitante();
   $v1 -> setNome('visitante');
   $v1 -> setIdade(53);
   $v1 -> setSexo('M');
   echo '<pre>';
   print_r($v1);
   echo '</pre>';

   require_once "Aluno.php";

   $a1 = new Aluno ();
   $a1 -> setNome('aluno');
   $a1 -> setIdade(21);
   $a1 -> setSexo('M');
   $a1 -> setMatricula('123432');
   $a1 -> setCurso('Computação');
   $a1 -> pagarMensalidade();
   echo '<pre>';
   print_r($a1);
   echo '</pre>';

    require_once "Bolsista.php";

    $b1 = new Bolsista();
    $b1 -> setNome('Bolsista');
    $b1 -> setIdade(19);
    $b1 -> setSexo('M');
    $b1 -> setMatricula('43215');
    $b1 -> setCurso('Computação');
    $b1 -> setBolsa('23%');
    $b1 -> pagarMensalidade();
    echo '<pre>';
    print_r($b1);
    echo '</pre>';