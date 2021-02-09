package Persistence.dao;

import Dominio.Entities.Establecimiento;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2dc8ea20-7cc4-4491-9e7a-3a854a17290e")
public interface IEstablecimiento {
    @objid ("c8abc425-a1c1-4d45-9942-798aedadc346")
    void registrarEstablecimiento(Establecimiento establecimiento);

    @objid ("07d91ac8-b3ec-41e7-a680-c74506fac09f")
    void obtenerEstablecimientoId(int id);

    @objid ("54762979-5c52-4246-a8c0-1d8d40015805")
    void actualizarCuenta(Establecimiento establecimiento);

    @objid ("2c3e99fa-ba6d-438a-9f22-d69b35c45fdf")
    void eliminarEstablecimiento(int id);

    @objid ("d2b5424c-5f07-42e5-aad5-ce90e151ba2f")
    void listarEstablecimientos();

}
