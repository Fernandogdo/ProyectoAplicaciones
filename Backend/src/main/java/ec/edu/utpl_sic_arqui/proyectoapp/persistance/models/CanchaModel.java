package ec.edu.utpl_sic_arqui.proyectoapp.persistance.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = CanchaModel.TABLE_NAME)
public class CanchaModel implements Serializable {

    public static final String TABLE_NAME = "cancha";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;

    private float costo_cancha;
    private String num_cancha;

    @NotNull(message = "la región no puede ser vacia")
    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private EstadoModel estado;

    @JsonIgnoreProperties(value = {"canchas", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private EstablecimientoModel establecimiento;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNum_cancha() {
        return num_cancha;
    }

    public void setNum_cancha(String num_cancha) {
        this.num_cancha = num_cancha;
    }

    public EstadoModel getEstado() {
        return estado;
    }

    public void setEstado(EstadoModel estado) {
        this.estado = estado;
    }

    public EstablecimientoModel getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(EstablecimientoModel establecimiento) {
        this.establecimiento = establecimiento;
    }

    public float getCosto_cancha() {
        return costo_cancha;
    }

    public void setCosto_cancha(float costo_cancha) {
        this.costo_cancha = costo_cancha;
    }

    private static final long serialVersionUID = 1L;
}
