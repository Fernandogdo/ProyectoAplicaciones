package ec.edu.utpl_sic_arqui.proyectoapp.persistance.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
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
    
    @Column(unique=true)
    private String nombre;
    
    private String direccion;
    private String latitud;
    private String longitud;
    private String telefono;
    private String num_canchas;
    private String horario;

    @NotNull(message = "la región no puede ser vacia")
    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private EstadoModel estado;

    @NotNull(message = "la región no puede ser vacia")
    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private CuentaModel cuenta;

    @JsonIgnoreProperties(value = {"establecimiento", "hibernateLazyInitializer", "handler"}, allowSetters = true)
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "establecimiento", cascade = CascadeType.MERGE)
    private List<CanchaModel> canchas ;

    public EstablecimientoModel() {
        
    }
    

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoModel getEstado() {
        return estado;
    }

    public void setEstado(EstadoModel estado) {
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

    public CuentaModel getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaModel cuenta) {
        this.cuenta = cuenta;
    }

    public List<CanchaModel> getCanchas() {
        return canchas;
    }

    public void setCanchas(List<CanchaModel> canchas) {
        this.canchas = canchas;
    }

    private static final long serialVersionUID = 1L;
}
