package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import ec.edu.utpl_sic_arqui.proyectoapp.domain.ICuenta;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.entities.Cuenta;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.RegistrarCuenta;
import java.util.List;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CuentaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao.ICuentaDao;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("icuentaDao")
public class CuentaAdapterImpl implements ICuentaAdapter {

    @Autowired
    private ICuentaDao icuentaDao;

    @Override
    @Transactional(readOnly = true)
    public List<CuentaModel> findAll() {

        return null;

    }

    @Override
    @Transactional(readOnly = true)
    public Page<CuentaModel> pagefindAll(Pageable pageable) {

        return null;

    }

    @Override
    @Transactional
    public CuentaModel findById(Long id) {

        return null;

    }

    @Override
    public CuentaModel savet(CuentaModel cuenta) {
        System.out.println("--------Aqui adapter " + cuenta.getNombres_apellidos());
        return icuentaDao.save(cuenta);
    }

}
