import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';

import Swal from 'sweetalert2';

import { CuentaService } from 'src/app/services/cuenta.service';

@Component({
  selector: 'app-cuenta',
  templateUrl: './cuenta.component.html',
  styleUrls: ['./cuenta.component.css'],
})
export class CuentaComponent implements OnInit {

  public cuentaForm = this.fb.group({
    nombres_apellidos: ['Aranda Nelson', Validators.required],
    celular: ['09765434', Validators.required],
    correo: ['correoh@gmail.com', Validators.required],
    contrasenia: ['1234', Validators.required],
    contrasenia2: ['1234', Validators.required],
  });

  constructor(
    private fb: FormBuilder,
    private toastr: ToastrService,
    private cuentaService: CuentaService,
    private router: Router
  ) { }
  ngOnInit(): void {

  }

  crearCancha(): void {
    if (this.cuentaForm.invalid) { return; }
    Swal.fire({
      allowOutsideClick: false,
      text: 'Espere porfavor.. ',
      icon: 'info',
    });

    Swal.showLoading();

    this.cuentaService.crearCuenta(this.cuentaForm.value)
      .subscribe(response => {
        Swal.close();
        this.router.navigateByUrl('/inicio');
      }, (error) => {
        console.log(error);
        Swal.close();
        this.toastr.error('No se pudo crear la cuenta', 'Error', {
          closeButton: true,
          progressBar: true,
        });
      });
  }

}
