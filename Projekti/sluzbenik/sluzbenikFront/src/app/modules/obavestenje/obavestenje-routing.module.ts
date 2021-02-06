import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthenticationGuard } from 'src/app/guards/authentication-guard/authentication.guard';
import { UserObavestenjaComponent } from './components/user-obavestenja/user-obavestenja.component';

const routes: Routes = [

{
  path: 'user-pregled',
  component: UserObavestenjaComponent,
  canActivate: [AuthenticationGuard],
  data: { expectedRoles: ["ROLE_GRADJANIN"] }
}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ObavestenjeRoutingModule { }
