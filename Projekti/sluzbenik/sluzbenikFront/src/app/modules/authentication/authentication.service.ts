import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { environment } from '../../../environments/environment';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { tap } from 'rxjs/operators';
import { LoginDTO } from './model';

const headers = new HttpHeaders({'Content-Type': 'application/xml'});

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  url:String = `${environment.baseUrl}/auth`

  constructor(
      private http: HttpClient,
    ) { }

  register(request: any): Observable<any> {
    const registerUrl = this.url + '/register';
    return this.http.post<any>(registerUrl, request, {
      headers: headers
    });
  }

  
  login(request: any): Observable<any> {
    const loginUrl = this.url + '/login';
    return this.http.post(loginUrl, request, {
      headers: headers,
      responseType: 'text',
    });
  }

  getUserInfo() {
    if(this.isLogedIn()) {
      let userInfo:LoginDTO = JSON.parse(localStorage.getItem('currentUser'));
      return userInfo;
    }
    return null;
  }

  isLogedIn():boolean {
    return   localStorage.getItem('currentUser') !== null;
  }

  logout() {
    localStorage.removeItem('currentUser');
  }
}
