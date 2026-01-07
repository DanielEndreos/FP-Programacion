package ejercicios.Programacion.Notion.POO.Ejercicio10;

import ejercicios.Programacion.Notion.POO.Ejercicio10.model.Libro;
import ejercicios.Programacion.Notion.POO.Ejercicio10.model.Prestamo;
import ejercicios.Programacion.Notion.POO.Ejercicio10.model.Usuario;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        // Crea un sistema de biblioteca con las clases: Libro (titulo, autor, ISBN, disponible), Usuario
        // (nombre, numeroSocio) y Prestamo (libro, usuario, fechaPrestamo). Implementa métodos
        // para prestar un libro (si está disponible) y devolverlo. Crea varios libros y usuarios, realiza
        // algunos préstamos y devoluciones.

        // Ejemplo de salida por consola:
        // --- BIBLIOTECA ---
        //Libros disponibles:
        //- Don Quijote (Miguel de Cervantes) ISBN: 001
        //- Cien años de soledad (Gabriel García Márquez) ISBN: 002
        //- 1984 (George Orwell) ISBN: 003
        //
        //Usuario Juan Pérez (Socio 101) intenta tomar prestado Don Quijote
        //✓ Préstamo realizado el 20/12/2025
        //
        //Usuario María López (Socio 102) intenta tomar prestado Don Quijote
        //✗ El libro no está disponible
        //
        //Usuario Juan Pérez devuelve Don Quijote
        //✓ Libro devuelto
        //
        //Libros disponibles ahora:
        //- Don Quijote (Miguel de Cervantes) ISBN: 001
        //- Cien años de soledad (Gabriel García Márquez) ISBN: 002
        //- 1984 (George Orwell) ISBN: 003


        ArrayList<Libro> libros = new ArrayList<>();

        libros.add(new Libro("Don Quijote", "Miguel de Cervantes", 001,true));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez",002, true));
        libros.add(new Libro("1984", "George Orwell",003, true));

        Usuario usuario1 = new Usuario("Juan Pérez", 101);
        Usuario usuario2 = new Usuario("María López", 102);

        System.out.printf("""
                --- BIBLIOTECA ---
                Libros disponibles:
                """);
        libros.forEach(libro -> {if (libro.isDisponible()){System.out.println(libro);}});

        Prestamo.prestar(libros.get(0), usuario1);
        Prestamo.prestar(libros.get(0), usuario2);

        System.out.println("\nLibros disponibles ahora:");
        libros.forEach(libro -> {if (libro.isDisponible()){System.out.println(libro);}});

        Prestamo.devolver(libros.get(0), usuario2);

        System.out.println("\nLibros disponibles ahora:");
        libros.forEach(libro -> {if (libro.isDisponible()){System.out.println(libro);}});
    }
}
