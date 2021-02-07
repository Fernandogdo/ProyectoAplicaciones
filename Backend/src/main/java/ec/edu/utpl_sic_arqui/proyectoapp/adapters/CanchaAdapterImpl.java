package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao.ICanchaDao;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CanchaModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("icanchaDao")
public class CanchaAdapterImpl implements ICanchaAdapter {

    @Autowired
    private ICanchaDao icanchaDao;

    
    @Override
    public List<CanchaModel> findAll() {
        return null;
    }

    @Override
    public Page<CanchaModel> pagefindAll(Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CanchaModel findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CanchaModel savet(CanchaModel cancha) {
       return icanchaDao.save(cancha);
    }
    
 

}
