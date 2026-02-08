package ejercicios.Programacion.Notion.Exception.Ejercicio1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        /*
        Ejercicio 1: División por cero
        Crea un programa que pida al usuario dos números y realice la división del primero entre el segundo.
        Usa try-catch para capturar la excepción ArithmeticException que ocurre cuando se intenta dividir por cero.
        Muestra un mensaje apropiado si ocurre el error.

        Ejemplo de salida por consola:

        Introduce el primer número: 10
        Introduce el segundo número: 0
        Error: No se puede dividir por cero

        Introduce el primer número: 10
        Introduce el segundo número: 2
        Resultado: 5.0
        */
        Scanner scn = new Scanner(System.in);


        System.out.print("Introduce el primer número: ");
        int numA = scn.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numB = scn.nextInt();

        try{
            double resultado = numA/numB;
            System.out.printf("Resultado: %.1f", resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }

    }
}
