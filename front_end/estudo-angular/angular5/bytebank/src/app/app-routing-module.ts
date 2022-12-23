import { ExtratoComponent } from './extrato/extrato.component';
import { NgModule } from "@angular/core";
import { Router, RouterModule } from "@angular/router";
import { Routes } from '@angular/router';
import { NovaTransferenciaComponent } from './nova-transferencia/nova-trasferencia.component';

export const routes: Routes = [
  {path: '', redirectTo: 'extrato', pathMatch: 'full'},
  {path: 'extrato', component: ExtratoComponent},
  {path: 'nova-transferencia', component: NovaTransferenciaComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule{}
