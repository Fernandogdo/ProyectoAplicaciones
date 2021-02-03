package ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CuentaModel;

public interface ICuenta {
    
    public void registrarCuenta(CuentaModel cuenta);   
    public void obtenerCuentaId(int id);
    public void actualizarCuenta(CuentaModel cuenta);
    public void eliminarCuenta(int id);
    public void listarCuentas();

}
