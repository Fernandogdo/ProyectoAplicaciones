package Persistence.dao;

import Dominio.Entities.Estado;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("73d245e9-df94-4191-a7f6-0aefee8ddc43")
public interface IEstado {
    @objid ("f6a4d34d-5086-4d21-ad4e-54c21563ba91")
    void registrarEstado(Estado estado);

    @objid ("734ebb12-ecfd-4ed3-adb5-11d1d1b669da")
    void obtenerEstado(int id);

    @objid ("ee30e22b-066f-4b5a-9a6f-af7b79ad7744")
    void actualizarEstado(Estado estado);

    @objid ("c8eae38a-f789-4d38-911b-d45b5aad1af6")
    void eliminarEstado(int id);

    @objid ("24cf94ec-11d3-47a1-815e-59ec1ec98d34")
    void listarEstados();

}
