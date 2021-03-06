package edu.fpdual.ejemplo.arrays.colecciones;
import java.util.ArrayList;
/* Ejercicio 1
 *  EUC que contenga un método que reciba un arreglo tipo int y que retorne true
 *  (verdadero) si en la primera o en la última posición hay un 6, y falso (false)
 *  si no.
 */
public class Ejercicio1 {

    private ArrayList<Integer> listaNumeros;

    public Ejercicio1() {
        this.listaNumeros = new ArrayList<Integer>();
    }

    public void add(int entero){
        this.listaNumeros.add(entero);
    }

    public Boolean sixAtEnd(){
        if (listaNumeros.get(0)==6 || listaNumeros.get(listaNumeros.size()-1)==6) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[]args) {

        Ejercicio1 lista = new Ejercicio1();

        lista.add(1);
        lista.add(2);
        lista.add(1);

        System.out.println(lista.sixAtEnd());

        Ejercicio1 lista2 = new Ejercicio1();

        lista2.add(6);
        lista2.add(1);
        lista2.add(6);

        System.out.println(lista2.sixAtEnd());

    }

}
