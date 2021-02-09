package ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstadoModel;

import java.util.List;

public interface IEstado extends JpaRepository<EstadoModel, Long> {

    @Query("from EstadoModel")
    public List<EstadoModel> findAllEstados();

    @Query("SELECT u FROM EstadoModel u WHERE u.nombre = :nombre")
    public EstadoModel findBYName(String nombre);

}
