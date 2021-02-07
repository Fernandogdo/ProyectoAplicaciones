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
    private String numcancha; 
    private float costocancha;
    private Estado estado;

    public Cancha(String numcancha, float costocancha, Estado estado) {
        this.numcancha = numcancha;
        this.costocancha = costocancha;
        this.estado = estado;
    }

    public Cancha() {
    }

    public String getNumcancha() {
        return numcancha;
    }

    public void setNumcancha(String numcancha) {
        this.numcancha = numcancha;
    }

    public float getCostocancha() {
        return costocancha;
    }

    public void setCostocancha(float costocancha) {
        this.costocancha = costocancha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cancha{" + "numcancha=" + numcancha + ", costocancha=" + costocancha + ", estado=" + estado + '}';
    }

    
 

}