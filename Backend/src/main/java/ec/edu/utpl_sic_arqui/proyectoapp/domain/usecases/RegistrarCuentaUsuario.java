package ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases;

import ec.edu.utpl_sic_arqui.proyectoapp.adapters.CuentaAdapterImpl;
import ec.edu.utpl_sic_arqui.proyectoapp.adapters.ICuentaAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.ICuenta;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.entities.Cuenta;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao.ICuentaDao;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CuentaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class RegistrarCuentaUsuario implements ICuenta {

    @Autowired
    private ICuentaAdapter icuentaAdapter;
  
    public RegistrarCuentaUsuario(ICuentaAdapter icuentaAdapter) {
        this.icuentaAdapter = icuentaAdapter;
    }

    @Override
    public CuentaModel registrarCuenta(Cuenta cuenta) {
       
        Cuenta objcuenta = cuenta;
        CuentaModel objCuentaRepo = new CuentaModel();

        objCuentaRepo.setCorreo(objcuenta.getCorreo());
        objCuentaRepo.setContrasenia(objcuenta.getContrasenia());
        objCuentaRepo.setNombres_apellidos(objcuenta.getNombres_apellidos());
        objCuentaRepo.setCelular(objcuenta.getCelular());

        return icuentaAdapter.savet(objCuentaRepo);
    }

    @Override
    public boolean verificarCuenta() {
        return false;
    }
    
    public CuentaModel BuscarCuentaID(String email) {
        System.out.println("Email caso de uso" + email);
      return icuentaAdapter.findByEmail(email);
    }

}
