package ejercicios.MPO.Notion.Tema4.Ejercicio9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {
        /*
        **Ejercicio 9 - BiFunction con Colecciones: Fusión de Listas**

        Implementa una BiFunction que reciba dos listas de enteros y devuelva una nueva lista con todos los elementos de ambas listas, pero sin duplicados y ordenada de menor a mayor.
         */

        BiFunction<ArrayList<Integer>, ArrayList<Integer>, ArrayList<Integer>> sortUniqueList = (listaA, listaB) -> {

            return new ArrayList<>(
                    Stream.concat(listaA.stream(), listaB.stream())
                            .distinct()
                            .sorted()
                            .toList()
            );
        };

        ArrayList<Integer> a = new ArrayList<>(List.of(1, 2, 3, 5, 7));
        ArrayList<Integer> b = new ArrayList<>(List.of(3, 4, 5, 6));

        System.out.println(sortUniqueList.apply(a,b));


    }
}
