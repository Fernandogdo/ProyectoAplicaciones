package ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.ReservaModel;

public interface IReservas {

    public void registrarReserva(ReservaModel reserva);
    public void obtenerReservas(int id);
    public void actualizarReservas(ReservaModel reserva);
    public void eliminarReservas(int id);
    public void listarReservas();

}
