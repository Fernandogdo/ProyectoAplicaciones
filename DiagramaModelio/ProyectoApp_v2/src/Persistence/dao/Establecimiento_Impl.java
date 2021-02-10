package Persistence.dao;

import Dominio.Entities.Establecimiento;
import Persistence.models.EstablecimientoModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ae594708-7214-4a7f-a87d-a4a56d8e5193")
public class Establecimiento_Impl implements IEstablecimiento {
    @objid ("b2079aa5-cf5a-4b01-9b43-3aef318fbe8b")
    public EstablecimientoModel establecimiento;

    @objid ("6bddac23-609e-4818-a0de-a45b6458560c")
    public void registrarEstablecimiento(Establecimiento establecimiento) {
    }

    @objid ("c63a03e4-88cb-4e54-95ec-1cefd823f77a")
    public void obtenerEstablecimientoId(int id) {
    }

    @objid ("12f78e78-480e-40ac-9ce8-d445431b9d84")
    public void actualizarCuenta(Establecimiento establecimiento) {
    }

    @objid ("67c9cf7e-a52d-4581-b0d6-7d926f52626f")
    public void eliminarEstablecimiento(int id) {
    }

    @objid ("b8a07743-75ef-422f-ad15-09a21621e4aa")
    public void listarEstablecimientos() {
    }

}
