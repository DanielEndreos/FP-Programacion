package ejercicios.Programacion.Notion.Exception.Ejercicio3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*
        ## Ejercicio 3: Conversión de texto a número

        Crea un programa que pida al usuario que introduzca un número como texto y lo convierta a entero
        usando Integer.parseInt(). Usa try-catch para capturar la excepción NumberFormatException si el
        usuario introduce algo que no es un número válido. El programa debe seguir pidiendo un número hasta
        que el usuario introduzca uno válido.

        Ejemplo de salida por consola:

        Introduce un número: abc
        Error: Eso no es un número válido. Inténtalo de nuevo.
        Introduce un número: 12.5
        Error: Eso no es un número válido. Inténtalo de nuevo.
        Introduce un número: 42
        Has introducido el número: 42
         */

        Scanner scn = new Scanner(System.in);
        boolean valueOk;
        do{
            valueOk=false;
            System.out.print("Introduce un número: ");
            String num = scn.next();

            try {
                Integer numInt = Integer.parseInt(num);
                System.out.printf("Has introducido el número: %d", numInt);
                valueOk=true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Eso no es número válido. Inténtalo de nuevo.");
            }

        }while(!valueOk);

    }
}
