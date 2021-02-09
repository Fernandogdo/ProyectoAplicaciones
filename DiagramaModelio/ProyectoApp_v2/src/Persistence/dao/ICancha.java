package Persistence.dao;

import Dominio.Entities.Cancha;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("39104958-2a8c-426c-8040-af70b74e725f")
public interface ICancha {
    @objid ("2ab41adf-81b5-43d2-a1a2-8e06e724bf7a")
    void registrarCancha(Cancha cancha);

    @objid ("df0aebd6-7c7f-40fa-a220-1c8e332bf4fe")
    void obtenerCancha(String id);

    @objid ("411acc64-9758-48a4-9c01-7d6d9242ee3a")
    void actualizarCancha(Cancha cancha);

    @objid ("ba36f5d5-f917-47dd-a8bb-7ec9a679d2f3")
    void eliminarCancha(int id);

    @objid ("31bd17a3-b2ac-40a3-93fe-641cbb811961")
    void listarCanchas();

}
