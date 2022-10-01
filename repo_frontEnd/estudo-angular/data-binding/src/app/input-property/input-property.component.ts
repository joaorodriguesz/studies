import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-curso',
  templateUrl: './input-property.component.html',
  styleUrls: ['./input-property.component.scss'],
  //tambe é possivel fazer assim
  //inputs: ['nomeCurso:nome']
})
export class InputPropertyComponent implements OnInit {
  //internamente como nomeCurso e externamente como nome
  @Input('nome')
  nomeCurso: string = '';

  constructor() { }

  ngOnInit(): void {
  }

}
