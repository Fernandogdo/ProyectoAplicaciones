package Adaptadores;

import java.util.List;
import Persistence.models.ReservaModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("dc0e05b6-8369-470c-ba89-dd1c02298dba")
public interface IReservaAdapter {
    @objid ("a3e094b9-6691-4c36-9a51-cb3c996dc818")
    ReservaModel registrarReserva(ReservaModel reserva);

    @objid ("ea9ace96-8adb-40e9-8377-6e0f7a73ba19")
    List<ReservaModel> listarReservas();

    @objid ("dbe1399d-0808-4dd4-a34c-7049a9a31192")
    String obtenerReservaID(int id);

}
