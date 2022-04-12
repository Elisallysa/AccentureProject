package edu.fpdual.ejemplo.herencia.EmpresaProductos;

abstract class AbstractProducto {

    protected String fechaCaducidad;
    protected int numLote;
    protected int uds;

    public AbstractProducto(String fechaCaducidad, int numLote) {
        super();
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
        this.uds = 0;
    }

    public void setUds(int unidades) {
        this.uds = unidades;
    }

    public abstract void printProducto();
}