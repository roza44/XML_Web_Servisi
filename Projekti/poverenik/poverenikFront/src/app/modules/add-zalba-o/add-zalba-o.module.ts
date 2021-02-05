import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AddZalbaORoutingModule } from './add-zalba-o-routing.module';
import { AddZalbaOComponent } from './pages/add-zalba-o/add-zalba-o.component';
import {ButtonModule} from 'primeng/button';

@NgModule({
  declarations: [ AddZalbaOComponent ],
  imports: [
    CommonModule,
    AddZalbaORoutingModule,
    ButtonModule
  ]
})
export class AddZalbaOModule { }
