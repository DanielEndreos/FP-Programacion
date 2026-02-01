package ejercicios.MPO.Notion.Tema4.Ejercicio6;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    static void main(String[] args) {
        /*
        **Ejercicio 6 - Composición de Funciones: Operaciones Encadenadas**

        Utiliza Function y el metodo `andThen()` para crear una cadena de operaciones: toma un número, súmale 10, multiplícalo por 2, y conviértelo a String. Aplícalo a una lista de números.
         */

        Function<Integer, Integer> suma10 = a -> a + 10;
        Function<Integer, Integer> multPor2 = a -> a * 2;
        Function<Integer, String> convToString = Object::toString;

        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numList.add(i);
        }

        System.out.println("Antes");
        System.out.println("-----");
        numList.forEach(System.out::println);

        System.out.println("Después");
        System.out.println("-------");
        numList.forEach(a -> System.out.println(suma10.andThen(multPor2).andThen(convToString).apply(a)));
    }
}
