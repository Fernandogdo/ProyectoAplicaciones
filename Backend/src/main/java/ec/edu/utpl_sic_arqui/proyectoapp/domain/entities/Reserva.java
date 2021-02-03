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
public class Reserva {
   
    private String tiempo_uso;
    private String hora_llegada;
    private String hora_salida;
    private float valor_cancelar;
    private Cancha cancha;

    public Reserva(String tiempo_uso, String hora_llegada, String hora_salida, float valor_cancelar, Cancha cancha) {
        this.tiempo_uso = tiempo_uso;
        this.hora_llegada = hora_llegada;
        this.hora_salida = hora_salida;
        this.valor_cancelar = valor_cancelar;
        this.cancha = cancha;
    }
    
    

    public String getTiempo_uso() {
        return tiempo_uso;
    }

    public void setTiempo_uso(String tiempo_uso) {
        this.tiempo_uso = tiempo_uso;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public float getValor_cancelar() {
        return valor_cancelar;
    }

    public void setValor_cancelar(float valor_cancelar) {
        this.valor_cancelar = valor_cancelar;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

}
