//import <nome da classe></nome> from <qual pacote que ela percentence>
import { Component } from "@angular/core";

//Para dizer que está classe é um componente
//decoration/notion
@Component({
  //nome da tag html do componente
  selector: 'meu-primeiro-component',
  template: `<p>Meu primeiro component</p>`
})

export class MeuPrimeiroComponent {}
