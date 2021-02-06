import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddZahtevComponent } from './pages/add-zahtev/add-zahtev.component';

const routes: Routes = [
    {
        path: 'add',
        component: AddZahtevComponent
    }
]

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ZahtevRoutingModule { }