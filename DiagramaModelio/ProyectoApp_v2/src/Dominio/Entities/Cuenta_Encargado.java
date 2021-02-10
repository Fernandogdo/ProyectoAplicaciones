package Dominio.Entities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0b8c8bbd-6003-4271-9f87-42cbb1197184")
public class Cuenta_Encargado extends Cuenta {
    @objid ("26eeece0-7127-4005-9f3b-d9243ef1ad68")
    public List<Establecimiento> establecimiento = new ArrayList<Establecimiento> ();

    @objid ("46322ce8-aa4b-442b-83e6-5d3fd51a32bf")
    public List<Reservas> reservas = new ArrayList<Reservas> ();

}
