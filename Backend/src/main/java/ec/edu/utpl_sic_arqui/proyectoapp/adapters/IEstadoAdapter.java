package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import java.util.List;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstadoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEstadoAdapter {

    public List<EstadoModel> findAll();

    public Page<EstadoModel> pagefindAll(Pageable pageable);

    public EstadoModel findById(Long id);

    public EstadoModel save(EstadoModel estadoModel);
    
    public EstadoModel findByName(String nombre);

    public void delete(Long id);



//    String registrarEstado(EstadoModel estado);
//    List<EstadoModel> listarEstados();
//    EstadoModel obtenerEstadoID(int Id);

}
