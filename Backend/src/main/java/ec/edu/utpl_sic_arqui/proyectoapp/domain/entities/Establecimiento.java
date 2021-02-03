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
public class Establecimiento {
   
    private String direccion;  
    private String latitud;
    private String longitud;
    private String telefono;
    private String num_canchas;
    private String horario;
    private Estado estado;
    private List<Cancha> canchas = new ArrayList<Cancha> ();

    public Establecimiento(String direccion, String latitud, String longitud, String telefono, String num_canchas, String horario, Estado estado) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.telefono = telefono;
        this.num_canchas = num_canchas;
        this.horario = horario;
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNum_canchas() {
        return num_canchas;
    }

    public void setNum_canchas(String num_canchas) {
        this.num_canchas = num_canchas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Cancha> getCanchas() {
        return canchas;
    }

    public void setCanchas(List<Cancha> canchas) {
        this.canchas = canchas;
    }
    
    
}
