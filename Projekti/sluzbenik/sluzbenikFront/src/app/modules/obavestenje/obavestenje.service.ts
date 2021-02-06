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

  addObavestenje(xmlStr: string):  Observable<any> {
    return this.http.post<any>(this.url, xmlStr, {
      headers: headers
    });
  }

}
