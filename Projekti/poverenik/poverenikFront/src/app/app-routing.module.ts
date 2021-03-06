import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
    {
      path: '',
      loadChildren: () => import('./modules/authentication/authentication.module').then(m => m.AuthenticationModule)
    },

    {
      path: 'zalba-o',
      loadChildren: () => import('./modules/add-zalba-o/add-zalba-o.module').then(m => m.AddZalbaOModule)
    },

    {
      path: 'zalba-c',
      loadChildren: () => import('./modules/zalba-c/zalba-c.module').then(m => m.ZalbaCModule)
    },

    {
      path: 'resenje',
      loadChildren: () => import('./modules/resenje/resenje.module').then(m => m.ResenjeModule)
    },

    { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
