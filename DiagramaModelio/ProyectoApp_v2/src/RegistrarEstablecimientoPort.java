import Dominio.Entities.Establecimiento;
import Dominio.Use Cases.RegistrarInformacionEstablecimiento;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4fd75ddc-8670-478c-91a2-ff1b52f0bebb")
public class RegistrarEstablecimientoPort {
    @objid ("4820a66e-8321-4326-9848-e2f1e9f9f57b")
    public RegistrarInformacionEstablecimiento registroInfo;

    @objid ("aebd7316-5f8d-42c6-9f4a-db6c45304f1a")
    public RegistrarEstablecimientoPort(Establecimiento establecimiento) {
    }

    @objid ("3e880086-f722-4763-8d0d-5f96d47b68dc")
    public int registrarEstablecimiento(Establecimiento establecimiento) {
    }

}
