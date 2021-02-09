/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases;

import ec.edu.utpl_sic_arqui.proyectoapp.adapters.IEstablecimientoAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.adapters.IEstadoAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstadoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author alexa
 */
@Component
public class AsignarEstados {
    @Autowired
    private IEstadoAdapter iestadoAdapter;
    
    public AsignarEstados(IEstadoAdapter iestadoAdapter) {
        this.iestadoAdapter = iestadoAdapter;
    }
    
    public EstadoModel BuscarEstadoByName(String nombre) {

        return iestadoAdapter.findByName(nombre);
                
    }

}
