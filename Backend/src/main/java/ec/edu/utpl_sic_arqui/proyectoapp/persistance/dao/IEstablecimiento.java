package ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstablecimientoModel;

public interface IEstablecimiento {
    
    public void registrarEstablecimiento(EstablecimientoModel establecimiento);
    public void obtenerEstablecimientoId(int id);
    public void actualizarCuenta(EstablecimientoModel establecimiento);
    public void eliminarEstablecimiento(int id);
    public void listarEstablecimientos();

}
