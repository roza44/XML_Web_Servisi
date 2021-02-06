import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

const headers = new HttpHeaders({
  'Content-Type': 'application/xml'
});

@Injectable({
  providedIn: 'root'
})
export class ObavestenjeService {

  url: string = `${environment.baseUrl}/obavestenje`;

  constructor(
    private http: HttpClient
  ) { }

  addObavestenje(xmlStr: string, forWho: string):  Observable<any> {
    const newUrl = this.url + `/${forWho}`;
    return this.http.post(newUrl, xmlStr, {
      headers: headers
    });
  }

  getUserObavestenja(): Observable<any> {
    const newUrl = this.url + '/user';
    return this.http.get(newUrl, {
      headers: headers,
      responseType: 'text'
    });
  }

}
