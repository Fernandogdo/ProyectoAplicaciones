package Dominio.Entities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d991ee8f-3468-41aa-88a0-4909bf09a9a1")
public class Reservas {
    @objid ("8af6db7b-e3db-4ee4-aa45-03001929fb1a")
    public String tiempo_uso;

    @objid ("04f06741-7eba-4dbb-b096-e6627c8ea78b")
    public String hora_llegada;

    @objid ("4de19d18-96e9-4470-af2e-42cf92d1c0d9")
    public String hora_salida;

    @objid ("03ca0ef7-3e45-4e5c-9e32-7a075ca85319")
    public float valor_cancelar;

    @objid ("62c38ba3-8489-4c02-bfaf-dc5a789f66aa")
    public Cancha cancha;

}
