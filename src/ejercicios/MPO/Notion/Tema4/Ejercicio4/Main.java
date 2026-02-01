package ejercicios.MPO.Notion.Tema4.Ejercicio4;

import java.util.function.BiPredicate;

public class Main {
    static void main(String[] args) {
        /*
        **Ejercicio 4 - BiPredicate: Comparación de Strings**

        Implementa un BiPredicate que reciba dos Strings y determine si tienen la misma longitud. Pruébalo con varios pares de palabras.
        */

        BiPredicate<String, String> mismaLong = (a,b) -> a.length() == b.length();

        System.out.println(mismaLong.test("Juan", "jose")?"Misma longitud":"No tienen la misma longitud");
        System.out.println(mismaLong.test("Pepito de los palotes", "Que ejercicio más chungo...")?"Misma longitud":"No tienen la misma longitud");
        System.out.println(mismaLong.test("Jua2n", "jose")?"Misma longitud":"No tienen la misma longitud");
        System.out.println(mismaLong.test("probando", "mierda")?"Misma longitud":"No tienen la misma longitud");



    }
}
