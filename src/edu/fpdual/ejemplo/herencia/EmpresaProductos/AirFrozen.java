package edu.fpdual.ejemplo.herencia.EmpresaProductos;

public class AirFrozen extends Congelado {

    protected String recomendacionesConservacion;

    public AirFrozen(String fechaCaducidad, int numLote, double tempCongelacion, String recomendacionesConservacion) {
        super(fechaCaducidad, numLote, tempCongelacion);
        this.recomendacionesConservacion = recomendacionesConservacion;
    }

}
