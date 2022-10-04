import { CursosService } from './cursos.service';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CursosComponent } from './cursos.component';
import { CursoDetalheComponent } from './curso-detalhe/curso-detalhe.component';



@NgModule({
  declarations: [
    CursosComponent,
    CursoDetalheComponent
  ],
  imports: [
    CommonModule
  ],
  //exportar um modulo, diretivas, pipes, para quem importar o modulo, se n tiver aqui n tem acesso
  exports: [
    CursosComponent,
    CursoDetalheComponent
  ],
  providers: [ CursosService ]

})
export class CursosModule { }
