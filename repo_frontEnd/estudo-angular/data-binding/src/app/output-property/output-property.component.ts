import { Component, ElementRef, EventEmitter, Input, OnInit, Output, ViewChild } from '@angular/core';

@Component({
  selector: 'contador',
  templateUrl: './output-property.component.html',
  styleUrls: ['./output-property.component.scss'],
  //Tambem é possivel declarar assim
 // outputs: ['mudouValor']
})
export class OutputPropertyComponent implements OnInit {
 //declarando que ira receber uma entrada no componente pelo atributo valor
 @Input() valor: number = 0;
//declarando que esta expondo o evento ao pai do componente
 @Output() mudouValor = new EventEmitter();

 @ViewChild('campoInput') campoValorInput!: ElementRef;

  constructor() { }

  ngOnInit(): void {
  }

  incrementa(){
    console.log(this.campoValorInput.nativeElement.value);

    this.campoValorInput.nativeElement.value++;
    this.mudouValor.emit({novoValor: this.campoValorInput.nativeElement.value})
  }

  decrementa(){
    this.campoValorInput.nativeElement.value--;
    this.mudouValor.emit({novoValor: this.campoValorInput.nativeElement.value})
  }

}
