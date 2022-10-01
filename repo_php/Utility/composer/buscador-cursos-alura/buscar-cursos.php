#!/usr/bin/env php
<?php

require 'vendor/autoload.php';

use BuscadorDeCursos\Src\Buscador;
use BuscadorDeCursos\Src\Text;
use GuzzleHttp\Client;
use Symfony\Component\DomCrawler\Crawler;



$client = new Client(['base_uri' => 'https://www.alura.com.br/']);
$crawler = new Crawler();

$buscardor = new Buscador($client, $crawler);
$cursos = $buscardor->buscar('/cursos-online-programacao/php');

foreach ($cursos as $curso) {
    echo $curso.PHP_EOL;
}

//******************/

Class1::texto1();
Class2::texto2();
echo Texto3('teste3');

exit();
