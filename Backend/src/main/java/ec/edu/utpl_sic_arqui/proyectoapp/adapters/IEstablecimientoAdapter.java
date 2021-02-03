package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import java.util.List;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstablecimientoModel;

public interface IEstablecimientoAdapter {
    
    EstablecimientoModel registrarEstablecimiento(EstablecimientoModel establecimiento);
    List<EstablecimientoModel> listarEstablecimientos();
    EstablecimientoModel obtenerEstablecimientoID(int id);

}
