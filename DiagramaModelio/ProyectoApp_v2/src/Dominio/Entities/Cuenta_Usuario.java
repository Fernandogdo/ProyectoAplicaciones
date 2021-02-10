package Dominio.Entities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d32fc9dd-bf8d-49b3-88ac-f777d39a520e")
public class Cuenta_Usuario extends Cuenta {
    @objid ("445b6935-637a-453c-982b-d2f2b048e82e")
    public List<Reservas> reservas = new ArrayList<Reservas> ();

}
