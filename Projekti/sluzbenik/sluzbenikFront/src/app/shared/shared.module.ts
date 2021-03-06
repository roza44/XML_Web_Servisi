import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {MenubarModule} from 'primeng/menubar';
import {MenuBarComponent} from './components/menu-bar/menu-bar.component'
import {ButtonModule} from 'primeng/button';
import {RouterModule} from '@angular/router';
import { XmlViewComponent } from './components/xml-view/xml-view.component';


@NgModule({
  declarations: [
    MenuBarComponent,
    XmlViewComponent,
    XmlViewComponent
  ],
  imports: [
    CommonModule,
    MenubarModule,
    ButtonModule,
    RouterModule
  ],
  exports: [MenuBarComponent]
})
export class SharedModule { }
