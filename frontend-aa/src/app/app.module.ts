import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ToastrModule } from 'ngx-toastr';


import { AuthModule } from './auth/auth.module';
import { CanchasModule } from './canchas/canchas.module';



@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    ToastrModule.forRoot(
      {
        preventDuplicates: true,
      }
    ),
    AuthModule,
    CanchasModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
