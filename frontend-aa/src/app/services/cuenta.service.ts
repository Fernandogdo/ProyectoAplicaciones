import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

import { Cuenta } from '../models/cuenta.model';

import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CuentaService {
  private baseUrl = environment.baseUrl;

  constructor(private http: HttpClient) { }

  public crearCuenta(data: any): Observable<Cuenta> {
    console.log(data);
    const { nombres_apellidos, celular, correo, contrasenia } = data;
    return this.http.post<Cuenta>(this.baseUrl, data);
  }
}
