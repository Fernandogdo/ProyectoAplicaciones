import Dominio.Entities.Cuenta;
import Dominio.ICuenta;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("786c7fb4-8ff7-4021-b374-9a488ed6c3d4")
public class RegistrarEncargadoPort {
    @objid ("7c33f301-e521-4591-96e3-013e12d9a33c")
    public ICuenta iCuenta;

    @objid ("83c1d901-3b06-4160-b8f6-7a68d9923ed2")
    public RegistrarEncargadoPort(ICuenta cuenta) {
    }

    @objid ("8800974b-9796-4329-a54b-706c6703308e")
    public int registrarCuentaEncargado(Cuenta cuenta) {
    }

}
