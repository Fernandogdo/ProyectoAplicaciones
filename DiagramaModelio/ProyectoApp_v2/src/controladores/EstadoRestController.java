package controladores;

import Adaptadores.IEstadoAdapter;
import Persistence.models.EstadoModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("85328935-bdb4-4c61-a502-46c628f7cfdf")
public class EstadoRestController {
    @objid ("65bc15bb-2d08-47c0-acfe-b5bf9f5b6108")
    public IEstadoAdapter iEstadoAdapter;

    @objid ("242efe1c-c3ff-4c9b-92a9-2a6c9a53242b")
    public EstadoModel listar() {
    }

    @objid ("1af37395-34e2-46de-b8e3-f24c2f069ffd")
    public String crear(EstadoModel estado) {
    }

    @objid ("bd0fcca2-f3ad-4ca0-a467-4221fcac9ae6")
    public String actualizar(int id, EstadoModel estado) {
    }

    @objid ("e20be812-c440-431e-91aa-36d75f61319f")
    public String delete(int id) {
    }

}
