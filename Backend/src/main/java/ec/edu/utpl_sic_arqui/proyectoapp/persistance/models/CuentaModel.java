package ec.edu.utpl_sic_arqui.proyectoapp.persistance.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = CuentaModel.TABLE_NAME)
public class CuentaModel implements Serializable{
    public static final String TABLE_NAME = "cuenta";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;
    private String nombres_apellidos;
    private String celular;
    private String correo;
    private String contrasenia;
    
    @NotNull(message="la región no puede ser vacia")
    @ManyToOne()
    @JoinColumn(name="establecimiento_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private EstablecimientoModel establecimiento;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public EstablecimientoModel getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(EstablecimientoModel establecimiento) {
        this.establecimiento = establecimiento;
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

    private static final long serialVersionUID = 1L;
}
