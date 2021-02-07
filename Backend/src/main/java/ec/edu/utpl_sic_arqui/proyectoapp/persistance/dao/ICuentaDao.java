package ec.edu.utpl_sic_arqui.proyectoapp.persistance.dao;

import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CuentaModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ICuentaDao  extends JpaRepository<CuentaModel, Long>{
 
    @Query("SELECT u FROM CuentaModel u WHERE u.correo = :email")
    public CuentaModel findBYEmail(String email);
    

}
