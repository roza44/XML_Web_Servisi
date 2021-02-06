import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ResenjeRoutingModule } from './resenje-routing.module';
import { ButtonModule } from 'primeng/button';
import { PoverenikResenjaComponent } from './components/poverenik-resenja/poverenik-resenja.component';
import { AddResenjeComponent } from './components/add-resenje/add-resenje.component';

import {CardModule} from 'primeng/card';

import {TableModule} from 'primeng/table';


@NgModule({
  declarations: [PoverenikResenjaComponent, AddResenjeComponent],
  imports: [
    CommonModule,
    ResenjeRoutingModule,
    ButtonModule,
    CardModule,
    TableModule
  ]
})
export class ResenjeModule { }
