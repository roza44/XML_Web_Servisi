import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ObavestenjeRoutingModule } from './obavestenje-routing.module';
import { AddObavestenjeComponent } from './components/add-obavestenje/add-obavestenje.component';
import { ButtonModule } from 'primeng/button';
import { UserObavestenjaComponent } from './components/user-obavestenja/user-obavestenja.component';

import {CardModule} from 'primeng/card';

import {TableModule} from 'primeng/table';
import { SluzbenikObavestenjaComponent } from './components/sluzbenik-obavestenja/sluzbenik-obavestenja.component';


@NgModule({
  declarations: [ AddObavestenjeComponent, UserObavestenjaComponent, UserObavestenjaComponent, SluzbenikObavestenjaComponent ],
  imports: [
    CommonModule,
    ObavestenjeRoutingModule,
    ButtonModule,
    CardModule,
    TableModule
  ]
})
export class ObavestenjeModule { }
