import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ZahtevRoutingModule } from './zahtev-routing.module';
import { ButtonModule } from 'primeng/button';
import { AddZahtevComponent } from './pages/add-zahtev/add-zahtev.component';
import { ZahteviComponent } from './pages/zahtevi/zahtevi.component';



@NgModule({
  declarations: [AddZahtevComponent, ZahteviComponent],
  imports: [
    CommonModule,
    ZahtevRoutingModule,
    ButtonModule
  ]
})
export class ZahtevModule { }
