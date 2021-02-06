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
export class ResenjeService {

  url: string = `${environment.baseUrl}/resenje`;

  constructor(
    private http: HttpClient
  ) { }


  addResenje(xmlStr: string, forWho: string):  Observable<any> {
    const newUrl = this.url;
    return this.http.post(newUrl, xmlStr, {
      headers: headers
    });
  }
}
