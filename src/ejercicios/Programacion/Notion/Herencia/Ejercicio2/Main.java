package ejercicios.Programacion.Notion.Herencia.Ejercicio2;

import ejercicios.Programacion.Notion.Herencia.Ejercicio2.model.Coche;

public class Main {
    static void main(String[] args) {

        /*
        Crea una clase Vehiculo con atributos marca y modelo.
        Crea una clase Coche que herede de Vehiculo y añada el atributo numeroPuertas.
        Implementa constructores en ambas clases usando super().
        Crea varios objetos y muestra su información.

        Ejemplo de salida por consola:
        Vehículo: Toyota Corolla
        Coche: Ford Focus, 5 puertas
        Coche: Seat Ibiza, 3 puertas
        */
        Coche coche1 = new Coche("Ford", "Focus", 5);
        Coche coche2 = new Coche("Seat", "Ibiza", 3);
        System.out.println(coche1);
        System.out.println(coche2);

    }
}
