package Adaptadores;

import java.util.List;
import Persistence.models.EstablecimientoModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a384c645-90d5-459c-814d-0bdf98a5ad22")
public interface IEstablecimientoAdapter {
    @objid ("6e00d838-26ae-4503-9502-a5cfca31d490")
    EstablecimientoModel registrarEstablecimiento(EstablecimientoModel establecimiento);

    @objid ("5f5d02df-3808-4690-84b8-9c16e48bd62d")
    List<EstablecimientoModel> listarEstablecimientos();

    @objid ("9e8eb2ff-bf4c-446d-a8ed-25c1024cbbd5")
    EstablecimientoModel obtenerEstablecimientoID(int id);

}
