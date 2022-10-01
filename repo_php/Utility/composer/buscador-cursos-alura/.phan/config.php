<?php
    return [
       "terget_php_version" => '8.0',
        "directory_list" => [
            'src',
            'vendor/symfony/dom-crawler',
            'vendor/guzzlehttp/guzzle',
        ],
        'plugins' => [
            'AlwaysReturnPlugin',
            'DollarDollarPlugin',
            'DuplicateArrayKeyPlugin',
            'DuplicateExpressionPlugin',
            'PregRegexCheckerPlugin',
            'PrintfCheckerPlugin',
            'SleepCheckerPlugin',
            'UnreachableCodePlugin',
            'UseReturnValuePlugin',
            'EmptyStatementListPlugin',
            'LoopVariableReusePlugin',
        ],
    ];