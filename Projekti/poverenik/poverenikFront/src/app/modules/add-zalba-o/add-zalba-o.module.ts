import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AddZalbaORoutingModule } from './add-zalba-o-routing.module';
import { AddZalbaOComponent } from './pages/add-zalba-o.component';

@NgModule({
  declarations: [ AddZalbaOComponent ],
  imports: [
    CommonModule,
    AddZalbaORoutingModule
  ]
})
export class AddZalbaOModule { }
