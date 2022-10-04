import { Router } from '@angular/router';
import { TransferenciaService } from './../services/transferencia.service';
import { Component, EventEmitter, Output } from '@angular/core';
import { Transferencia } from 'src/models/transferencua.models';

@Component({
  selector: 'app-nova-transferencia',
  templateUrl: './nova-transferencia.component.html',
  styleUrls: ['./nova-transferencia.component.scss'],
})
export class NovaTransferenciaComponent {
  //outPut vai movimentar os dados para outro lugar
  //aoTransferir é definido como evento
  @Output() aoTransferir = new EventEmitter<any>();

  valor: number = 123;
  destino: number = 123;

  constructor(private service: TransferenciaService, private router: Router){}

  transferir() {
    const valorEmitir: Transferencia = {valor: this.valor, destino: this.destino}

    this.service.adicionar(valorEmitir).subscribe(
      (resultado) => {
        this.limparCampos();
        this.router.navigateByUrl('extrato');
      },
      (error) => console.error(error)
    );
  }

  limparCampos() {
    this.valor = 0;
    this.destino = 0;
  }
}
