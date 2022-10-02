# Xdebug Instal - remote debug

-----

## Ver config php

> ### Basta executar está função no php  para ver todos as informações:
>
> ```php
> phpinfo();
> ```
>
> ------

## Download Xdebug

> Baixar a sua versão: https://xdebug.org/.

-----

## Php.ini

> 1. ir na pasta ***php > extenções (ext)*** e adicionar la dentro
>
> 2. Abrir o arquivo ***php.ini*** na pasta do php e procurar ***'extensions'***  
>
> 3. achar a sessão apenas de  ***extensions*** e adicionar o seguinte comando :
>
>    ```php
>    zend_extension=xdebug
>    xdebug.mode=debug
>    xdebug.start_with_request=yes
>    ```

-----

## Vscode

> 1. Ter a extensão PHP Debug instalada
>
> 2. ir em Run and Debug adicionar um script
>
> 3. Adicionar está config :
>
>    ```php
>    {
>        "version": "0.2.0",
>        "configurations": [
>            {
>                "name": "Listen for Xdebug",
>                "type": "php",
>                "request": "launch",
>                "port": 9003
>            },
>            {
>                "name": "Launch currently open script",
>                "type": "php",
>                "request": "launch",
>                "program": "${file}",
>                "cwd": "${fileDirname}",
>                "port": 0,
>                "runtimeArgs": [
>                    "-dxdebug.start_with_request=yes"
>                ],
>                "env": {
>                    "XDEBUG_MODE": "debug,develop",
>                    "XDEBUG_CONFIG": "client_port=${port}"
>                }
>            },
>            {
>                "name": "Launch Built-in web server",
>                "type": "php",
>                "request": "launch",
>                "runtimeArgs": [
>                    "-dxdebug.mode=debug",
>                    "-dxdebug.start_with_request=yes",
>                    "-S",
>                    "localhost:0"
>                ],
>                "program": "",
>                "cwd": "${workspaceRoot}",
>                "port": 9003,
>                "serverReadyAction": {
>                    "pattern": "Development Server \\(http://localhost:([0-9]+)\\) started",
>                    "uriFormat": "http://localhost:%s",
>                    "action": "openExternally"
>                }
>            }
>        ]
>    }
>    ```

----

## Executando

> 1. Agora é só subir um sv no propio php ou usar o xamp
> 2. iniciar o debug para monitorar com o script selecionado
> 3. selecionar os breakpoints que deseja ver
> 4. Rodando o cod no navegar ele aponta os erros direto no vscode se tudo for instalado corretamente 

