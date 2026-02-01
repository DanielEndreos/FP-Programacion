package ejercicios.MPO.Notion.Tema4.Ejercicio8;

import java.util.function.Predicate;

public class Main {
    static void main(String[] args) {
        /*
        **Ejercicio 8 - Predicates Compuestos: Filtrado Múltiple**

        Crea varios Predicates para filtrar una lista de números:

        - Números mayores que 50
        - Números pares
        - Números divisibles por 3

        Combínalos usando `and()`, `or()` y `negate()` para crear filtros complejos.
         */

        Predicate<Integer> mayor50 = a -> a > 50;
        Predicate<Integer> numPar = a -> a%2==0;
        Predicate<Integer> divisiblePor3 = a -> a%3==0;


        System.out.println("(Mayor 50, Par y Divisible por 3");
        System.out.println(mayor50.and(numPar).and(divisiblePor3).test(52));
        System.out.println(mayor50.and(numPar).and(divisiblePor3).test(53));
        System.out.println(mayor50.and(numPar).and(divisiblePor3).test(54));

        System.out.println("(Mayor 50, Par y Divisible por 3 (opuesto)");
        System.out.println(mayor50.and(numPar).and(divisiblePor3).negate().test(52));
        System.out.println(mayor50.and(numPar).and(divisiblePor3).negate().test(53));
        System.out.println(mayor50.and(numPar).and(divisiblePor3).negate().test(54));

        System.out.println("(Mayor 50 y Par) o (Divisible por 3)");
        System.out.println(mayor50.and(numPar).or(divisiblePor3).test(52));
        System.out.println(mayor50.and(numPar).or(divisiblePor3).test(53));
        System.out.println(mayor50.and(numPar).or(divisiblePor3).test(54));





    }
}
