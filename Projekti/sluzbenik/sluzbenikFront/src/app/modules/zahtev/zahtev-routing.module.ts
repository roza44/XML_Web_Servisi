import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthenticationGuard } from 'src/app/guards/authentication-guard/authentication.guard';
import { AddZahtevComponent } from './pages/add-zahtev/add-zahtev.component';
import { ZahteviComponent } from './pages/zahtevi/zahtevi.component';

const routes: Routes = [
    {
        path: 'add',
        component: AddZahtevComponent,
        canActivate: [AuthenticationGuard],
        data: { expectedRoles: ["ROLE_GRADJANIN"] }
    },
    {
        path: 'pregled',
        component: ZahteviComponent,
        canActivate: [AuthenticationGuard],
        data: { expectedRoles: ["ROLE_SLUZBENIK"] }
    }

]

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class ZahtevRoutingModule { }