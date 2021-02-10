package Adaptadores;

import java.util.List;
import Persistence.models.CuentaModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("20b66d3c-4c9c-44a6-9dda-f66e8d54ca36")
public interface ICuentaAdapter {
    @objid ("9cec6e2f-4f49-455e-b9d3-b6c8e91af8f2")
    CuentaModel registrarCuenta(CuentaModel cuenta);

    @objid ("6f5e5cbb-4dd8-4d6d-9a37-19ee55b37d0a")
    List<CuentaModel> listarCuentas();

    @objid ("6ad1ccdb-251d-4cdd-b8e7-319bef3cf924")
    CuentaModel obtenerCuentaID(int id);

}
