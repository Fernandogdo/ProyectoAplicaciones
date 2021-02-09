import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';
import Swal from 'sweetalert2';

import { EstablecimientoService } from 'src/app/services/establecimiento.service';

@Component({
  selector: 'app-establecimiento',
  templateUrl: './establecimiento.component.html',
  styleUrls: ['./establecimiento.component.css']
})
export class EstablecimientoComponent implements OnInit {

  public establecimientoForm = this.fb.group({
    nombre: ['Canchita', Validators.required],
    direccion: ['Av. Pio Jaramillo', Validators.required],
    latitud: ['1234533', Validators.required],
    longitud: ['1234555', Validators.required],
    telefono: ['09765434', Validators.required],
    num_canchas: ['2', Validators.required],
    horario: ['12:12', Validators.required],
    estadoEsta: ['Abierto', Validators.required],
    // costo_cancha: ['20', Validators.required],
    // num_cancha: ['Cancha 1', Validators.required],
    // estadoCancha: ['Disponible', Validators.required],
    canchaG: this.fb.array([], Validators.required)
  });


  get canchasArr() {
    return this.establecimientoForm.get('canchaG') as FormArray;
  }

  constructor(
    private fb: FormBuilder,
    private toastr: ToastrService,
    private estableService: EstablecimientoService
  ) { }
  ngOnInit(): void {
  }

  agregarCanchas(): void {
    this.canchasArr.push(this.newCancha());
    this.newCancha().reset();

  }

  crearEstablecimiento(): void {
    if (this.establecimientoForm.invalid) { return; }
    Swal.fire({
      allowOutsideClick: false,
      text: 'Espere porfavor.. ',
      icon: 'info',
    });
    Swal.showLoading();
    const{nombre} = this.establecimientoForm.value
    this.estableService.crearEstablecimiento(this.establecimientoForm.value)
      .subscribe(resp => {
        console.log(resp);
        Swal.close();
        Swal.fire('Se creo el establecimiento!', nombre , 'success');
      }, (err) => {
        console.log(err);
        Swal.close();
        Swal.fire('Error al crear establecimiento!', err, 'error');

      });
  }

  public campoEsValido(campo: string): any {
    return this.establecimientoForm.controls[campo].errors
      && this.establecimientoForm.controls[campo].touched;
  }

  private newCancha(): FormGroup {
    return this.fb.group({
      costocancha: ['20', Validators.required],
      numcancha: ['Cancha 1', Validators.required],
      estado: ['Disponible', Validators.required]
    });
  }

}
