package ejercicios.MPO.Notion.Tema4.Ejercicio5;

import java.util.function.BiConsumer;

public class Main {
    static void main(String[] args) {
            /*
            Crea un BiConsumer que reciba un nombre (String) y una edad (Integer) e imprima un mensaje formateado como "Nombre: [nombre], Edad: [edad]". Úsalo para imprimir información de varios estudiantes.
             */

        BiConsumer<String, Integer> infoPrint = (name, edad) -> System.out.printf("Nombre: %s, Edad: %d", name, edad);

        infoPrint.accept("Daniel", 35);

    }
}
