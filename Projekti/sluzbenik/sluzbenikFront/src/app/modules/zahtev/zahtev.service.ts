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
export class ZahtevService {

  url: string = `${environment.baseUrl}/zahtev`;

  constructor(
    private http: HttpClient
  ) { }

  addZahtev(xml: any): Observable<any> {
    return this.http.post<any>(this.url, xml, {
      headers: headers
    });
  }

  getZahtevi(): Observable<any> {
    return this.http.get(this.url, {
      headers: headers,
      responseType: 'text'
    });
  }
}
