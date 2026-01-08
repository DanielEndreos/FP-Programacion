package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio10;

import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio10.model.Biblioteca;
import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio10.model.LibroHeredado;

public class Main {
    static void main(String[] args) {
        /*
        Objetivo: Crear un sistema de biblioteca que gestione libros y préstamos usando la
        clase Libro y una nueva clase Biblioteca.

        Requisitos:

        1. Modificar la clase Libro del Ejercicio 1 para añadir: isbn (String) y prestado
           (boolean).

        2. Añadir a Libro los métodos:
           - boolean prestar() que marque el libro como prestado si no lo está ya
           - boolean devolver() que marque el libro como no prestado

        3. Crear una clase Biblioteca con atributos:
           - nombre (String)
           - libros (array de Libro)
           - numLibros (int)

        4. Crear métodos en Biblioteca:
           - boolean agregarLibro(Libro libro)
           - Libro buscarLibroPorIsbn(String isbn)
           - boolean prestarLibro(String isbn)
           - boolean devolverLibro(String isbn)
           - void listarLibrosDisponibles()
           - void listarLibrosPrestados()

        5. En el main, crear una biblioteca, añadir libros, realizar préstamos y
           devoluciones, y listar libros por estado.

         */

        boolean agregado;
        LibroHeredado libroToAdd;
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");
        System.out.println("");
        System.out.println(biblioteca);

        System.out.println("");
        System.out.println("--- Agregando Libros ---");
        libroToAdd = new LibroHeredado("El Quijote", "Miguel de Cervantes", 1200, 15, "978-1234567890", false);
        agregado = biblioteca.agregarLibro(libroToAdd);
        if (agregado){
            System.out.printf("Libro agregado: %s\n", libroToAdd.mostrarInfo());
        }

        libroToAdd = new LibroHeredado("Cien Años de Soledad", "Gabriel García Márquez", 480, 19.90, "978-1234567891", false);
        agregado = biblioteca.agregarLibro(libroToAdd);
        if (agregado){
            System.out.printf("Libro agregado: %s\n", libroToAdd.mostrarInfo());
        }

        System.out.println("");
        biblioteca.prestarLibro("978-1234567890");

        System.out.println("");
        System.out.println("Libros disponibles:");
        biblioteca.listarLibrosDisponibles();

        System.out.println("");
        System.out.println("Libros prestados:");
        biblioteca.listarLibrosPrestados();

        System.out.println("");
        biblioteca.devolverLibro("978-1234567890");

        System.out.println("");
        System.out.println("Libros disponibles:");
        biblioteca.listarLibrosDisponibles();

        System.out.println("");
        System.out.println("Libros prestados:");
        biblioteca.listarLibrosPrestados();



    }
}
