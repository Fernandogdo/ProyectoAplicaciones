package Persistence.dao;

import Dominio.Entities.Cuenta;
import Persistence.models.CuentaModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a173531e-5c5d-485d-a5f7-d479111edb84")
public class Cuenta_Impl implements ICuenta {
    @objid ("c585349d-1440-4624-a4b2-16367908be09")
    public CuentaModel cuenta;

    @objid ("41970fce-99b9-4d87-b141-dd2d2a582bde")
    public void registrarCuenta(CuentaModel cuenta) {
    }

    @objid ("92dc4b0a-bd77-4d0e-b2a7-1dd628527bd6")
    public void obtenerCuentaId(int id) {
    }

    @objid ("852ad181-d516-4b92-af46-c9c885e6eb2a")
    public void actualizarCuenta(Cuenta cuenta) {
    }

    @objid ("f27856f2-29f9-48d9-80d4-78ff254e05f8")
    public void eliminarCuenta(int id) {
    }

    @objid ("b72976a0-842d-4703-a0e9-14077c36398b")
    public void listarCuentas() {
    }

}
