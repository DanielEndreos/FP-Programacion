package ejercicios.Entornos.TiendaZombie.controller;

import ejercicios.Entornos.TiendaZombie.model.Producto;

import java.util.HashMap;
import java.util.Scanner;

public class Tienda {

    private HashMap<Integer, Producto> itemsTienda;
    private Scanner scn;
    private double descuento;

    public Tienda(Scanner scn) {
        itemsTienda = new HashMap<>();
        descuento = 0.9;
        this.scn = scn;
    }

    public void mostrarMenu() {

        System.out.print("""
                \nLista de Opciones:
                ------------------------
                1. Ver Productos
                2. Comprar Producto
                3. Añadir Producto
                4. Buscar Producto
                5. Informe
                6. Salir
                ------------------------
                Selecciona una opción: """);
    }

    public void addProductoAuto(Producto producto) {
        itemsTienda.put((itemsTienda.size() + 1), producto);
    }

    //Opción 1
    public void mostrarProductos() {
        System.out.println("\nProductos de la tienda: ");
        System.out.println("--------------------------");
        itemsTienda.forEach((indice, producto) -> System.out.println(indice + ". " + producto.mostrarInfo()));
        System.out.println("--------------------------");
    }

    //Opción 2
    public void comprarProducto() {
        mostrarProductos();
        System.out.print("Selecciona el Producto (numero): ");
        int productoId = scn.nextInt();

        if (existeProductoById(productoId)) {
            Producto producto = itemsTienda.get(productoId);

            System.out.printf("Cantidad (%d %s disponibles):  ", producto.getStock(), producto.getNombre());
            int cantidad = scn.nextInt();

            if (producto.getStock() >= cantidad) {
                int cantidadActual = producto.getStock();
                producto.setStock(cantidadActual - cantidad);
                calcularPrecio(producto, cantidad);

            } else {
                System.out.println("No hay unidades suficientes para la venta.");
            }

        } else {
            System.out.println("Este producto no existe o cantidad insuficiente.");
        }

    }

    //Opción 3
    public void addProductoManual() {
        //Introducimos nombre producto
        System.out.print("Nombre: ");
        scn.nextLine();   //Fallo IntelliJ, hay que hacer esto para que funcione
        String nombre = scn.nextLine();

        //Comprobamos si existe el producto
        if (existeProductoByNombre(nombre)) {
            System.out.println("Este producto ya existe.");

            //Obtenemos producto existente
            Producto tempProducto = itemsTienda.values().stream().filter(producto -> producto.getNombre().equalsIgnoreCase(nombre)).findFirst().orElse(null);
            System.out.println(tempProducto.mostrarInfo());

            //Actualizamos campos
            System.out.print("Nuevo Precio: ");
            double precio = scn.nextDouble();
            System.out.print("Añadir Stock: ");
            int stock = scn.nextInt();

            tempProducto.setPrecio(precio);
            tempProducto.setStock(tempProducto.getStock() + stock);

        } else {

            //Solicitamos campos
            System.out.print("Precio: ");
            double precio = scn.nextDouble();
            System.out.print("Stock: ");
            int stock = scn.nextInt();

            //Añadimos producto al HashMap
            addProductoAuto(new Producto(nombre, precio, stock));

            if (existeProductoByNombre(nombre)) {
                System.out.println("El producto se ha añadido correctamente.");
            } else {
                System.out.println("El producto no se ha podido añadir.");
            }
        }
    }

    // Opción 4
    public void buscarProducto() {
        System.out.print("Introduce el nombre a buscar: ");
        scn.nextLine();
        String nombre = scn.nextLine();

        if (existeProductoByNombre(nombre)) {
            itemsTienda.values().stream().filter(producto -> producto.getNombre().equalsIgnoreCase(nombre)).findFirst().ifPresent(p -> System.out.println("Encontrado: " + p.mostrarInfo()));
        } else {
            System.out.println("El producto no existe.");
        }

    }

    // Opción 5
    public void mostrarInforme() {
        double totalValor = 0;
        int totalStock = 0;

        for (Producto prod : itemsTienda.values()) {
            totalValor += prod.getStock() * prod.getPrecio();
            totalStock += prod.getStock();
        }

        System.out.printf("Valor inventario: %.2f€ | unidades: %d\n", totalValor, totalStock);
    }

    //Métodos complementarios
    private boolean existeProductoById(int productoId) {
        if (itemsTienda.get(productoId) != null) {
            return (itemsTienda.get(productoId).getStock() > 0);
        }
        return false;
    }

    private boolean existeProductoByNombre(String nombre) {
        Producto prodBuscado = itemsTienda.values().stream().filter(producto -> producto.getNombre().equalsIgnoreCase(nombre)).findFirst().orElse(null);
        return prodBuscado != null;
    }

    private void calcularPrecio(Producto producto, int cantidad) {
        double total = producto.getPrecio() * cantidad;
        System.out.printf("Total: %.2f€", total > 50.0 ? total * descuento : total);
    }


}
