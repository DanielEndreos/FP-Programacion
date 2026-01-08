package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio4;

import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio4.model.Producto;

public class Main {
    static void main(String[] args) {

        /*
         **Objetivo:** Crear una clase `Producto` para gestionar el inventario de una tienda.

         **Requisitos:**
         * Crear una clase Producto con atributos: codigo (String), nombre (String), precio (double), stock (int).
         * Crear constructor con todos los parámetros.
         * Crear getters y setters.
         * Crear metodo boolean hayStock() que devuelva true si el stock es mayor que 0.
         * Crear metodo boolean vender(int cantidad) que reduzca el stock si hay suficiente. Devuelve true si la venta es exitosa.
         * Crear metodo void reabastecer(int cantidad) que añada unidades al stock.
         * Crear metodo double calcularValorInventario() que devuelva el valor total del stock (precio × stock).
         * Crear metodo void mostrarInfo() con formato: "Código: XXX, Nombre: XXX, Precio: XXX€, Stock: XXX, Valor total: XXX€"
         * En el main, crear varios productos y simular ventas y reabastecimientos.
         */

        Producto p1 = new Producto("P001", "Teclado mecánico", 79.99, 15);
        Producto p2 = new Producto("P002", "Ratón inalámbrico", 29.95, 40);
        Producto p3 = new Producto("P003", "Monitor 27 pulgadas", 219.00, 8);
        Producto p4 = new Producto("P004", "Disco SSD 1TB", 99.90, 25);

        System.out.printf("Producto creado: ");
        p1.mostrarInfo();
        System.out.printf("Producto creado: ");
        p2.mostrarInfo();
        System.out.printf("Producto creado: ");
        p3.mostrarInfo();
        System.out.printf("Producto creado: ");
        p4.mostrarInfo();

        System.out.println("");
        System.out.println("--------");
        System.out.println("Valor inventario:");
        System.out.printf("El valor de todos los artículos '%s' equivale a %.1f€\n", p1.getNombre(), p1.calcularValorInventario());
        System.out.printf("El valor de todos los artículos '%s' equivale a %.1f€\n", p2.getNombre(), p2.calcularValorInventario());
        System.out.printf("El valor de todos los artículos '%s' equivale a %.1f€\n", p3.getNombre(), p3.calcularValorInventario());
        System.out.printf("El valor de todos los artículos '%s' equivale a %.1f€\n", p4.getNombre(), p4.calcularValorInventario());

        System.out.println("--------");
        System.out.println("Reabasteciendo:");
        p1.reabastecer(10);
        p2.reabastecer(10);
        p3.reabastecer(10);
        p4.reabastecer(10);

        System.out.println("--------");
        System.out.println("Vendiendo:");
        boolean vendido;
        vendido = p1.vender(20);
        System.out.println(vendido?"Vendido correctamente.": "No hay suficientes unidades de venta.");
        vendido = p2.vender(20);
        System.out.println(vendido?"Vendido correctamente.": "No hay suficientes unidades de venta.");
        vendido = p3.vender(30);
        System.out.println(vendido?"Vendido correctamente.": "No hay suficientes unidades de venta.");
        vendido = p4.vender(20);
        System.out.println(vendido?"Vendido correctamente.": "No hay suficientes unidades de venta.");

        System.out.println("--------");
        System.out.println("Stock Actual:");
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
        p4.mostrarInfo();
    }
}
