package ejercicios.Programacion.Notion.Exception.Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*
        ## Ejercicio 5: Múltiples excepciones

        Crea un programa que pida al usuario dos números y la operación a realizar (+, -, *, /).
        Usa múltiples bloques catch para manejar diferentes excepciones: ArithmeticException (división por cero),
        NumberFormatException (entrada no numérica) e InputMismatchException (si usas Scanner). Añade un bloque
        finally que siempre muestre el mensaje "Fin del programa".

        Ejemplo de salida por consola:

        Introduce el primer número: 10
        Introduce el segundo número: abc
        Error: Debes introducir números válidos
        Fin del programa

        Introduce el primer número: 15
        Introduce el segundo número: 0
        Introduce la operación (+, -, *, /): /
        Error: No se puede dividir por cero
        Fin del programa

        Introduce el primer número: 8
        Introduce el segundo número: 4
        Introduce la operación (+, -, *, /): *
        Resultado: 8 * 4 = 32
        Fin del programa
         */

        Scanner scn = new Scanner(System.in);
        int numA, numB;
        try{
            System.out.print("Introduce el primer número: ");
            String input = scn.next();
            numA = Integer.parseInt(input);

            System.out.print("Introduce el segundo número: ");
            input = scn.next();
            numB = Integer.parseInt(input);

            System.out.print("Introduce la operación (+, -, *, /): ");
            String operacion = scn.next();

            switch (operacion){
                case "+" ->{System.out.printf("Resultado: %d + %d = %d\n",numA, numB, numA+numB);}
                case "-" ->{System.out.printf("Resultado: %d - %d = %d\n",numA, numB, numA-numB);}
                case "*" ->{System.out.printf("Resultado: %d * %d = %d\n",numA, numB, numA*numB);}
                case "/" ->{System.out.printf("Resultado: %d / %d = %d\n",numA, numB, numA/numB);}
                default -> {
                    System.out.println("Error: no es una operación válida.");
                }
            }
        } catch (ArithmeticException e){
            System.out.printf("Error: No se puede dividir por cero. (%s)\n", e.getMessage());
        } catch (NumberFormatException e){
            System.out.printf("Error: Debes introducir números válidos. (%s)\n", e.getMessage());
        } catch (InputMismatchException e){
            System.out.printf("Error: El dato introducido no coincide con lo solicitado. (%s)\n", e.getMessage());
        }finally {
            System.out.println("Fin del programa.");
        }

    }
}
