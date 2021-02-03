import { Component, OnInit } from '@angular/core';
import {MenuItem} from 'primeng/api'; 

@Component({
  selector: 'app-menu-bar',
  templateUrl: './menu-bar.component.html',
  styleUrls: ['./menu-bar.component.scss']
})
export class MenuBarComponent {

    items: MenuItem[];

    unauthorizedUserItems:MenuItem[] = [
        {
            label:'Log In',
            icon: 'pi pi-sign-in',
            routerLink: ['']
        },
        {
            label: 'Register',
            icon: 'pi pi-user-plus',
            routerLink: ['register']
        }
    ]

    ngOnInit() {
        this.items = this.unauthorizedUserItems;
    }
}