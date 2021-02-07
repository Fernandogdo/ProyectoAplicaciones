package ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases;

import ec.edu.utpl_sic_arqui.proyectoapp.adapters.IEstablecimientoAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.entities.Establecimiento;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CuentaModel;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstablecimientoModel;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstadoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrarInformacionEstablecimiento {

    @Autowired
    private IEstablecimientoAdapter iestablecimientoAdapter;
    
    @Autowired
    private RegistrarCuentaUsuario cuentaRT;
    
     @Autowired
    private AgregarCanchas canchaRT;

    public RegistrarInformacionEstablecimiento(IEstablecimientoAdapter iestablecimientoAdapter) {
        this.iestablecimientoAdapter = iestablecimientoAdapter;
    }

    public EstablecimientoModel registrarInfoEstablecimiento(Establecimiento establecimiento) {

        Establecimiento objestablecimiento = establecimiento;

        EstablecimientoModel objestablecimientoRepo = new EstablecimientoModel();

        objestablecimientoRepo.setNombre(objestablecimiento.getNombre());
        objestablecimientoRepo.setDireccion(objestablecimiento.getDireccion());
        objestablecimientoRepo.setLatitud(objestablecimiento.getLatitud());
        objestablecimientoRepo.setLongitud(objestablecimiento.getLongitud());
        objestablecimientoRepo.setTelefono(objestablecimiento.getTelefono());
        objestablecimientoRepo.setNum_canchas(objestablecimiento.getNum_canchas());
        objestablecimientoRepo.setHorario(objestablecimiento.getHorario());

        EstadoModel objestado = new EstadoModel();
        objestado.setNombre(objestablecimiento.getEstado().getNombre());
        objestablecimientoRepo.setEstado(objestado);
 

        CuentaModel cuentaRepo = cuentaRT.BuscarCuentaID(objestablecimiento.getCuenta().getCorreo());
        objestablecimientoRepo.setCuenta(cuentaRepo);
        
        EstablecimientoModel estab = iestablecimientoAdapter.save(objestablecimientoRepo);
        
        
        canchaRT.setnombreEstablecimento(objestablecimiento.getNombre());
        
        for (int i = 0; i < objestablecimiento.getCanchas().size(); i++) {
            canchaRT.agregarCancha(objestablecimiento.getCanchas().get(i));
        }
           
        return estab;
    }
    
    public EstablecimientoModel BuscarEstablecimientoByName(String nombre) {
       
      return iestablecimientoAdapter.findByName(nombre);
    }

}
