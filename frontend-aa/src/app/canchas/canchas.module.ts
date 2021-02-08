import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CanchasRoutingModule } from './canchas-routing.module';
import { CanchasComponent } from './canchas.component';
import { SharedModule } from '../shared/shared.module';
import { EstablecimientoComponent } from './pages/establecimiento/establecimiento.component';
import { GcanchasComponent } from './pages/gcanchas/gcanchas.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [CanchasComponent, EstablecimientoComponent, GcanchasComponent],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
    CanchasRoutingModule,
    SharedModule
  ]
})
export class CanchasModule { }
