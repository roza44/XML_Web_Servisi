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
export class AddZalbaOService {

  url: string = `${environment.baseUrl}/zalbaNaOdluku`;

  constructor( private http: HttpClient) { }

  addZalbaNaOdluku(xml:any): Observable<any> {
    return this.http.post<any>(this.url, xml, {
      headers: headers
    });
  }
}
