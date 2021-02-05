import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddZalbaOComponent } from './pages/add-zalba-o/add-zalba-o.component';

const routes: Routes = [

{
  path: 'add',
  component: AddZalbaOComponent
}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AddZalbaORoutingModule { }
