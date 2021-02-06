import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AddZalbaORoutingModule } from './add-zalba-o-routing.module';
import { AddZalbaOComponent } from './pages/add-zalba-o/add-zalba-o.component';
import {ButtonModule} from 'primeng/button';
import { ZalbeComponent } from './pages/zalbe/zalbe.component';
import {CardModule} from 'primeng/card';

import {TableModule} from 'primeng/table';

@NgModule({
  declarations: [ AddZalbaOComponent, ZalbeComponent, ZalbeComponent ],
  imports: [
    CommonModule,
    AddZalbaORoutingModule,
    ButtonModule,
    CardModule,
    TableModule
  ]
})
export class AddZalbaOModule { }
