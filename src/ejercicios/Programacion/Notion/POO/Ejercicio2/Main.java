package ejercicios.Programacion.Notion.POO.Ejercicio2;

import ejercicios.Programacion.Notion.POO.Ejercicio2.model.Persona;

public class Main {
    static void main(String[] args) {

        // Amplía la clase Persona del ejercicio anterior
        // añadiendo métodos getter y setter para los
        // atributos nombre y edad. Crea un objeto, modifica
        // sus valores usando los setters y muestra los datos
        // usando los getters.

        // Ejemplo de salida por consola:
        // Datos iniciales:
        // Nombre: Ana
        // Edad: 30
        //
        // Datos modificados:
        // Nombre: María
        // Edad: 28

        Persona pax = new Persona("Ana", 30);
        System.out.println("Datos iniciales:");
        pax.mostrarDatos();

        pax.setNombre("María");
        pax.setEdad(28);
        System.out.println("\nDatos modificados:");
        pax.mostrarDatos();

    }
}
