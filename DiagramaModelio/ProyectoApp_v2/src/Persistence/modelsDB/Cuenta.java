package Persistence.modelsDB;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bb37dcf6-0227-4264-9e23-9637c6ade7af")
public class Cuenta {
    @objid ("eea3603e-e422-44d1-bf82-d21d93c7b2a5")
    public int id;

    @objid ("dfca8ce6-55eb-43de-a7e1-28fc339a38ad")
    public String nombres_apellidos;

    @objid ("7a74f095-1be2-4104-acfa-ce095bc3399c")
    public String celular;

    @objid ("fdd3dae4-15d5-4a02-acdf-b16774d7a7d5")
    public String correo;

    @objid ("82825561-6403-45f7-b9a7-214bf61bfba1")
    public String contrasenia;

    @objid ("f9a2c6ab-d70b-4ee8-a6c9-940a2be6b6a2")
    public int idEstablecimiento;

}
