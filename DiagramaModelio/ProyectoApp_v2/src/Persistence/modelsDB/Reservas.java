package Persistence.modelsDB;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e38dc5ba-515d-405d-b016-c28e79eb798e")
public class Reservas {
    @objid ("56a9ff5f-a062-4a97-8b4e-3156222ba958")
    public int id;

    @objid ("300eaaca-18e6-4d4e-8462-97b83752ec33")
    public String tiempo_uso;

    @objid ("5bad2f67-495f-42cf-a05e-245bab3fa04b")
    public String hora_llegada;

    @objid ("da277119-7355-4227-b7f0-b10907fa5c01")
    public String hora_salida;

    @objid ("0d4c9f06-eb9e-4e58-864a-f25ed1f94128")
    public String valor_cancelar;

    @objid ("4be66b17-3e2d-4543-b969-5970d9831471")
    public int idCuenta;

    @objid ("2a93aca7-1f68-4818-89df-029da3451026")
    public int idCancha;

}
