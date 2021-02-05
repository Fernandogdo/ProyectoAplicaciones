/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.RegistrarCuenta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author alexa
 */
@Configuration
public class BingConfiguration {

    @Bean
    public RegistrarCuenta cuentaRT(ICuentaAdapter icuentaAdapter) {
        return new RegistrarCuenta(icuentaAdapter);
    }

    @Bean
    public ICuentaAdapter icuentaAdapter() {
        return new CuentaAdapterImpl();
    }
}
