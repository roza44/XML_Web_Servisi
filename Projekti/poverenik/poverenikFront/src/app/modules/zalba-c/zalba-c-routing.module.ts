import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthenticationGuard } from 'src/app/guards/authentication-guard/authentication.guard';
import { AddZalbaCComponent } from './components/add-zalba-c/add-zalba-c.component';

const routes: Routes = [

  {
    path: 'add',
    component: AddZalbaCComponent,
    canActivate: [AuthenticationGuard],
    data: { expectedRoles: ["ROLE_GRADJANIN"] }
  }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ZalbaCRoutingModule { }
