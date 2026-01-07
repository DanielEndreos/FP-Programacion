package ejercicios.Programacion.Notion.POO.Ejercicio6;

import ejercicios.Programacion.Notion.POO.Ejercicio6.model.Estudiante;

public class Main {
    static void main(String[] args) {

        // Crea una clase Estudiante con atributos privados nombre, edad y nota. La nota debe estar
        // entre 0 y 10. Implementa el setter de nota validando que esté en el rango correcto (si no lo
        // está, muestra un mensaje de error). Crea un objeto y prueba con diferentes valores.
        //
        // Ejemplo de salida por consola:
        //
        // Estudiante: Laura Fernández
        // Asignando nota 8.5: Correcto
        // Nota actual: 8.5
        //
        // Asignando nota 12: Error - La nota debe estar entre 0 y 10
        // Nota actual: 8.5
        //
        // Asignando nota -3: Error - La nota debe estar entre 0 y 10
        // Nota actual: 8.5

        Estudiante estudiante1 = new Estudiante("Laura Fernández", 30);

        estudiante1.setNota(8.5);
        estudiante1.mostrarNota();
        System.out.println("");

        estudiante1.setNota(12.0);
        estudiante1.mostrarNota();
        System.out.println("");

        estudiante1.setNota(-3);
        estudiante1.mostrarNota();

    }
}
