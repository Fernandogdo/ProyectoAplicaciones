package Persistence.dao;

import Dominio.Entities.Estado;
import Persistence.models.EstadoModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f25e3943-5819-4c32-9214-571b258fcbf6")
public class Estado_Impl implements IEstado {
    @objid ("f7aeb9c9-76cc-456a-a0da-039335f74c0b")
    public EstadoModel estado;

    @objid ("49a710f7-caf9-4708-9212-fba7ea261591")
    public void registrarEstado(Estado estado) {
    }

    @objid ("ad1235a8-d10f-4b02-91bf-c4afa2a20bef")
    public void obtenerEstado(int id) {
    }

    @objid ("bc2f9029-2687-4126-ac2c-4c7a0d54a260")
    public void actualizarEstado(Estado estado) {
    }

    @objid ("df53f662-a9fe-443d-a78d-69c3247743a6")
    public void eliminarEstado(int id) {
    }

    @objid ("91b94b32-aa77-4531-96f4-5901a724cd29")
    public void listarEstados() {
    }

}
