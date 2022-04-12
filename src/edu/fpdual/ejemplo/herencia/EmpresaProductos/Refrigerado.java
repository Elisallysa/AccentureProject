package edu.fpdual.ejemplo.herencia.EmpresaProductos;

public class Refrigerado extends AbstractProducto {

    private String consumoPreferente;

    public Refrigerado(String fechaCaducidad, int numLote){
        super(fechaCaducidad, numLote);
        this.consumoPreferente = consumoPreferente;
    }

    @Override
    public void printProducto() {

    }
}
