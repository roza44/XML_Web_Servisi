import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ZalbaCRoutingModule } from './zalba-c-routing.module';
import { AddZalbaCComponent } from './components/add-zalba-c/add-zalba-c.component';
import {ButtonModule} from 'primeng/button';


@NgModule({
  declarations: [ AddZalbaCComponent ],
  imports: [
    CommonModule,
    ZalbaCRoutingModule,
    ButtonModule
  ]
})
export class ZalbaCModule { }
