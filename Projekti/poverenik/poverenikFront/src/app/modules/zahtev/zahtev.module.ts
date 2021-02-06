import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddZahtevComponent } from './pages/add-zahtev/add-zahtev.component';
import { ZahtevRoutingModule } from './zahtev-routing.module';
import { ButtonModule } from 'primeng/button';



@NgModule({
  declarations: [AddZahtevComponent],
  imports: [
    CommonModule,
    ZahtevRoutingModule,
    ButtonModule
  ]
})
export class ZahtevModule { }
