import Dominio.Entities.Reservas;
import Dominio.Use Cases.RealizarReservas;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("60286735-6de2-4d0c-8c95-3a1ab2101eb7")
public class RealizarReservasPort {
    @objid ("6afd2368-a9e8-42c1-84a2-d66827e086e4")
    public RealizarReservas reserva;

    @objid ("c2b12099-159f-4a79-9a75-4ff8dfb4f273")
    public void realizarReserva(Reservas reserva) {
    }

}
