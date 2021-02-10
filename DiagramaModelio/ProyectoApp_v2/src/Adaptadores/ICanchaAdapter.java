package Adaptadores;

import Persistence.models.CanchaModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bea16369-704a-4405-b396-90f77131edbb")
public interface ICanchaAdapter {
    @objid ("4286ab4c-40bf-4ead-ba93-fcf83b23ea2c")
    CanchaModel obtenerCanchaID(int id);

}
