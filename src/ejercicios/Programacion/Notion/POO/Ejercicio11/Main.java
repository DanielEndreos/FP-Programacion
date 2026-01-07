package ejercicios.Programacion.Notion.POO.Ejercicio11;

import ejercicios.Programacion.Notion.POO.Ejercicio11.model.Carrito;
import ejercicios.Programacion.Notion.POO.Ejercicio11.model.Cliente;
import ejercicios.Programacion.Notion.POO.Ejercicio11.model.Producto;

public class Main {
    static void main(String[] args) {
        //Enunciado ejercicio
        /*
        Crea un sistema de tienda online con las clases: Producto (codigo, nombre, precio, stock),
        Cliente (nombre, email, carrito) y Carrito (lista de productos, cantidades).
        métodos para añadir productos al carrito, eliminarlos, calcular el total y finalizar la
        compra (actualizando el stock). Simula una compra completa.

        Ejemplo de salida por consola:

            --- TIENDA ONLINE ---
            Cliente: Ana Martínez (ana@email.com)

            Añadiendo Portátil (899.99€) x1 al carrito... ✓
            Añadiendo Ratón (25.50€) x2 al carrito... ✓
            Añadiendo Teclado (45.99€) x1 al carrito... ✓

            --- CARRITO DE COMPRA ---
            1. Portátil x1 - 899.99€
            2. Ratón x2 - 51.00€
            3. Teclado x1 - 45.99€
            Total: 996.98€

            Eliminando Ratón del carrito... ✓

            --- CARRITO ACTUALIZADO ---
            1. Portátil x1 - 899.99€
            2. Teclado x1 - 45.99€
            Total: 945.98€

            Finalizando compra...
            ✓ Compra realizada con éxito
            Stock actualizado

        */

        //Definición Cliente y Productos
        Cliente cliente1 = new Cliente("Ana Martínez", "ana@email.com");
        Producto producto1 = new Producto("Portátil", 899.99, 100, 001);
        Producto producto2 = new Producto("Ratón", 25.50, 100, 002);
        Producto producto3 = new Producto("Teclado", 45.99, 100, 003);

        // Tienda Online y Nombre Cliente
        System.out.println("--- TIENDA ONLINE ---");
        System.out.println(cliente1);

        // Añadiendo productos a la lista de la compra
        Carrito.addToCarrito(producto1, 1);
        Carrito.addToCarrito(producto2, 2);
        Carrito.addToCarrito(producto3, 1);

        // Mostramos Carrito y eliminamos el producto 2
        Carrito.verCarrito();
        Carrito.rmvFromCarrito(producto2);
        Carrito.verCarrito();

        // Finalizamos Compra
        Carrito.finalizarCompra();

        // Visualizamos el Carrito
        Carrito.verCarrito();

    }
}
