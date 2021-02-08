import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CanchasComponent } from './canchas.component';
import { EstablecimientoComponent } from './pages/establecimiento/establecimiento.component';
import { GcanchasComponent } from './pages/gcanchas/gcanchas.component';

const routes: Routes = [
  {
    path: '',
    component: CanchasComponent,
    children: [
      { path: 'establecimiento', component: EstablecimientoComponent },
      { path: 'canchas', component: GcanchasComponent },
      { path: '**', redirectTo: '' },
    ]
  },

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CanchasRoutingModule { }
