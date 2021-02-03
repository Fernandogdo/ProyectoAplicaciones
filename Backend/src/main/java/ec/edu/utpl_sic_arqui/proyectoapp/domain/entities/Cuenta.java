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
public class Cuenta {
    
    private String nombres_apellidos;
    private String celular;
    private String correo;
    private String contrasenia;

    public Cuenta(String nombres_apellidos, String celular, String correo, String contrasenia) {
        this.nombres_apellidos = nombres_apellidos;
        this.celular = celular;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public String getNombres_apellidos() {
        return nombres_apellidos;
    }

    public void setNombres_apellidos(String nombres_apellidos) {
        this.nombres_apellidos = nombres_apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
}
