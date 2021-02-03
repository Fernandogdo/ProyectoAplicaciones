package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import java.util.List;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstadoModel;


public interface IEstadoAdapter {
    
    String registrarEstado(EstadoModel estado);
    List<EstadoModel> listarEstados();
    EstadoModel obtenerEstadoID(int Id);

}
