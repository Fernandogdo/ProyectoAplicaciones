package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import java.util.List;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstablecimientoModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEstablecimientoAdapter {
    public List<EstablecimientoModel> findAll();

    public Page<EstablecimientoModel> pagefindAll(Pageable pageable);

    public EstablecimientoModel findById(Long id);

    public EstablecimientoModel save(EstablecimientoModel establecimiento);
    
    public EstablecimientoModel findByName(String nombre);

}
