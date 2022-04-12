package edu.fpdual.ejemplo.herencia.EmpresaProductos;

public class WaterFrozen extends Congelado {

    protected String recomendaciones;

    public WaterFrozen(String fechaCaducidad, int numLote, double tempCongelacion){
        super(fechaCaducidad, numLote, tempCongelacion);
        this.recomendaciones = recomendaciones;
    }

}
