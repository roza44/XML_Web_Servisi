import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthenticationGuard } from 'src/app/guards/authentication-guard/authentication.guard';
import { AddZalbaOComponent } from './pages/add-zalba-o/add-zalba-o.component';
import { ZalbeComponent } from './pages/zalbe/zalbe.component';

const routes: Routes = [

  {
    path: 'add',
    component: AddZalbaOComponent,
    canActivate: [AuthenticationGuard],
    data: { expectedRoles: ["ROLE_GRADJANIN"] }
  },

  {
    path: 'pregled',
    component: ZalbeComponent,
    canActivate: [AuthenticationGuard],
    data: { expectedRoles: ["ROLE_POVERENIK"] }
  },

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AddZalbaORoutingModule { }
