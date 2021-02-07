/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl_sic_arqui.proyectoapp.domain.entities;

/**
 *
 * @author alexa
 */
public class Cuenta_Duenio extends Cuenta{

    public Cuenta_Duenio() {
    }

    
    public Cuenta_Duenio(String nombres_apellidos, String celular, String correo, String contrasenia) {
        super(nombres_apellidos, celular, correo, contrasenia);
    }
    
}
