package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CanchaModel;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ICanchaAdapter {
   
    public List<CanchaModel> findAll();

    public Page<CanchaModel> pagefindAll(Pageable pageable);

    public CanchaModel findById(Long id);
    
    public CanchaModel savet(CanchaModel cancha);
}
