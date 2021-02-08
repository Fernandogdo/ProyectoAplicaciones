import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CuentaComponent } from './pages/cuenta/cuenta.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: 'cuenta', component: CuentaComponent },
      { path: '**', redirectTo: 'cuenta' },
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AuthRoutingModule { }
