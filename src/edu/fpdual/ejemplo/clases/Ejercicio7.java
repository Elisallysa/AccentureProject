package edu.fpdual.ejemplo.clases;

/* Ejercicio 7
 import java.util.Scanner;Create three new types of exceptions. Write a class with a
 method that throws all three. In main( ), call the method but only use a single catch
 clause that will catch all three types of exceptions.
*/
import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tres nombres.");

        String nombre1 = s.nextLine();

        String nombre2 = s.nextLine();

        String nombre3 = s.nextLine();

        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add(nombre1);
        nombres.add(nombre2);
        nombres.add(nombre3);


    }

    private static void addName(String name) throws TooLongException {

        try {
            if (name.length()>8) {
                throw new TooLongException("Ese nombre es muy largo");
            } else if (Character.isDigit(name.charAt(0))) {
                throw new NotStringException("Los números no son nombres");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (NotStringException e) {
            e.printStackTrace();
        }

    }


}
class NotStringException extends Throwable {

    private final static String MESSAGE = "Exception personal";

    public NotStringException(String message) {
        super(MESSAGE +": "+message);
    }

}

class TooLongException extends Throwable {

    private final static String MESSAGE = "Exception personal";

    public TooLongException(String message) {
        super(MESSAGE +": "+message);
    }

}

class RepeatedNameException extends Throwable {

    private final static String MESSAGE = "Exception personal";

    public RepeatedNameException(String message) {
        super(MESSAGE +": "+message);
    }

}