package ejercicios.Programacion.Notion.Exception.Ejercicio4;

import ejercicios.Programacion.Notion.Exception.Ejercicio4.util.EdadInvalidaException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*
        ## Ejercicio 4: Validación de edad

        Crea una clase EdadInvalidaException que herede de Exception.
        Crea un metodo validarEdad(int edad) que lance esta excepción si la edad es menor que 0 o mayor que 120.
        En el metodo main, pide al usuario su edad y usa try-catch para capturar y manejar la excepción personalizada.

        Ejemplo de salida por consola:

        Introduce tu edad: -5
        Error: La edad no puede ser negativa

        Introduce tu edad: 150
        Error: La edad no puede ser mayor que 120

        Introduce tu edad: 25
        Edad válida: 25 años

         */

        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scn.nextInt();

        try{
            validarEdad(edad);
            System.out.printf("Edad válida: %d años", edad);
        }catch (EdadInvalidaException e){
            System.out.printf("Error: %s", e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException{
        if (edad<0) throw new EdadInvalidaException("La edad no puede ser negativa.");
        if (edad>120) throw new EdadInvalidaException("La edad no puede ser mayor que 120");
    }

}
