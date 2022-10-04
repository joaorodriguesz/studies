/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { DiretivaNgifComponent } from './diretiva-ngif.component';

describe('DiretivaNgifComponent', () => {
  let component: DiretivaNgifComponent;
  let fixture: ComponentFixture<DiretivaNgifComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DiretivaNgifComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DiretivaNgifComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
