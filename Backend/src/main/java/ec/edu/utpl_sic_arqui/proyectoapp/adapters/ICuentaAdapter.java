package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import ec.edu.utpl_sic_arqui.proyectoapp.domain.entities.Cuenta;
import java.util.List;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CuentaModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ICuentaAdapter {
    
    public List<CuentaModel> findAll();

    public Page<CuentaModel> pagefindAll(Pageable pageable);

    public CuentaModel findById(Long id);

    public CuentaModel savet(CuentaModel cuenta);

//    public void delete(Long id);
//    public int registrarCuenta(Cuenta cuenta);
//    public List<CuentaModel> listarCuentas();
//    public CuentaModel obtenerCuentaID(int id);

}
