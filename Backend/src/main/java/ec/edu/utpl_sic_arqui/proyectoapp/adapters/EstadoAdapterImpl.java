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
    public Page<EstadoModel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public EstadoModel findById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public EstadoModel save(EstadoModel estadoModel) {
        return estadoDao.save(estadoModel);
    }

    @Override
    public void delete(Long id) {

    }

//    @Override
//    public String registrarEstado(EstadoModel estado) {
//        return null;
//    }
//
//    @Override
//    public List<EstadoModel> listarEstados() {
//        return null;
//    }
//
//    @Override
//    public EstadoModel obtenerEstadoID(int Id) {
//        return null;
//    }

}
