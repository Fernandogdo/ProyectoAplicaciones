package ec.edu.utpl_sic_arqui.proyectoapp.persistance.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = EstablecimientoModel.TABLE_NAME)
public class EstablecimientoModel implements Serializable {

    public static final String TABLE_NAME = "establecimiento";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;
    
    private String direccion;
    private String latitud;
    private String longitud;
    private String telefono;
    private String num_canchas;
    private String horario;
    
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "estado", referencedColumnName = "id")
   
    @OneToMany(mappedBy="establecimiento", cascade = CascadeType.ALL)
    private Set<EstadoModel> estado;
   
    @NotNull(message="la región no puede ser vacia")
    @ManyToOne()
    @JoinColumn(name="cancha_id")
    private CanchaModel cancha;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Set<EstadoModel> getEstado() {
        return estado;
    }

    public void setEstado(Set<EstadoModel> estado) {
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

    private static final long serialVersionUID = 1L;
}
