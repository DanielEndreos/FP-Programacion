package ejercicios.Programacion.Notion.POO.Ejercicio10.model;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private String fechaPrestamo;

    public static void prestar(Libro libro, Usuario usuario){
        System.out.printf("\n%s intenta tomar prestado %s\n", usuario, libro.getTitulo());
        if (libro.isDisponible()){
            System.out.printf("✓ Préstamo realizado el %s\n", LocalDate.now());
            libro.setDisponible(false);
        } else {
            System.out.println("✗ El libro no está disponible");
        }
    }

    public static void devolver(Libro libro, Usuario usuario){
        System.out.printf("\n%s devuelve %s\n", usuario, libro.getTitulo());
            libro.setDisponible(true);
        System.out.println("✓ Libro devuelto");
    }

}
