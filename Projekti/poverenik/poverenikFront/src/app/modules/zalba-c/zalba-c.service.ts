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
export class ZalbaCService {

  url: string = `${environment.baseUrl}/zalbaNaCutanje`;

  constructor( private http: HttpClient) { }

  addZalbaNaCutanje(xml:any): Observable<any> {
    return this.http.post<any>(this.url, xml, {
      headers: headers
    });
  }

}
