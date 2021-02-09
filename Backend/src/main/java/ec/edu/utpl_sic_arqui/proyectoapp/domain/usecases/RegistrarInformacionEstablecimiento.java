package ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases;

import ec.edu.utpl_sic_arqui.proyectoapp.adapters.IEstablecimientoAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.entities.Establecimiento;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CanchaModel;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CuentaModel;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstablecimientoModel;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstadoModel;
import java.util.ArrayList;
import java.util.List;
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
    
    @Autowired
    private AsignarEstados estadoRT;

    public RegistrarInformacionEstablecimiento(IEstablecimientoAdapter iestablecimientoAdapter) {
        this.iestablecimientoAdapter = iestablecimientoAdapter;
    }

    public EstablecimientoModel registrarInfoEstablecimiento(Establecimiento establecimiento) {

        Establecimiento objestablecimiento = establecimiento;

        EstablecimientoModel objestablecimientoRepo = new EstablecimientoModel();
        List<CanchaModel> canchaM = new ArrayList<>();

        objestablecimientoRepo.setNombre(objestablecimiento.getNombre());
        objestablecimientoRepo.setDireccion(objestablecimiento.getDireccion());
        objestablecimientoRepo.setLatitud(objestablecimiento.getLatitud());
        objestablecimientoRepo.setLongitud(objestablecimiento.getLongitud());
        objestablecimientoRepo.setTelefono(objestablecimiento.getTelefono());
        objestablecimientoRepo.setNum_canchas(objestablecimiento.getNum_canchas());
        objestablecimientoRepo.setHorario(objestablecimiento.getHorario());

        EstadoModel objestado = estadoRT.BuscarEstadoByName(objestablecimiento.getEstado().getNombre());
        CuentaModel cuentaRepo = cuentaRT.BuscarCuentaID(objestablecimiento.getCuenta().getCorreo());
        System.out.println("El estado es test "+ objestado.getNombre());
        objestablecimientoRepo.setEstado(objestado);
        objestablecimientoRepo.setCuenta(cuentaRepo);
        

        for (int i = 0; i < objestablecimiento.getCanchas().size(); i++) {
            CanchaModel can = new CanchaModel();
            can.setNum_cancha(objestablecimiento.getCanchas().get(i).getNumcancha());
            can.setCosto_cancha(objestablecimiento.getCanchas().get(i).getCostocancha());
            EstadoModel objestadoTemp = estadoRT.BuscarEstadoByName(objestablecimiento.getCanchas().get(i).getEstado().getNombre());
            
            can.setEstado(objestadoTemp);
            System.out.println("vale vrg esto "+objestadoTemp.getNombre());
            canchaM.add(can);
        }
        
        System.out.println("vale vrg esto "+ canchaM.get(0).getNum_cancha());
        
        objestablecimientoRepo.setCanchas(canchaM);

        EstablecimientoModel establecimientoSave = iestablecimientoAdapter.save(objestablecimientoRepo);
        
        System.out.println("Pasa x aui-----------------------------");

        canchaRT.setnombreEstablecimento(objestablecimiento.getNombre());

        for (int i = 0; i < objestablecimiento.getCanchas().size(); i++) {
            canchaRT.agregarCancha(objestablecimiento.getCanchas().get(i));
        }

        return establecimientoSave;
    }

    public EstablecimientoModel BuscarEstablecimientoByName(String nombre) {

        return iestablecimientoAdapter.findByName(nombre);
    }

}
