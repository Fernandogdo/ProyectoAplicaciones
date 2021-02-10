import Dominio.Entities.Cuenta;
import Dominio.ICuenta;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("72ed5c60-202a-4456-aba2-701c40ca620c")
public class RegistrarCuentaUserPort {
    @objid ("59dbb01e-eeae-4c98-9b57-82cf530494a2")
    public ICuenta iCuenta;

    @objid ("8b4aa7ec-2433-4d46-84d8-36d43bb5930b")
    public RegistrarCuentaUserPort(ICuenta cuenta) {
    }

    @objid ("80f73ace-892c-405a-b163-9f845473b479")
    public int registrarCuentaUsuario(Cuenta cuenta) {
    }

}
