package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao.IEstablecimientoDao;
import java.util.List;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstablecimientoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("iestablecimientoDao")
public class EstablecimientoAdapterImpl implements IEstablecimientoAdapter {

    @Autowired
    private IEstablecimientoDao iestablecimentoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<EstablecimientoModel> findAll() {
        return iestablecimentoDao.findAll();
    }

    @Override
    public Page<EstablecimientoModel> pagefindAll(Pageable pageable) {
        return null;
    }

    @Override
    public EstablecimientoModel findById(Long id) {
        return null;
    }

    @Override
    public EstablecimientoModel save(EstablecimientoModel establecimiento) {
        System.out.println("--------Aqui adapter " + establecimiento.toString());
        return iestablecimentoDao.save(establecimiento);
    }

    @Override
    public EstablecimientoModel findByName(String nombre) {
       return iestablecimentoDao.findBYName(nombre);
    }

}
