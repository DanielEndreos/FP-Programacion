package ejercicios.Programacion.Notion.POO.Ejercicio7;

import ejercicios.Programacion.Notion.POO.Ejercicio7.model.Producto;

public class Main {
    static void main(String[] args) {

        // Crea una clase Producto con atributos nombre, precio y cantidad. Sobrescribe el metodo
        // toString() para mostrar la información del producto de forma legible. Crea varios productos
        // y muéstralos usando System.out.println().

        // Ejemplo de salida por consola:
        // Producto{nombre='Teclado', precio=45.99€, cantidad=10}
        // Producto{nombre='Ratón', precio=25.50€, cantidad=25}
        // Producto{nombre='Monitor', precio=299.99€, cantidad=5}

        Producto keyboard = new Producto("Teclado", 45.99, 10);
        Producto mouse = new Producto("Ratón", 25.50, 25);
        Producto screen = new Producto("Monitor", 299.99, 5);

        System.out.println(keyboard);
        System.out.println(mouse);
        System.out.println(screen);
    }
}
