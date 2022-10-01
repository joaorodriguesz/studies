<?php
    require_once 'class_pessoa.php';
    require_once 'class_professor.php';
    require_once 'class_funcionario.php';
    require_once 'class_aluno.php';


    $p1 = new Pessoa();
    $p2 = new Aluno();
    $p3 = new Professor();
    $p4 = new Funcionario();

    $p1-> setNome("pessoa");
    $p2-> setNome("aluno");
    $p3-> setNome("professor");
    $p4-> setNome("funcionario");

    $p1-> setSexo("M");
    $p2-> setCurso("informatica");
    $p3-> setSalario(2500.75);
    $p4-> setSetor("estoque");

    $p3-> aumento(500);

    echo '<pre>';
    print_r($p1);
    echo '</pre>';
    echo '<pre>';
    print_r($p2);
    echo '</pre>';
    echo '<pre>';
    print_r($p3);
    echo '</pre>';
    echo '<pre>';
    print_r($p4);
    echo '</pre>';

