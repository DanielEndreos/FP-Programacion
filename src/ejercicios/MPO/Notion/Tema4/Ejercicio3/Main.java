package ejercicios.MPO.Notion.Tema4.Ejercicio3;

import java.util.function.BiFunction;

public class Main {
    static void main(String[] args) {
        /*
        **Ejercicio 3 - BiFunction: Calculadora Básica**

        Crea una BiFunction que reciba dos números enteros y devuelva su suma. Después, crea otras tres BiFunctions para resta, multiplicación y división.
         */

        BiFunction<Integer, Integer, Integer> suma = (x, y) -> x+y;
        BiFunction<Integer, Integer, Integer> resta = (x, y) -> x-y;
        BiFunction<Integer, Integer, Integer> mult = (x, y) -> x*y;
        BiFunction<Double, Double, Double> div = (x, y) -> x/y;


        System.out.println(suma.apply(2,3));
        System.out.println(resta.apply(2,3));
        System.out.println(mult.apply(2,3));
        System.out.println(div.apply(2.0,3.0));




    }
}
