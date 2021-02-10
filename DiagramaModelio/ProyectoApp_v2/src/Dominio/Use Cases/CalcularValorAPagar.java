package Dominio.Use Cases;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8951e3ea-372f-4146-841b-59263ae8f21d")
public class CalcularValorAPagar {
    @objid ("2f26e620-c1b9-4c21-af6f-8785d45045f6")
    public ICalcularPago iCalcularPago;

    @objid ("9533e23e-6712-43c8-8ea7-d8505b75cfb9")
    public float valorPagar(ICalcularPago valor) {
    }

}
