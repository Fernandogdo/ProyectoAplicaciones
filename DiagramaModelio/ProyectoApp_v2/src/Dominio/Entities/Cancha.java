package Dominio.Entities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("67d84213-85ea-4a10-ba8c-e56ff8de6907")
public class Cancha {
    @objid ("aa680fb9-943b-4365-83fa-4fa22975e8ee")
    public String disponibilidad;

    @objid ("21f2b134-e9ba-48a5-9453-54d9ac1cfe90")
    public float costo_cancha;

    @objid ("3035e2d0-53d5-44b5-8913-ef1bec684cfb")
    public Estado estado;

    @objid ("3e923409-a886-4c49-87ba-88f81c541119")
    public Establecimiento establecimiento;

}
