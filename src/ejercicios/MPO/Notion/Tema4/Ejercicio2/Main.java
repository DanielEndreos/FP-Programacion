package ejercicios.MPO.Notion.Tema4.Ejercicio2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /*
        **Ejercicio 2 - Predicate: Filtrado de Números**

         Utiliza un Predicate para crear una función lambda que determine si un número es par. Aplícala a una lista de números del 1 al 20 y muestra solo los pares.
         /*
         */

        ArrayList<Integer> listaNum = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            listaNum.add(i);
        }

        Predicate<Integer> esPar = n -> n%2==0;

        listaNum.stream().filter(esPar).forEach(System.out::println);

    }
}
