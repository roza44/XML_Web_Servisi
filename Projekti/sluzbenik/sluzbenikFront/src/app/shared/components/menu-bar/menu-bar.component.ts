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
      label: 'Prijava',
      icon: 'pi pi-sign-in',
      routerLink: ['']
    },
    {
      label: 'Registracija',
      icon: 'pi pi-user-plus',
      routerLink: ['register']
    }
  ];

  userItems: MenuItem[] = [

    {
      label: 'Podnesi Zahtev',
      icon: 'pi pi-file-o',
      routerLink: ['zahtev/add']
    },
    {
      label: 'Pregled Zahteva',
      icon: 'pi pi-list',
      routerLink: ['zahtev/user-pregled']
    },
    {
      label: 'Pregled Obavestenja',
      icon: 'pi pi-list',
      routerLink: ['obavestenje/user-pregled']
    },
  ]

  sluzbenikItems: MenuItem[] = [
    {
      label: 'Pregled Zahteva',
      icon: 'pi pi-list',
      routerLink: ['zahtev/pregled']
    },
    {
      label: 'Pregled Obavestenja',
      icon: 'pi pi-list',
      routerLink: ['obavestenje/sluzbenik-pregled']
    },
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
      } else if(this.checkRole(userInfo, "ROLE_SLUZBENIK")) {
        this.items = [
          ...this.sluzbenikItems
        ];
        this.router.navigate(['zahtev/pregled']);
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
