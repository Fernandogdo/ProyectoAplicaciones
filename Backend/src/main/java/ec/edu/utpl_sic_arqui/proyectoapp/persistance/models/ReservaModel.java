package ec.edu.utpl_sic_arqui.proyectoapp.persistance.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = ReservaModel.TABLE_NAME)
public class ReservaModel implements Serializable {

    public static final String TABLE_NAME = "reserva";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;
    private String tiempo_uso;
    private String hora_llegada;
    private String hora_salida;
    private String valor_cancelar;

    @NotNull(message = "la región no puede ser vacia")
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private CuentaModel cuenta;
    
    @NotNull(message = "la región no puede ser vacia")
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private CanchaModel cancha;

    @NotNull(message = "la región no puede ser vacia")
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private EstadoModel estado;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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

    public String getValor_cancelar() {
        return valor_cancelar;
    }

    public void setValor_cancelar(String valor_cancelar) {
        this.valor_cancelar = valor_cancelar;
    }

    public EstadoModel getEstado() {
        return estado;
    }

    public void setEstado(EstadoModel estado) {
        this.estado = estado;
    }

    public CuentaModel getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaModel cuenta) {
        this.cuenta = cuenta;
    }

    public CanchaModel getCancha() {
        return cancha;
    }

    public void setCancha(CanchaModel cancha) {
        this.cancha = cancha;
    }

    private static final long serialVersionUID = 1L;
}
