import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {MenuItem} from 'primeng/api'; 
import { AuthenticationService } from 'src/app/modules/authentication/authentication.service';
import { LoginDTO } from 'src/app/modules/authentication/model';

@Component({
  selector: 'app-menu-bar',
  templateUrl: './menu-bar.component.html',
  styleUrls: ['./menu-bar.component.scss']
})
export class MenuBarComponent {

    constructor(private authenticationService: AuthenticationService,
                private router: Router) { }

    items: MenuItem[];
    authenticated: boolean;

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
    ];

    userItems:MenuItem[] = [
        {
            label:'Zalba na odluku',
            icon: 'pi pi-file-o',
            routerLink: ['zalba-o/add']
        },
        {
            label: 'View Documents',
            icon: 'pi pi-list',
            routerLink: ['register']
        }
    ]

    

    ngOnInit() {
        this.authenticationService.currentUser.subscribe(user => this.update(user));
    }

    update(userInfo: LoginDTO) {
        if (!!userInfo) {
            this.authenticated = true;
            if (this.checkRole(userInfo, "ROLE_GRADJANIN")) {
              this.items = [
                ...this.userItems
              ];
              this.router.navigate(['zalba-o/add']);
            }
          }
          else {
            this.authenticated = false;
            this.items = [
              ...this.unauthorizedUserItems
            ];
          }
    }

    checkRole(user: LoginDTO, expectedRole:string) {
        return user.roles === expectedRole;
    }

    logout() {
        this.authenticationService.logout();
    }
}
