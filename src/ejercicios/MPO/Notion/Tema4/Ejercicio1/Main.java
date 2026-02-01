package ejercicios.MPO.Notion.Tema4.Ejercicio1;

import java.util.function.Function;

public class Main {
    static void main(String[] args) {
        /*
        **Ejercicio 1 - Lambda Básica: Operación Simple**
        Crea una función lambda que reciba un número entero y devuelva su cuadrado. Pruébala con los números del 1 al 5.
         */

        Function<Integer, Integer> cuadrado = x -> x*x;

        System.out.println(cuadrado.apply(3));

    }
}
