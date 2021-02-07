/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases;

import ec.edu.utpl_sic_arqui.proyectoapp.adapters.ICanchaAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.entities.Cancha;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CanchaModel;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstablecimientoModel;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstadoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author alexa
 */
@Component
public class AgregarCanchas {

    @Autowired
    private ICanchaAdapter icanchaAdapter;

    @Autowired
    private RegistrarInformacionEstablecimiento establecimientoRT;

    private String tempNombre;

    public AgregarCanchas(ICanchaAdapter icanchaAdapter) {
        this.icanchaAdapter = icanchaAdapter;
    }

    public CanchaModel agregarCancha(Cancha cancha) {
        Cancha objcancha = cancha;
        CanchaModel objcanchaRepo = new CanchaModel();

        objcanchaRepo.setNum_cancha(objcancha.getNumcancha());
        objcanchaRepo.setCosto_cancha(objcancha.getCostocancha());

        EstadoModel objestadoRepo = new EstadoModel();
        objestadoRepo.setNombre(objcancha.getEstado().getNombre());
        objcanchaRepo.setEstado(objestadoRepo);

        EstablecimientoModel repoEstab = establecimientoRT.BuscarEstablecimientoByName(this.tempNombre);
        objcanchaRepo.setEstablecimiento(repoEstab);

        return icanchaAdapter.savet(objcanchaRepo);
    }

    public void setnombreEstablecimento(String nombre) {
        this.tempNombre = nombre;
     
    }
}
