package Persistence.dao;

import Dominio.Entities.Reservas;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c09ab612-dc63-454f-a129-18345fa044ca")
public interface IReservas {
    @objid ("599e57a7-910a-41e7-a991-55fd513d0088")
    void registrarReserva(Reservas reserva);

    @objid ("2e0af54a-2c7b-466b-84a2-e4a0d6394735")
    void obtenerReservas(int id);

    @objid ("4f074bff-b035-46f9-8941-750ef3f36e5c")
    void actualizarReservas(Reservas reserva);

    @objid ("7af1f2b7-9121-421d-8e7a-7613a5f2f495")
    void eliminarReservas(int id);

    @objid ("f4f3e94e-b3a4-4ab8-ba35-72a5dbe93507")
    void listarReservas();

}
