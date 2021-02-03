package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import java.util.List;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.ReservaModel;

public interface IReservaAdapter {

    ReservaModel registrarReserva(ReservaModel reserva);
    List<ReservaModel> listarReservas();
    String obtenerReservaID(int id);

}
