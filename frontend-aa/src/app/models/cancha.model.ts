import { Estado } from './estado.model';

export class Cancha {

  constructor(
    // tslint:disable-next-line: variable-name
    public numcancha: string,
    public costocancha: number,
    // tslint:disable-next-line: variable-name
    public estado: Estado,
    public id?: string,
  ) { }
}
