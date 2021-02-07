package ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstablecimientoModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstablecimientoDao extends JpaRepository<EstablecimientoModel, Long>{
    @Query("SELECT u FROM EstablecimientoModel u WHERE u.nombre = :nombre")
    public EstablecimientoModel findBYName(String nombre);
}
