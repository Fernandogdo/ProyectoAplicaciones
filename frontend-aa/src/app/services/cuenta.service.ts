import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Cuenta } from '../models/cuenta.model';

import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CuentaService {
  
  private baseUrl = environment.baseUrl;

  constructor(private http: HttpClient) { }

  public crearCuenta(data: any): Observable<Cuenta> {
    const headers = new HttpHeaders()
      .append('Content-Type', 'application/json')
      .append('Access-Control-Allow-Headers', 'Content-Type')
      .append('Access-Control-Allow-Methods', 'POST')
      .append('Access-Control-Allow-Origin', '*');

    const { nombres_apellidos, celular, correo, contrasenia } = data;
    this.baseUrl = `${this.baseUrl}/cuenta`;
    

    localStorage.setItem('cuenta', JSON.stringify(data) );
    
    return this.http.post<Cuenta>(this.baseUrl, data, {headers});
  
  }  
}
