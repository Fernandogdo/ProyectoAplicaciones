import { element } from 'protractor';
import { HttpClient, HttpHeaders} from '@angular/common/http';
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

  URL = 'http://localhost:8081/api/establecimiento';

  private arrayCanchas: Cancha[] = [];

  constructor(private http: HttpClient) {}

  get cuentaStorage(): any {
    return localStorage.getItem('cuenta') || '';
  }
  
  public crearEstablecimiento(data: any): Observable<Establecimiento> {
    // console.log(data);
    const headers = new HttpHeaders()
    .append('Content-Type', 'application/json')
    .append('Access-Control-Allow-Headers', 'Content-Type')
    .append('Access-Control-Allow-Methods', 'POST')
    .append('Access-Control-Allow-Origin', '*');

    const {
      nombre, direccion, latitud, longitud, telefono, num_canchas,
      horario, estadoEsta, costo_cancha, num_cancha, estadoCancha
    } = data;
    
    this.baseUrl = `${this.baseUrl}/establecimiento`;
    const cuentaStorage:any = localStorage.getItem('cuenta') || '';
    const cuentaTraer = JSON.parse(cuentaStorage);
  
    const { canchaG } = data;
    
    canchaG.forEach((element: Cancha) => {
      const canchaArr = new Cancha(element.numcancha, element.costocancha, element.estado);
      console.log('CANCHA ONJ', canchaArr);
      this.arrayCanchas.push(canchaArr);
    });

    // const stateCancha: Estado = new Estado(estadoCancha);
    const stateEstable: Estado = new Estado(estadoEsta);
    // const cancha: Cancha = new Cancha(num_cancha, costo_cancha, stateCancha);
    const cuenta: Cuenta = new Cuenta(cuentaTraer.nombres_apellidos, cuentaTraer.celular, cuentaTraer.correo , cuentaTraer.contrasenia);
    console.log('OBJCUENTA', cuenta);
    // const canchaList: Cancha[]=[];
    // canchaList.push(cancha)
    const establecimientoNew: Establecimiento =
      new Establecimiento(nombre, direccion,
        latitud, longitud, telefono, num_canchas,
        horario, stateEstable, cuenta, this.arrayCanchas
      );

  
    
    // console.log(establecimientoNew);

    return this.http.post<Establecimiento>(this.URL, establecimientoNew, {headers});
  }

  
}
