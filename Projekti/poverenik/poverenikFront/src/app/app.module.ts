import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { HttpClientModule } from '@angular/common/http';
import { MessageService } from 'primeng/api';

import {ToastModule} from 'primeng/toast';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { InterceptorsModule } from './interceptors/interceptors.module'
import { GuardModule } from './guards/guard.module';
import { AddZalbaOModule } from './modules/add-zalba-o/add-zalba-o.module';
import { ZalbaCModule } from './modules/zalba-c/zalba-c.module';
import { ResenjeModule } from './modules/resenje/resenje.module'

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SharedModule,
    HttpClientModule,
    ToastModule,
    BrowserAnimationsModule,
    InterceptorsModule,
    GuardModule,
    AddZalbaOModule,
    ZalbaCModule,
    ResenjeModule
  ],
  providers: [MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
