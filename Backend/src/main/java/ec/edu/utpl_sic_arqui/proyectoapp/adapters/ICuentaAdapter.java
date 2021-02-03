package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import java.util.List;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CuentaModel;


public interface ICuentaAdapter {

    CuentaModel registrarCuenta(CuentaModel cuenta);
    List<CuentaModel> listarCuentas();
    CuentaModel obtenerCuentaID(int id);

}
