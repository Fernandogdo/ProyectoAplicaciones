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
public class Cancha {
   
    private String disponibilidad;
    private float costo_cancha;
    private Estado estado;
    private Establecimiento establecimiento;

    public Cancha(String disponibilidad, float costo_cancha, Estado estado, Establecimiento establecimiento) {
        this.disponibilidad = disponibilidad;
        this.costo_cancha = costo_cancha;
        this.estado = estado;
        this.establecimiento = establecimiento;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public float getCosto_cancha() {
        return costo_cancha;
    }

    public void setCosto_cancha(float costo_cancha) {
        this.costo_cancha = costo_cancha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }
    
    
}

