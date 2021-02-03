package ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstadoModel;

public interface IEstado {
  
    public void registrarEstado(EstadoModel estado);
    public void obtenerEstado(int id);
    public void actualizarEstado(EstadoModel estado);
    public void eliminarEstado(int id);
    public void listarEstados();

}
