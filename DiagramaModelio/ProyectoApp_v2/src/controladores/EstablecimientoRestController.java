package controladores;

import Adaptadores.IEstablecimientoAdapter;
import Persistence.models.EstablecimientoModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cdad9dc3-5ebe-4312-bc38-d6e3c703a632")
public class EstablecimientoRestController {
    @objid ("ed2ee3f7-5b10-401a-b032-ee7e5290b277")
    public IEstablecimientoAdapter iEstablecimientoAdapter;

    @objid ("a01e669d-ef00-4daa-ace6-a87f167cadea")
    public EstablecimientoModel listar() {
    }

    @objid ("890c6f21-3445-4bfc-9643-533ac2c0272d")
    public String crear(EstablecimientoModel establecimiento) {
    }

    @objid ("98ecc423-857c-4e4d-8c25-ac036adc769a")
    public String actualizar(int id, EstablecimientoModel establecimiento) {
    }

    @objid ("fc7e341f-e661-4296-8423-92e818f6ca7e")
    public String delete(int id) {
    }

}
