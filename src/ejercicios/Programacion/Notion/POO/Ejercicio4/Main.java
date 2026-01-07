package ejercicios.Programacion.Notion.POO.Ejercicio4;

import ejercicios.Programacion.Notion.POO.Ejercicio4.model.Libro;

public class Main {
    static void main(String[] args) {
        // Crea una clase Libro con atributos titulo, autor y paginas. Implementa tres constructores:
        // uno sin parámetros (valores por defecto), uno con título y autor, y otro con los tres parámetros.
        // Crea tres objetos usando cada constructor y muestra sus datos.

        //Ejemplo de salida por consola:
        //Libro 1: Sin título, Autor desconocido, 0 páginas
        //Libro 2: Don Quijote, Miguel de Cervantes, 0 páginas
        //Libro 3: Cien años de soledad, Gabriel García Márquez, 471 páginas

        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes");
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);

        System.out.print("\nLibro 1: ");
        libro1.mostrarDatos();
        System.out.print("\nLibro 2: ");
        libro2.mostrarDatos();
        System.out.print("\nLibro 3: ");
        libro3.mostrarDatos();
    }
}
