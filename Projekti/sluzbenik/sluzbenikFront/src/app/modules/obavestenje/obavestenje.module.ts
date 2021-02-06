import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ObavestenjeRoutingModule } from './obavestenje-routing.module';
import { AddObavestenjeComponent } from './components/add-obavestenje/add-obavestenje.component';
import { ButtonModule } from 'primeng/button';


@NgModule({
  declarations: [ AddObavestenjeComponent ],
  imports: [
    CommonModule,
    ObavestenjeRoutingModule,
    ButtonModule
  ]
})
export class ObavestenjeModule { }
