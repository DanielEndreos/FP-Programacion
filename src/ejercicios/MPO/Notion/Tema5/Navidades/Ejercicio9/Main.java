package ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio9;

import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio4.model.Producto;
import ejercicios.MPO.Notion.Tema5.Navidades.Ejercicio9.model.Tienda;

public class Main {
    static void main(String[] args) {

        /*
         **Objetivo:** Crear una clase `Tienda` que gestione un inventario de productos usando la clase `Producto` del ejercicio anterior.

         **Requisitos:**
         * 1. Usar la clase Producto del Ejercicio 4.
         * 2. Crear una clase Tienda con atributos: nombre (String), productos (array de Producto), numProductos (int).
         * 3. Crear constructor que inicialice el nombre y cree un array de productos con capacidad para 50 productos.
         * 4. Crear metodo boolean agregarProducto(Producto producto) que añada un producto al array si hay espacio.
         * 5. Crear metodo Producto buscarProducto(String codigo) que busque y devuelva un producto por su código (o null si no existe).
         * 6. Crear metodo void listarProductos() que muestre todos los productos del inventario.
         * 7. Crear metodo double calcularValorTotalInventario() que sume el valor de todos los productos.
         * 8. Crear metodo void listarProductosSinStock() que muestre solo los productos sin stock.
         * 9. En el main, crear una tienda, añadir varios productos y probar todos los métodos.
         */
        Tienda t1 = new Tienda("Pepitos de los palotes");
        // Añadir Productos
        System.out.println("");
        System.out.println("--- Añadir Productos ---");
        t1.agregarProducto(new Producto("P001", "Producto 1", 1.50, 10));
        t1.agregarProducto(new Producto("P002", "Producto 2", 2.00, 20));
        t1.agregarProducto(new Producto("P003", "Producto 3", 2.50, 30));
        t1.agregarProducto(new Producto("P004", "Producto 4", 3.00, 15));
        t1.agregarProducto(new Producto("P005", "Producto 5", 3.50, 25));
        t1.agregarProducto(new Producto("P006", "Producto 6", 4.00, 40));
        t1.agregarProducto(new Producto("P007", "Producto 7", 4.50, 12));
        t1.agregarProducto(new Producto("P008", "Producto 8", 5.00, 18));
        t1.agregarProducto(new Producto("P009", "Producto 9", 5.50, 22));
        t1.agregarProducto(new Producto("P010", "Producto 10", 6.00, 35));

        t1.agregarProducto(new Producto("P011", "Producto 11", 6.50, 14));
        t1.agregarProducto(new Producto("P012", "Producto 12", 7.00, 16));
        t1.agregarProducto(new Producto("P013", "Producto 13", 7.50, 28));
        t1.agregarProducto(new Producto("P014", "Producto 14", 8.00, 19));
        t1.agregarProducto(new Producto("P015", "Producto 15", 8.50, 21));
        t1.agregarProducto(new Producto("P016", "Producto 16", 9.00, 11));
        t1.agregarProducto(new Producto("P017", "Producto 17", 9.50, 13));
        t1.agregarProducto(new Producto("P018", "Producto 18", 10.00, 17));
        t1.agregarProducto(new Producto("P019", "Producto 19", 10.50, 27));
        t1.agregarProducto(new Producto("P020", "Producto 20", 11.00, 32));

        t1.agregarProducto(new Producto("P021", "Producto 21", 11.50, 26));
        t1.agregarProducto(new Producto("P022", "Producto 22", 12.00, 24));
        t1.agregarProducto(new Producto("P023", "Producto 23", 12.50, 29));
        t1.agregarProducto(new Producto("P024", "Producto 24", 13.00, 31));
        t1.agregarProducto(new Producto("P025", "Producto 25", 13.50, 34));
        t1.agregarProducto(new Producto("P026", "Producto 26", 14.00, 36));
        t1.agregarProducto(new Producto("P027", "Producto 27", 14.50, 38));
        t1.agregarProducto(new Producto("P028", "Producto 28", 15.00, 41));
        t1.agregarProducto(new Producto("P029", "Producto 29", 15.50, 43));
        t1.agregarProducto(new Producto("P030", "Producto 30", 16.00, 45));

        t1.agregarProducto(new Producto("P031", "Producto 31", 16.50, 47));
        t1.agregarProducto(new Producto("P032", "Producto 32", 17.00, 49));
        t1.agregarProducto(new Producto("P033", "Producto 33", 17.50, 50));
        t1.agregarProducto(new Producto("P034", "Producto 34", 18.00, 52));
        t1.agregarProducto(new Producto("P035", "Producto 35", 18.50, 54));
        t1.agregarProducto(new Producto("P036", "Producto 36", 19.00, 56));
        t1.agregarProducto(new Producto("P037", "Producto 37", 19.50, 58));
        t1.agregarProducto(new Producto("P038", "Producto 38", 20.00, 60));
        t1.agregarProducto(new Producto("P039", "Producto 39", 20.50, 62));
        t1.agregarProducto(new Producto("P040", "Producto 40", 21.00, 64));

        t1.agregarProducto(new Producto("P041", "Producto 41", 21.50, 66));
        t1.agregarProducto(new Producto("P042", "Producto 42", 22.00, 68));
        t1.agregarProducto(new Producto("P043", "Producto 43", 22.50, 70));
        t1.agregarProducto(new Producto("P044", "Producto 44", 23.00, 72));
        t1.agregarProducto(new Producto("P045", "Producto 45", 23.50, 74));
        t1.agregarProducto(new Producto("P046", "Producto 46", 24.00, 76));
        t1.agregarProducto(new Producto("P047", "Producto 47", 24.50, 78));
        t1.agregarProducto(new Producto("P048", "Producto 48", 25.00, 80));
        t1.agregarProducto(new Producto("P049", "Producto 49", 25.50, 82));
        t1.agregarProducto(new Producto("P050", "Producto 50", 26.00, 84));

        t1.agregarProducto(new Producto("P051", "Producto 51", 26.50, 86));

        System.out.println("");
        System.out.println("--- Buscar un producto por código ---");
        t1.buscarProducto("P039").mostrarInfo();

        System.out.println("");
        System.out.println("--- Listar Productos ---");
        t1.listarProductos();

        System.out.println("");
        System.out.println("--- Valor inventario total ---");
        System.out.printf("El valor total del inventario es %.1f€\n",t1.calcularValorTotalInventario());

        System.out.println("");
        System.out.println("--- Listar Productos sin Stock ---");
        t1.listarProductosSinStock();
        t1.buscarProducto("P039").vender(62);

        System.out.println("\n");
        System.out.println("--- Listar Productos sin Stock ---");
        t1.listarProductosSinStock();

        System.out.println("");
        System.out.println("--- Valor inventario total ---");
        System.out.printf("El valor total del inventario es %.1f€\n",t1.calcularValorTotalInventario());


    }

}
