package ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CanchaModel;


public interface ICancha {
   
   public void registrarCancha(CanchaModel cancha);
   public void obtenerCancha(String id);
   public void actualizarCancha(CanchaModel cancha);
   public void eliminarCancha(int id);
   public void listarCanchas();

}
