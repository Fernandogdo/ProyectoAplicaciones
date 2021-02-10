package controladores;

import java.util.List;
import Adaptadores.ICuentaAdapter;
import Persistence.models.CuentaModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("58ca0d50-7d6b-4e6c-90c0-009e23996b68")
public class CuentaRestController {
    @objid ("822c4fee-d874-4cb4-9e32-25b9c7ddc2d2")
    public ICuentaAdapter iCuentaAdapter;

    @objid ("160dda74-6840-4795-8aad-753fbed2ffd6")
    public List<CuentaModel> listar() {
    }

    @objid ("2a7c756d-0d0c-401c-b6fa-9766b7bf1b00")
    public String crear(CuentaModel cuenta) {
    }

    @objid ("868ddb1c-c0a9-4ae0-bc3d-db4fb04d2299")
    public String actualizar(int id, CuentaModel cuenta) {
    }

    @objid ("c26b6d80-cb75-4f3d-8b86-86e816e0ebdd")
    public String delete(int id) {
    }

}
