package edu.fpdual.ejemplo.herencia.EmpresaProductos;

public class Congelado extends AbstractProducto {

    private double tempCongelacion;

    public Congelado(String fechaCaducidad, int numLote, double tempCongelacion){
        super(fechaCaducidad, numLote);
        this.tempCongelacion = this.tempCongelacion;
    }

    @Override
    public void printProducto() {

    }

}