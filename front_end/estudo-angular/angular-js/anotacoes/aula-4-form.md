# AngularJs - Validação de formularios

---

## Diretiva de validação

> **ng-required="true":** *Defini um determinado campo como obrigatório.*
>
> Ao criar uma tag *form* com o atributo *name="formulario"*, o angular automaticamente cria um objeto  *formulario* no *$scope*. Aonde assim poderá ser validado os campos com a diretiva ***ng-require="true"***, os campos validados se tiveram o atributo name também podem ser acessados pelo objeto formulario.
>
> ```html
> <form name="formulario">
>  <input name="entradaTexto" ></input>
>  /.....
> </form>
> ```
>
> ----
>
> **Consultar a validade de um campo ou formulário**
>
> - ***$valid:*** Verifica se não esta vazio.
> - ***$invalid:*** Verifica se esta vazio.
>
> ### Verificando se um formulário ou campo já foi utilizado alguma vez
>
> - **$pristine:** Verifica se o campo nunca foi tocado.
> - **$dirty :** Verifica se o campo já foi tocado e não voltara a ser ***$pristine***.
> - **.$setPristine():** Volta o campo ao estado de ***$pristine***;
>
> ### Define o tamanho mínimo e máximo permitido ( Não é uma mascara, por isso não irar proibir de digitar mais ou menos ).
>
> - **ng-minlength:** Define quantidade máxima de caracteres.
>
> - **ng-maxlength:** Define quantidade mínima de caracteres.
>
> ### Consulta os erros de um campo ou  formulário.
>
> - **$error:** Consulta os erros de um campo ou  formulário.
>
> ### Define uma RegExp para validar o campo.
>
> - **ng-pattern:** Define uma RegExp para validar o campo.
>
> 
>
> ```javascript
> 	angular.module("moduleName", []);
> 	angular.module("moduleName").controller("controllerName", ($scope) => {
>         //$valid e $invalid
>         formulario.$valid;
>         formulario.entradaTexto.$valid
> 		
>         //$pristine e $dirty
>         formulario.$pristine;
>         formulario.entradaTexto.$pristine
>         formulario.entradaTexto.$setPristine()
>         
>         //$error
>         formulario.entradaTexto.$error.require
>         formulario.entradaTexto.$error.maxlength
>     }
> ```
>
> Irá verificar se no *formulário* todos os campos com  ***ng-require="true"***  estão preenchidos.
>
> ---
>
> ### Diretiva  - ng-messages=""  (Modulo externo)
>
> Gerenciar mensagens como um switch com erros.
>
> ```html
> <div ng-messages="formulario.campo.$error">
>     <div ng-message="required"> /msg... </div>
>     <div ng-message="minlength"> /msg... </div>
> </div>
> ```
>
> 

