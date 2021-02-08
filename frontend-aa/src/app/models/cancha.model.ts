import { Estado } from './estado.model';

export class Cancha {

  constructor(
    // tslint:disable-next-line: variable-name
    public costo_cancha: number,
    // tslint:disable-next-line: variable-name
    public num_cancha: string,
    public estado: Estado,
    public id?: string,
  ) { }
}
