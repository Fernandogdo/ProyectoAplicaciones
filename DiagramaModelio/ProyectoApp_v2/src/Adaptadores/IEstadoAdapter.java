package Adaptadores;

import java.util.List;
import Persistence.models.EstadoModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f4f30a5b-19c3-47fe-b6c6-44f0986b69db")
public interface IEstadoAdapter {
    @objid ("e8a74562-eb87-4592-86d8-a9caab2a9945")
    String registrarEstado(EstadoModel estado);

    @objid ("9315da3c-534c-4cdc-b66f-32490885ae03")
    List<EstadoModel> listarEstados();

    @objid ("c8b5d26f-f072-42e1-8d4f-c22010e32f99")
    EstadoModel obtenerEstadoID(int Id);

}
