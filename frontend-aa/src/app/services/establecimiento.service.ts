import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Establecimiento } from '../models/establecimiento.model';

import { environment } from '../../environments/environment';
import { Cancha } from '../models/cancha.model';
import { Estado } from '../models/estado.model';
import { Cuenta } from '../models/cuenta.model';

@Injectable({
  providedIn: 'root'
})
export class EstablecimientoService {

  private baseUrl = environment.baseUrl;


  constructor(private http: HttpClient) { }

  public crearEstablecimiento(data: any): Observable<Establecimiento> {
    // console.log(data);
    const {
      nombre, direccion, latitud, longitud, telefono, num_canchas,
      horario, estadoEsta, costo_cancha, num_cancha, estadoCancha
    } = data;
    const stateCancha: Estado = new Estado(estadoCancha);
    const stateEstable: Estado = new Estado(estadoEsta);
    const cancha: Cancha = new Cancha(costo_cancha, num_cancha, stateCancha);
    const cuenta: Cuenta = new Cuenta('Aranda Nelson', '09887666', 'tester@gmail.com', '1sedd/ewed');

    const establecimientoNew: Establecimiento =
      new Establecimiento(nombre, direccion,
        latitud, longitud, telefono, num_canchas,
        horario, stateEstable, cuenta, cancha
      );
    console.log(establecimientoNew);

    return this.http.post<Establecimiento>(this.baseUrl, establecimientoNew);
  }
}
