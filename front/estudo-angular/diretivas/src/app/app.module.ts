import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { DiretivaNgifComponent } from './diretiva-ngif/diretiva-ngif.component';
import { DiretivaNgswitchComponent } from './diretiva-ngswitch/diretiva-ngswitch.component';
import { DiretivaNgforComponent } from './diretiva-ngfor/diretiva-ngfor.component';

@NgModule({
  declarations: [
    AppComponent,
      DiretivaNgifComponent,
      DiretivaNgswitchComponent,
      DiretivaNgforComponent,
   ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
