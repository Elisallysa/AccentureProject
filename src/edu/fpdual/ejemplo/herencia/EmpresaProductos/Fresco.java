package edu.fpdual.ejemplo.herencia.EmpresaProductos;

public class Fresco extends AbstractProducto {

    private String fechaRecoleccion;

    public Fresco(String fechaCaducidad, int numLote){
        super(fechaCaducidad, numLote);
        this.fechaRecoleccion = fechaRecoleccion;
    }

    @Override
    public void printProducto() {

    }

}