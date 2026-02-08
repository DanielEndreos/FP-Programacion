package ejercicios.Programacion.Notion.Exception.Ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        /*
        ## Ejercicio 2: Array fuera de límites

        Crea un programa que defina un array de 5 elementos con números enteros.
        Pide al usuario una posición del array y muestra el elemento en esa posición.
        Usa try-catch para capturar la excepción ArrayIndexOutOfBoundsException si el
        usuario introduce un índice inválido.

        Ejemplo de salida por consola:
        Array: [10, 20, 30, 40, 50]
        Introduce la posición (0-4): 2
        Elemento en posición 2: 30

        Array: [10, 20, 30, 40, 50]
        Introduce la posición (0-4): 7
        Error: Posición fuera de los límites del array
         */
        int[] numList = {10,20,30,40,50};
        Scanner scn = new Scanner(System.in);

        System.out.println("Array: " + Arrays.toString(numList));
        System.out.print("Introduce la posición (0-4): ");
        int posicion = scn.nextInt();

        try{
            System.out.printf("Elemento en posición %d: %d", posicion, numList[posicion]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Posición fuera de los límites del array.");
        }

    }
}
