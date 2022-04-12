package edu.fpdual.ejemplo.herencia.EmpresaProductos;
public class NitrogenFrozen extends Congelado {

    protected String recomendacionesConservacion;

    public NitrogenFrozen(String fechaCaducidad, int numLote, double tempCongelacion, String recomendacionesConservacion) {
        super(fechaCaducidad, numLote, tempCongelacion);
        this.recomendacionesConservacion = recomendacionesConservacion;
    }

}
