import { Cancha } from './cancha.model';
import { Cuenta } from './cuenta.model';
import { Estado } from './estado.model';

export class Establecimiento {

  constructor(
    public nombre: string,
    public direccion: string,
    public latitud: string,
    public longitud: string,
    public telefono: string,
    // tslint:disable-next-line: variable-name
    public num_canchas: string,
    public horario: string,
    public estado: Estado,
    public cuenta: Cuenta,
    public canchas: Cancha,
    public id?: string,
  ) { }
}
