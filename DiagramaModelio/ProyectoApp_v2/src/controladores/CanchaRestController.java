package controladores;

import Adaptadores.ICanchaAdapter;
import Persistence.models.CanchaModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a678ffc0-7942-4490-bc19-795d44fd828c")
public class CanchaRestController {
    @objid ("25b285aa-4de2-4c2a-8645-6437d8c1de19")
    public ICanchaAdapter iCanchaAdapter;

    @objid ("61258a74-279a-42a5-b86c-0eb4e5503bfe")
    public CanchaModel listar() {
    }

    @objid ("7799c530-bbe5-4f5c-8790-f4da5613fd78")
    public String crear(CanchaModel cancha) {
    }

    @objid ("4c552d62-c814-4e7d-8e50-82b8a1a367e4")
    public String actualizar(int id, CanchaModel cancha) {
    }

    @objid ("aa3c80ff-2113-4c76-b9fe-13fa23e57f86")
    public String delete(int id) {
    }

}
