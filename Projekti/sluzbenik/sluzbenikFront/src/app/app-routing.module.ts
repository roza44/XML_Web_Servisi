import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./modules/authentication/authentication.module').then(m => m.AuthenticationModule)
  },

  {
    path: 'zahtev',
    loadChildren: () => import('./modules/zahtev/zahtev.module').then(m => m.ZahtevModule)
  },

  {
    path: 'obavestenje',
    loadChildren: () => import('./modules/obavestenje/obavestenje.module').then(m => m.ObavestenjeModule)
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
