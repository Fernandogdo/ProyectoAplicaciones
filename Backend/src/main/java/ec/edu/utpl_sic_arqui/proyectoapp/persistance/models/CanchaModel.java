package ec.edu.utpl_sic_arqui.proyectoapp.persistance.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = CanchaModel.TABLE_NAME)
public class CanchaModel implements Serializable{
    public static final String TABLE_NAME = "cancha";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;
    private EstadoModel estado;
    private float costo_cancha;
    
    @OneToMany(mappedBy="cancha", cascade = CascadeType.ALL)
    private Set<EstablecimientoModel> establecimiento;


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public EstadoModel getEstado() {
        return estado;
    }

    public void setEstado(EstadoModel estado) {
        this.estado = estado;
    }

    public Set<EstablecimientoModel> getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Set<EstablecimientoModel> establecimiento) {
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
