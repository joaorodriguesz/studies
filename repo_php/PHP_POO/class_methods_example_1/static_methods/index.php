<?php

require_once 'Carro.php';

//Como se trata de um metodo statico
//Podemos chamar usando o nomeDaClasse :: metodo

Carro:: setNome('Gol');
$nomeCarro = Carro:: getNome();

Carro:: setPreco(23000);
$precoCarro = Carro:: getPreco();


