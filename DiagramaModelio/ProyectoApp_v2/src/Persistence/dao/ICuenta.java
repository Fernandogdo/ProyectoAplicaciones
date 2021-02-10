package Persistence.dao;

import Dominio.Entities.Cuenta;
import Persistence.models.CuentaModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3f5e8e44-07b8-4b94-ad1d-23c153ce0c4e")
public interface ICuenta {
    @objid ("d3d83c8d-022f-4da1-81f6-48c6c7ecff21")
    void registrarCuenta(CuentaModel cuenta);

    @objid ("f92a2146-55db-4238-bbdc-d603dffaba57")
    void obtenerCuentaId(int id);

    @objid ("a0331c46-1af9-4c1e-a550-45d1282947f9")
    void actualizarCuenta(Cuenta cuenta);

    @objid ("2007bea0-22f8-400d-9c55-f7370c157186")
    void eliminarCuenta(int id);

    @objid ("bb2720de-81f1-465d-aeaa-6bed114f933c")
    void listarCuentas();

}
