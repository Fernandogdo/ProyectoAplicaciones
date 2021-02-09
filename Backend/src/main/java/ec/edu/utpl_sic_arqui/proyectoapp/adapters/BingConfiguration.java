/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl_sic_arqui.proyectoapp.adapters;

import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.AgregarCanchas;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.AsignarEstados;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.MostrarEstadoCanchas;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.RegistrarCuentaDuenio;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.RegistrarCuentaUsuario;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.RegistrarInformacionEstablecimiento;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author alexa
 */
@Configuration
public class BingConfiguration {

    @Bean
    public RegistrarCuentaUsuario cuentaRT(ICuentaAdapter icuentaAdapter) {
        return new RegistrarCuentaUsuario(icuentaAdapter);
    }

    @Bean
    public ICuentaAdapter icuentaAdapter() {
        return new CuentaAdapterImpl();
    }
    
    @Bean
    public RegistrarCuentaDuenio cuentaDRT(ICuentaAdapter icuentaAdapter) {
        return new RegistrarCuentaDuenio(icuentaAdapter);
    }
    
    @Bean
    public RegistrarInformacionEstablecimiento establecimientoRT(IEstablecimientoAdapter iestablecimientoAdapter) {
        return new RegistrarInformacionEstablecimiento(iestablecimientoAdapter);
    }

    @Bean
    public IEstablecimientoAdapter iestablecimientoAdapter() {
        return new EstablecimientoAdapterImpl();
    }
    
    @Bean
    public AgregarCanchas canchaRT(ICanchaAdapter icanchaAdapter) {
        return new AgregarCanchas(icanchaAdapter);
    }

    @Bean
    public ICanchaAdapter icanchaAdapter() {
        return new CanchaAdapterImpl();
    }
    
    @Bean
    public AsignarEstados estadoRT(IEstadoAdapter iestadoAdapter) {
        return new AsignarEstados(iestadoAdapter);
    }

    @Bean
    public IEstadoAdapter iestadoAdapter() {
        return new EstadoAdapterImpl();
    }
    
    
    @Bean
    public MostrarEstadoCanchas iestablecimientoDRT(IEstablecimientoAdapter iestablecimientoAdapter) {
        return new MostrarEstadoCanchas(iestablecimientoAdapter);
    }

}
