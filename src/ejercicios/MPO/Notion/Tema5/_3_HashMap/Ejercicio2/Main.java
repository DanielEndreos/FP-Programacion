package ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio2;

import ejercicios.MPO.Notion.Tema5._3_HashMap.Ejercicio2.model.Almacen;

public class Main {
    static void main(String[] args) {

        /*
        Objetivo:
            Crear un sistema de inventario que gestione productos usando un HashMap
            donde la clave sea el código del producto y el valor sea la cantidad en stock.

            Requisitos:

            1. Crear un HashMap<String, Integer> para almacenar productos
               (código como clave, cantidad como valor).

            2. Crear metodo: void agregarProducto(String codigo, int cantidad)
               que añada un producto o incremente su cantidad si ya existe.

            3. Crear metodo: boolean venderProducto(String codigo, int cantidad)
               que reduzca la cantidad si hay suficiente stock.

            4. Crear metodo: Integer consultarStock(String codigo)
               que devuelva la cantidad disponible o null si no existe.

            5. Crear metodo: void listarInventario()
               que muestre todos los productos y sus cantidades.

            6. Crear metodo: void listarProductosBajoStock(int minimo)
               que muestre productos con stock menor al mínimo especificado.

            7. Crear metodo: int calcularStockTotal()
               que sume todas las cantidades del inventario.

            8. Crear metodo: String productoConMasStock()
               que devuelva el código del producto con mayor cantidad.

            9. En el main, crear un inventario, realizar operaciones de entrada,
               venta y consultas.

            Ejemplo de salida:

            Sistema de Inventario
            ====================

            Agregando productos...
            Producto PROD001: 50 unidades
            Producto PROD002: 30 unidades
            Producto PROD003: 15 unidades

            Stock total: 95 unidades

            Venta de 20 unidades de PROD001...
            Venta realizada. Stock restante: 30

            Productos con stock bajo (menos de 20 unidades):
            - PROD003: 15 unidades

            Producto con más stock: PROD001 (30 unidades)

            Inventario completo:
            - PROD001: 30 unidades
            - PROD002: 30 unidades
            - PROD003: 15 unidades

         */

        Almacen almacen = new Almacen();
        System.out.println("Sistema de Inventario");
        System.out.println("=====================");
        System.out.println("Agregando productos...");
        almacen.agregarProducto("PROD001", 50);
        almacen.agregarProducto("PROD002", 30);
        almacen.agregarProducto("PROD003", 15);

        System.out.println(" ");
        System.out.println("Stock total: " +almacen.calcularStockTotal()+" unidades");

        System.out.println(" ");
        almacen.venderProducto("PROD001", 20);

        System.out.println(" ");
        almacen.listarProductosBajoStock(20);

        System.out.println(" ");
        System.out.println(almacen.productoConMasStock());

        System.out.println(" ");
        almacen.listarInventario();
    }
}
