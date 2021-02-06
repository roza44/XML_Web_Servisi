import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthenticationGuard } from 'src/app/guards/authentication-guard/authentication.guard';
import { SluzbenikObavestenjaComponent } from './components/sluzbenik-obavestenja/sluzbenik-obavestenja.component';
import { UserObavestenjaComponent } from './components/user-obavestenja/user-obavestenja.component';

const routes: Routes = [

{
  path: 'user-pregled',
  component: UserObavestenjaComponent,
  canActivate: [AuthenticationGuard],
  data: { expectedRoles: ["ROLE_GRADJANIN"] }
},
{
  path: 'sluzbenik-pregled',
  component: SluzbenikObavestenjaComponent,
  canActivate: [AuthenticationGuard],
  data: { expectedRoles: ["ROLE_SLUZBENIK"] }
}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ObavestenjeRoutingModule { }
