/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl_sic_arqui.proyectoapp.domain.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */

public class Cuenta_Encargado  extends Cuenta{
    private List<Reserva> reservas = new ArrayList<Reserva> ();

    public Cuenta_Encargado(String nombres_apellidos, String celular, String correo, String contrasenia) {
        super(nombres_apellidos, celular, correo, contrasenia);
    }
    
}