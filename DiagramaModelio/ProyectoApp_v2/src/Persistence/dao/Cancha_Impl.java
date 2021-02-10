package Persistence.dao;

import Dominio.Entities.Cancha;
import Persistence.models.CanchaModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("60ba62f5-fb66-4a35-be73-ae6a6a97f76b")
public class Cancha_Impl implements ICancha {
    @objid ("3ed64643-92f6-4223-99b4-810073e0f660")
    public CanchaModel cancha;

    @objid ("99682c8c-6b76-405f-8b77-57b4f068ec59")
    public void registrarCancha(Cancha cancha) {
    }

    @objid ("756677ba-7a39-46c0-b97a-be3a98f6a071")
    public void obtenerCancha(String id) {
    }

    @objid ("330a01ee-0bdd-4688-ba6e-d408e9c69a4b")
    public void actualizarCancha(Cancha cancha) {
    }

    @objid ("5333f432-df2a-485e-8518-d3c91d2bd35b")
    public void eliminarCancha(int id) {
    }

    @objid ("7369e54d-6868-4014-89ba-90835fbaa2a2")
    public void listarCanchas() {
    }

}
