
export class Cuenta {

  constructor(
    // tslint:disable-next-line: variable-name
    public nombres_apellidos: string,
    public celular: string,
    public correo: string,
    public contrasenia: string,
    public id?: string,
  ) { }
}
