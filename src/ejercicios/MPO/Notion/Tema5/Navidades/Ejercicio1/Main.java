package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio1;

import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio1.model.Libro;

public class Main {
    static void main(String[] args) {

        /*
         **Objetivo:** Crear una clase `Libro` con atributos básicos y métodos simples.

         **Requisitos:**
         1. Crear una clase Libro con los atributos: titulo (String), autor (String), numPaginas (int), precio (double).
         2. Crear un constructor que inicialice todos los atributos.
         3. Crear getters y setters para todos los atributos.
         4. Crear un método mostrarInfo() que imprima toda la información del libro con formato: "Título: XXX, Autor: XXX, Páginas: XXX, Precio: XXX€"
         5. Crear un método boolean esLibroLargo() que devuelva true si el libro tiene más de 300 páginas.
         6. Crear un método void aplicarDescuento(double porcentaje) que reduzca el precio según el porcentaje dado.
         7. En el main, crear varios objetos Libro y probar todos los métodos.

         Ejemplo salida por consola:

         Libro creado: Título: El Quijote, Autor: Cervantes, Páginas: 863, Precio: 25.50€
         ¿Es un libro largo? true
         Aplicando descuento del 10%...
         Nuevo precio: 22.95€

         */

        Libro libro1 = new Libro("1984", "George Orwell", 328, 9.99);
        Libro libro2 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1216, 24.95);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471, 14.50);
        Libro libro4 = new Libro("Fahrenheit 451", "Ray Bradbury", 249, 8.99);

        System.out.println("\n-----------------------");
        System.out.printf("Libro creado: %s\n", libro1.mostrarInfo());
        System.out.printf("¿Es un libro largo? %s\n", libro1.esLibroLargo());
        libro1.aplicarDescuentos(10.0);
        System.out.printf("Nuevo precio: %.2f€\n\n", libro1.getPrecio());

        System.out.println("-----------------------");
        System.out.printf("Libro creado: %s\n", libro2.mostrarInfo());
        System.out.printf("¿Es un libro largo? %s\n", libro2.esLibroLargo());
        libro2.aplicarDescuentos(2.0);
        System.out.printf("Nuevo precio: %.2f€\n\n", libro2.getPrecio());

        System.out.println("-----------------------");
        System.out.printf("Libro creado: %s\n", libro3.mostrarInfo());
        System.out.printf("¿Es un libro largo? %s\n", libro3.esLibroLargo());
        libro3.aplicarDescuentos(13.0);
        System.out.printf("Nuevo precio: %.2f€\n\n", libro3.getPrecio());

        System.out.println("-----------------------");
        System.out.printf("Libro creado: %s\n", libro4.mostrarInfo());
        System.out.printf("¿Es un libro largo? %s\n", libro4.esLibroLargo());
        libro4.aplicarDescuentos(25.0);
        System.out.printf("Nuevo precio: %.2f€\n\n", libro4.getPrecio());
    }
}
