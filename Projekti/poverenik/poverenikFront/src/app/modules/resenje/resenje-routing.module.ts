import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthenticationGuard } from 'src/app/guards/authentication-guard/authentication.guard';
import { PoverenikResenjaComponent } from './components/poverenik-resenja/poverenik-resenja.component';

const routes: Routes = [


{
  path: 'poverenik-pregled',
  component: PoverenikResenjaComponent,
  canActivate: [AuthenticationGuard],
  data: { expectedRoles: ["ROLE_POVERENIK"] }
}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ResenjeRoutingModule { }
