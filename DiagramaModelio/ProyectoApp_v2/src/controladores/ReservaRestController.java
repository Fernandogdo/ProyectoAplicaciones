package controladores;

import Adaptadores.IReservaAdapter;
import Persistence.models.ReservaModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9bcd00c8-6503-46be-9bea-aa6b76b17041")
public class ReservaRestController {
    @objid ("afe0853c-946b-4546-8f27-305ef1cab59a")
    public IReservaAdapter iReservaAdapter;

    @objid ("b797c8a4-3a0f-4f94-b7ef-f951b6987a6d")
    public ReservaModel listar() {
    }

    @objid ("ca6db671-7c70-4571-a620-4cdca3431e88")
    public String crear(ReservaModel reserva) {
    }

    @objid ("0ea85833-7629-486b-902c-1dba7ebba41d")
    public String actualizar(int id, ReservaModel reserva) {
    }

    @objid ("6074c78d-376b-4440-8ca4-1e37dc62cba0")
    public String delete(int id) {
    }

}
