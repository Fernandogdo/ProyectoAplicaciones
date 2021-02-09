package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import java.util.List;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao.IEstado;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstadoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoAdapterImpl implements IEstadoAdapter {

    @Autowired
    private IEstado estadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<EstadoModel> findAll() {
        return (List<EstadoModel>) estadoDao.findAll();
    }

    @Override
    @Transactional
    public Page<EstadoModel> pagefindAll(Pageable pageable) {
        return null;
    }

    @Override
    @Transactional
    public EstadoModel findById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public EstadoModel save(EstadoModel estadoModel) {
        return estadoDao.save(estadoModel);
    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    public EstadoModel findByName(String nombre) {
        return estadoDao.findBYName(nombre);
    }

}
