package ec.edu.utpl_sic_arqui.proyectoapp.persistance.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = EstadoModel.TABLE_NAME)

public class EstadoModel implements Serializable{
    public static final String TABLE_NAME = "estado";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;
    
    private String nombre;
    
//    @OneToOne(mappedBy = "estado", cascade = CascadeType.ALL)
    @NotNull(message="la región no puede ser vacia")
    @ManyToOne()
    @JoinColumn(name="establecimiento_id")
    private EstablecimientoModel establecimiento;

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

    private static final long serialVersionUID = 1L;
}
