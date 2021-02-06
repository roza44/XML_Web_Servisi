import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ZahtevRoutingModule } from './zahtev-routing.module';
import { ButtonModule } from 'primeng/button';
import { AddZahtevComponent } from './pages/add-zahtev/add-zahtev.component';
import { ZahteviComponent } from './pages/zahtevi/zahtevi.component';
import {CardModule} from 'primeng/card';

import {TableModule} from 'primeng/table';
import { UserZahteviComponent } from './pages/user-zahtevi/user-zahtevi.component';


@NgModule({
  declarations: [AddZahtevComponent, ZahteviComponent, UserZahteviComponent, UserZahteviComponent],
  imports: [
    CommonModule,
    ZahtevRoutingModule,
    ButtonModule,
    CardModule,
    TableModule
  ]
})
export class ZahtevModule { }
