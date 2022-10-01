import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CursosService {

  constructor() { }

  get cursos(){
    return ['java', 'angular','c++'];
  }
}
