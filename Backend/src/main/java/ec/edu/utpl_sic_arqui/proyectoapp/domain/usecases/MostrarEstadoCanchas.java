package ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases;

import ec.edu.utpl_sic_arqui.proyectoapp.adapters.IEstablecimientoAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstablecimientoModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class MostrarEstadoCanchas {

    @Autowired
    private IEstablecimientoAdapter iestablecimientoAdapter;

    public MostrarEstadoCanchas(IEstablecimientoAdapter iestablecimientoAdapter) {
        this.iestablecimientoAdapter = iestablecimientoAdapter;
    }

    public List<EstablecimientoModel> mostrarCanchasEstados() {
        return iestablecimientoAdapter.findAll();
    }
}
