package ec.edu.utpl_sic_arqui.proyectoapp.domain;

import ec.edu.utpl_sic_arqui.proyectoapp.domain.entities.Cuenta;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CuentaModel;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
public interface ICuenta {
   
    public CuentaModel registrarCuenta(Cuenta cuenta);
    public boolean verificarCuenta();

}
