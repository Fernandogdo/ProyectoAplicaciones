package Dominio.Entities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8d83144c-9fb6-4e21-a35f-8d4b739079ff")
public class Establecimiento {
    @objid ("a17df201-738c-47d5-b450-feb18d00d199")
    public String direccion;

    @objid ("8b5d0731-fc21-4fbf-9d9f-383ca048a6ba")
    public String latitud;

    @objid ("fdd00dd3-6e7d-4106-8355-5cebbb603061")
    public String longitud;

    @objid ("05a42568-fbdd-4d6f-a715-fae3e3b5a170")
    public String telefono;

    @objid ("909bb6ab-5b9d-4b04-9aa1-11663f468656")
    public String num_canchas;

    @objid ("92b2a150-5f4f-4ab8-94f8-f618ecfbb324")
    public String horario;

    @objid ("70a495ce-3036-4379-844e-57874ddb69ab")
    public Estado estado;

    @objid ("1425f867-2ef6-4658-9e33-13dba5bbe76f")
    public List<Cancha> cancha = new ArrayList<Cancha> ();

}
