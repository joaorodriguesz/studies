import { MeuPrimeiroComponent } from './meu-primeiro/meu-primeiro.component';

//para usar os data binding
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

//prepara a aplicacao apra rodar no browser
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { MeuPrimeiroCliComponent } from './meu-primeiro-cli/meu-primeiro-cli.component';
import { CursosModule } from './cursos/cursos.module';

//aqui diz que está classe representara um modulo
//dentro do decorator temos os metaDados
@NgModule({

  //aqui sera listado todos os componentes diretivas e pipes que seram usados nesse modulo
  declarations: [
    AppComponent,
    MeuPrimeiroComponent,
    MeuPrimeiroCliComponent
  ],

  //outros modulos que poderam ser usados dentro deste modulo ou dentro dos componentes do declarations
  imports: [
    BrowserModule,
    CursosModule
  ],

  //aqui ficam os servicos que estaram disponiveis para os componentes listados
  //ex login
  providers: [],

  //o componente instanciado ao executar a aplicacao
  //Ex app componente
  bootstrap: [AppComponent]
})

//modulo raiz da aplicacao
export class AppModule { }
