import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { AuthenticationService } from 'src/app/modules/authentication/authentication.service';
import { LoginDTO } from 'src/app/modules/authentication/model';

@Component({
  selector: 'app-menu-bar',
  templateUrl: './menu-bar.component.html',
  styleUrls: ['./menu-bar.component.scss']
})
export class MenuBarComponent {

  constructor(
    private authenticationService: AuthenticationService,
    private router: Router
  ) { }

  items: MenuItem[];
  authenticated: boolean;

  unauthorizedUserItems: MenuItem[] = [
    {
      label: 'Log In',
      icon: 'pi pi-sign-in',
      routerLink: ['']
    },
    {
      label: 'Register',
      icon: 'pi pi-user-plus',
      routerLink: ['register']
    }
  ];

  userItems: MenuItem[] = [

    {
      label: 'Add Zahtev',
      icon: 'pi pi-file-o',
      routerLink: ['zahtev/add']
    },
    {
      label: 'View Documents',
      icon: 'pi pi-list',
      routerLink: ['zahtev/add']
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
        this.router.navigate(['zahtev/add']);
      }
    }
    else {
      this.authenticated = false;
      this.items = [
        ...this.unauthorizedUserItems
      ];
    }
  }

  checkRole(user: LoginDTO, expectedRole: string) {
    return user.roles === expectedRole;
  }

  logout() {
    this.authenticationService.logout();
  }
}
